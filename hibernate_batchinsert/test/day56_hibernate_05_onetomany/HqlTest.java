package day56_hibernate_05_onetomany;

import static org.junit.Assert.*;

import java.awt.RadialGradientPaint;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.jdbc.Work;
import org.hibernate.loader.custom.CustomLoader.ScalarResultColumnProcessor;
import org.hibernate.usertype.CompositeUserType;
import org.junit.Test;

import com.qf.entity.Temp;
import com.qf.utils.HibernateUtil;

public class HqlTest {

	/**
	 * 用QBC查询全部
	 */
	@Test
	public void testAdd() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		long start = System.currentTimeMillis();
		Transaction transaction = session.beginTransaction();
		for (int i = 0; i < 30000; i++) {
			Temp temp = new Temp();
			temp.setName("name_" + i);
			session.save(temp);
		}
		transaction.commit();
		long end = System.currentTimeMillis();
		System.out.println(end - start); // 6166上
	}

	@Test
	public void testAdd2() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		long start = System.currentTimeMillis();
		Transaction transaction = session.beginTransaction();
		for (int i = 0; i < 30000; i++) {
			Temp temp = new Temp();
			temp.setName("name_" + i);

			if (i % 100 == 0) {
				session.flush();
				session.clear();
			}
			session.save(temp);
		}
		transaction.commit();
		long end = System.currentTimeMillis();
		System.out.println(end - start); // 4573
	}

	@Test
	public void testAdd3() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Transaction transaction = session.beginTransaction();
		session.doWork(new Work() {
			@Override
			public void execute(Connection connection) throws SQLException {

				long start = System.currentTimeMillis();
				String sql = "insert into t_temp (name) values(?)";
				PreparedStatement prst = connection.prepareStatement(sql);
				for (int i = 1; i <= 30000; i++) {
					prst.setString(1, "name_" + i);
					prst.addBatch();
					if (i % 100 == 0) {
						prst.executeBatch();
						prst.clearBatch();
					}
				}
				// prst.executeUpdate();
				long end = System.currentTimeMillis();
				System.out.println(end - start); // 4495
			}
		});
		transaction.commit();
	}
	
	@Test
	public void testAdd4() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Temp temp = new Temp();
		temp.setName("xxx");
		
		session.save(temp);
		System.out.println("HqlTest.testAdd4()");
		transaction.commit(); // 隐式调用flush()
	}
	
	@Test
	public void testDelete() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("delete from Temp t where t.id > 0");
		
		int executeUpdate = query.executeUpdate(); // 返回的影响的条数
		System.out.println(executeUpdate);
		transaction.commit(); // 隐式调用flush()
		
	}
}

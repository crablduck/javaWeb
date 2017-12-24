package day56_hibernate_05_onetomany;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.loader.custom.CustomLoader.ScalarResultColumnProcessor;
import org.hibernate.usertype.CompositeUserType;
import org.junit.Test;

import com.qf.entity.Customer;
import com.qf.utils.HibernateUtil;

public class HqlTest {

	/**
	 * 测试悲观锁
	 */
	@Test
	public void testQuallAll() {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		// 1.创建第一session
		Session session = sessionFactory.getCurrentSession();

		Transaction transaction = session.beginTransaction();
		
		// select * from t_customer where id = 1 for update
		Customer customer = (Customer)session.get(Customer.class, 1,LockOptions.UPGRADE);

		System.out.println("HqlTest.testQuallAll() :"+customer.getName());
		transaction.commit();

	}
	
	
	
	/**
	 * 测试乐观锁
	 */
	@Test
	public void testQuallAll2() {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		// 1.创建第一session
		Session session = sessionFactory.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		// select * from t_customer where id = 1 for update
		Customer customer = (Customer)session.get(Customer.class,1);
		
		customer.setName("张三1sdfasdfasd");
		
		transaction.commit();
		
	}

}

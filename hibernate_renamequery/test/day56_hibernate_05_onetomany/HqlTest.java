package day56_hibernate_05_onetomany;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.loader.custom.CustomLoader.ScalarResultColumnProcessor;
import org.junit.Test;

import com.qf.entity.Customer;
import com.qf.utils.HibernateUtil;

public class HqlTest {

	/**
	 * 用HQL查询全部
	 */
	@Test
	public void testQuallAll() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Transaction transaction = session.beginTransaction();

		// 调用局部的命名查询
		Query query = session.getNamedQuery("com.qf.entity.Customer.query1");
		
		// 调用全局部的命名查询
//		Query query = session.getNamedQuery("query2");
		
		List<Customer> customerList = query.list();
		for (Customer customer : customerList) {
			System.out.println(customer.getName());
		}
		transaction.commit();

	}
}

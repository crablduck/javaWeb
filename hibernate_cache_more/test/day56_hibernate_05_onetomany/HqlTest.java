package day56_hibernate_05_onetomany;

import static org.junit.Assert.*;

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
import org.hibernate.loader.custom.CustomLoader.ScalarResultColumnProcessor;
import org.hibernate.usertype.CompositeUserType;
import org.junit.Test;

import com.qf.entity.Customer;
import com.qf.utils.HibernateUtil;

public class HqlTest {

	/**
	 * 用QBC查询全部
	 */
	@Test
	public void testQuallAll() {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		// 1.创建第一session
		Session session = sessionFactory.getCurrentSession();

		// 2.开启第一session的事务
		Transaction transaction = session.beginTransaction();
		
		// 3.发送sql查询
		Customer customer = (Customer)session.get(Customer.class, 1);
		System.out.println(customer.getName()+":"+customer.getOrderInfos().size());
		// 4.从缓存中去拿，所以不发送sql
		Customer customer1 = (Customer)session.get(Customer.class, 1);
		
		// 5.提交第一个session的事务
		transaction.commit();
		System.out.println("==================================");
		// 6.新开第二个session
		Session session2 = sessionFactory.openSession();
		
		// 7.开启第二个session的事务
		Transaction transaction2 = session2.beginTransaction();
		
		// 8.第二个sessin去查询
		Customer customer2 = (Customer)session2.get(Customer.class, 1);
		
		System.out.println(customer2.getName()+":"+customer2.getOrderInfos().size());
		// 9.第二个session事务提交
		transaction2.commit();


	}

}

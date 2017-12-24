package day56_hibernate_01_hello;

import static org.junit.Assert.*;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.junit.Test;

import com.qf.entity.User;
import com.qf.utils.HibernateUtil;

public class HelloTest {

	/**
	 * 获取session的两种方式
	 */
	@Test
	public void testSession(){
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		//先判断当成线程中是否有session，如果有就直接返回，没有就创建新的session
		Session session = sessionFactory.getCurrentSession();
		
		Session session2 = sessionFactory.getCurrentSession();
		
		System.out.println(session == session2);
		
		
		// 每次都新建一个session
		Session session3 = sessionFactory.openSession();
		
		Session session4 = sessionFactory.openSession();
		
		System.out.println(session3 == session4);
		
	}

}

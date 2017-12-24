package day56_hibernate_01_hello;

import static org.junit.Assert.*;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.junit.Test;

import com.qf.entity.User;
import com.qf.utils.HibernateUtil;

public class HelloTest {

	@Test
	public void testCache(){
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		// get查询，先到缓存中去找，没有就发送sql去查询，查询完会后放到了缓存里面
		User user = (User)session.get(User.class, 1);
		System.out.println("第一次查询："+user);
		System.out.println("=============================");
		
		// get查询，先到缓存中去找，缓存中可以查到
		User user2 = (User)session.get(User.class, 1);
		System.out.println("第二次查询："+user2);
		System.out.println(user);
	}
	
	
	

	@Test
	public void testCache1(){
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session1 = sessionFactory.getCurrentSession();
		
		Transaction transaction = session1.beginTransaction();
		
		// get查询，先到缓存中去找，没有就发送sql去查询，查询完会后放到了session1里面
		User user = (User)session1.get(User.class, 1);
		System.out.println("第一次查询："+user);
		System.out.println("=============================");
		
		// 新创建一个session2
		Session session2 = sessionFactory.openSession(); 
		// get查询，session2中没有之前的user的对象，所以重新发送sql查询
		User user2 = (User)session2.get(User.class, 1);
		System.out.println("第二次查询："+user2);
		System.out.println(user);
	}
}

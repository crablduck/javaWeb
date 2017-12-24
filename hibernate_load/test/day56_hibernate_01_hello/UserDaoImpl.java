package day56_hibernate_01_hello;

import static org.junit.Assert.*;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.junit.Test;

import com.qf.entity.User;
import com.qf.utils.HibernateUtil;

public class UserDaoImpl {

	
	/**
	 * get&load
	 * 	1)get:
	 * 		a)调用完后立即查询
	 * 		b)查询一个不存在的数据，返回的是一个空
	 *  2)load(懒加载)
	 *  	a)它返回的是一个代理对象，这个对象中id有值
	 *  	b)当调用非id属性的时候就会发送sql去查询
	 *  	c)查询一个不存在的数据直接抛出异常
	 */
	@Test
	public void testGet(){
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		User user = (User)session.get(User.class, 12);
		System.out.println(user);
//		System.out.println(user.getClass());
//		System.out.println(user.getId());
		
		transaction.commit(); // 1.提交事务，2.关闭session
		
//		session.close();
	}
	
	@Test
	public void testLoad(){
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		// load方法返回的是一个代理对象，这个代理对象中只有id有值
		User user = (User)session.load(User.class, 12);
		System.out.println(user.getClass());
		System.out.println(user.getId());
		System.out.println(user.getName());
		
		transaction.commit(); // 1.提交事务，2.关闭session
		
//		session.close();
	}
	
}
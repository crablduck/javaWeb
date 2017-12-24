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
	public void testQuery() {
		
		//1.线获取SessionFactory
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		// 2.由工厂创建session
		Session session = sessionFactory.getCurrentSession();
		
		// 3.开启事务,操作数据库之前必须要开启事务
		Transaction transaction = session.beginTransaction();
		
		// 4.操作数据库
		User user = (User)session.get(User.class, 1);
		
		System.out.println(user);
	}
	
	@Test
	public void testAdd(){
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		// 创建要保存的对象
		User user = new User();
		user.setName("张三");
		user.setPassword("123");
		user.setIsAdmin(1);
		
		// 保存对象
		session.save(user);
		
		// 提交事务
		transaction.commit();
		
	}
	
	@Test
	public void testUpdate(){
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		// 第一次修改，所有属性都改了
//		User user = new User();
//		user.setName("李四");
//		user.setPassword("123456");
//		user.setId(3);
		
		User user = (User)session.get(User.class, 3);
		user.setName("张三");
		
		// 修改数据
		session.update(user);
		
		transaction.commit();
		
	}
	
	@Test
	public void testDelete(){
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		// 先查询对象
		User user = (User)session.get(User.class, 3);
		
		session.delete(user);
		
		transaction.commit();
	}
	

}

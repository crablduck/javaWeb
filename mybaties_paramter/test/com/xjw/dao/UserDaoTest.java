package com.xjw.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.xjw.entity.User;
import com.xjw.utils.SqlSessionFactoryUtils;

public class UserDaoTest {

	@Test
	public void testGetUserById(){
		
			SqlSessionFactory sessionFactory = SqlSessionFactoryUtils.getSessionFactory();
			
			SqlSession session = sessionFactory.openSession();
			
			IUserDao mapper = session.getMapper(IUserDao.class);
			User userById = mapper.getUserById(26);
			
			System.out.println(userById);
	}
	
	@Test
	public void testAdd(){
		
			SqlSessionFactory sessionFactory = SqlSessionFactoryUtils.getSessionFactory();
			
			SqlSession session = sessionFactory.openSession();
			
			IUserDao mapper = session.getMapper(IUserDao.class);
			User user = new User();
			user.setName("xiaoming");
			user.setPassword("123");
			user.setIsAdmin(1);
			int add = mapper.add(user);
			
			session.commit();
			System.out.println(add);
	}
	
	@Test
	public void testUserUpdate(){
		
			SqlSessionFactory sessionFactory = SqlSessionFactoryUtils.getSessionFactory();
			
			SqlSession session = sessionFactory.openSession();
			
			IUserDao mapper = session.getMapper(IUserDao.class);
			User user = new User();
			user.setName("xiaohua");
			user.setPassword("123");
			user.setId(6);
			int update = mapper.update(user);
			
			session.commit();
			System.out.println(update);
	}
	

	@Test
	public void testUserdelete(){
		
			SqlSessionFactory sessionFactory = SqlSessionFactoryUtils.getSessionFactory();
			
			SqlSession session = sessionFactory.openSession();
			
			IUserDao mapper = session.getMapper(IUserDao.class);
			int delete = mapper.delete(6);
			session.commit();
			System.out.println(delete);
	}
	
	@Test
	public void testUserSelect(){
		
			SqlSessionFactory sessionFactory = SqlSessionFactoryUtils.getSessionFactory();
			
			SqlSession session = sessionFactory.openSession();
			
			IUserDao mapper = session.getMapper(IUserDao.class);
			List<User> list = mapper.list();
			for (User user : list) {
				System.out.println(user);
			}
	}
	
	@Test
	public void testUserLogin1(){
		
		SqlSessionFactory sessionFactory = SqlSessionFactoryUtils.getSessionFactory();
		
		SqlSession session = sessionFactory.openSession();
		
		IUserDao mapper = session.getMapper(IUserDao.class);
		
		User user = new User();
		user.setName("xiaohong");
		user.setPassword("321321");
		
		User login = mapper.login1(user);
		
		System.out.println(login);
	}
	
	@Test
	public void testUserLogin2(){
		
		SqlSessionFactory sessionFactory = SqlSessionFactoryUtils.getSessionFactory();
		
		SqlSession session = sessionFactory.openSession();
		
		IUserDao mapper = session.getMapper(IUserDao.class);
		
		
		User login = mapper.login2("xiaohong", "321321");
		
		System.out.println(login);
	}
	
	@Test
	public void testUserLogin3(){
		
		SqlSessionFactory sessionFactory = SqlSessionFactoryUtils.getSessionFactory();
		
		SqlSession session = sessionFactory.openSession();
		
		IUserDao mapper = session.getMapper(IUserDao.class);
		
		
		User login = mapper.login3("xiaohong", "321321");
		
		System.out.println(login);
	}
	
	@Test
	public void testUserLogin4(){
		
		SqlSessionFactory sessionFactory = SqlSessionFactoryUtils.getSessionFactory();
		
		SqlSession session = sessionFactory.openSession();
		
		IUserDao mapper = session.getMapper(IUserDao.class);
		
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("username", "xiaohong");
		map.put("password", "321321");
		
		User login = mapper.login4(map);
		
		System.out.println(login);
	}
	
	@Test
	public void testUserLogin5(){
		
		SqlSessionFactory sessionFactory = SqlSessionFactoryUtils.getSessionFactory();
		
		SqlSession session = sessionFactory.openSession();
		
		IUserDao mapper = session.getMapper(IUserDao.class);
		
		User login = mapper.login5("xiaohong", "321321");
		
		System.out.println(login);
	}
}

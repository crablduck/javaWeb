package com.xjw.dao;

import java.io.IOException;
import java.io.InputStream;
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
			List<User> list = mapper.oneToMang();
			for (User user : list) {
				System.out.println(user);
			}
	}
}

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
	
}

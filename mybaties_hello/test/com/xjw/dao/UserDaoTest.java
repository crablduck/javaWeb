package com.xjw.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.xjw.entity.User;

public class UserDaoTest {

	@Test
	public void testUserDao(){
		
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			//获取构造工厂类
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			//得到sessionfactory工厂
			SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
			//获得session
			SqlSession session = sqlSessionFactory.openSession();
			
			IUserDao mapper = session.getMapper(IUserDao.class);
			User userById = mapper.getUserById(7);
			System.out.println(userById);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

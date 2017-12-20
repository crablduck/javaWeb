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
			
			
			//1. 用全类名.方法名，  加参数    2.session后面的方法是mybaties厂家提供，  这是老且不好用的方法
			User userById = session.selectOne("com.xjw.dao.IUserDao.getUserById", 7);
			
			//1.这是用接口的class对象作为参数获取mapper，进而获取方法进行获取数据。  新方法且好用
//			IUserDao mapper = session.getMapper(IUserDao.class);
//			User userById = mapper.getUserById(7);
			System.out.println(userById);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

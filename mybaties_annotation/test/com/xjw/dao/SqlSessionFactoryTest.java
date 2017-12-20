package com.xjw.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class SqlSessionFactoryTest {
 
	@Test
	public void testSqlSessionFactory(){
		try {
			//将资源文件转化为输入流
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			//获取构造工厂类
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			//得到sessionfactory工厂
			SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
			//获得session
			SqlSession session = sqlSessionFactory.openSession();
			
			System.out.println(session);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

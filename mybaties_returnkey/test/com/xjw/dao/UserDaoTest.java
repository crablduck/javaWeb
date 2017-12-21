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
import com.xjw.entity.Vo;
import com.xjw.utils.SqlSessionFactoryUtils;

public class UserDaoTest {

	//主键回显是通过拼凑到原来的添加的那个user对象， 我们通过调用原来添加的那个对象的getId进行访问
	@Test
	public void testGetUserById(){
		
			SqlSessionFactory sessionFactory = SqlSessionFactoryUtils.getSessionFactory();
			
			SqlSession session = sessionFactory.openSession();
			
			IUserDao mapper = session.getMapper(IUserDao.class);
			
			User user = new User();
			user.setName("xiaohong");
			user.setPassword("nihao");
			int returnKey = mapper.returnKey(user);
			session.commit();
			System.out.println(user.getId());
	}
	
}

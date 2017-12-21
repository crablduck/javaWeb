package com.xjw.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.xjw.entity.Admin;
import com.xjw.entity.User;
import com.xjw.entity.Vo;
import com.xjw.utils.SqlSessionFactoryUtils;

public class UserDaoTest {

	//convertor
	@Test
	public void testGetUserAutoConver(){
		
			SqlSessionFactory sessionFactory = SqlSessionFactoryUtils.getSessionFactory();
			
			SqlSession session = sessionFactory.openSession();
			
			IUserDao mapper = session.getMapper(IUserDao.class);
			
			User user = new User();
			user.setName("xiaohong");
			user.setPassword("nihao");
			user.setIsAdmin(Admin.COMMON);
			int returnKey = mapper.add(user);
			session.commit();
			System.out.println(returnKey);
	}
	
}

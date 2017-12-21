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
	public void testUserLikeSelect(){
		
			SqlSessionFactory sessionFactory = SqlSessionFactoryUtils.getSessionFactory();
			
			SqlSession session = sessionFactory.openSession();
			
			IUserDao mapper = session.getMapper(IUserDao.class);
			
			User user = new User();
			user.setName("xiao");
			List<User> likeQuery = mapper.likeQuery(user);
			
			for (User user2 : likeQuery) {
				System.out.println(user2);
			}
			
	}
}

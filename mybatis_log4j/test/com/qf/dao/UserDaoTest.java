package com.qf.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.qf.entity.User;
import com.qf.utils.MyBatisUtil;

public class UserDaoTest {

	private Logger logger = Logger.getLogger(UserDaoTest.class);
	
	@Test
	public void testGetUserById() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		
		IUserDao userDao = sqlSession.getMapper(IUserDao.class);
		
		User user = userDao.getUserById(9);
		
		sqlSession.close();
		
		
		// ERROR>WARN>IFNO>DEBUG
		logger.debug("debug级别"); // 开发中想看的信息用debug
		logger.debug(user.getName());
		logger.info("info级别"); // 记录系统操作日志
		logger.warn("warn级别"); // 方法没有传递参数
		logger.error("error级别"); // 异常信息
		
		System.out.println("===================");
		
	}

	@Test
	public void testMyBatisUtils() {

		SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
		SqlSessionFactory sqlSessionFactory1 = MyBatisUtil.getSqlSessionFactory();

		System.out.println(sqlSessionFactory == sqlSessionFactory1);
		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println(MyBatisUtil.getSqlSessionFactory());
				}
			}).start();
		}
	}
}

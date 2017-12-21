package com.qf.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qf.entity.User;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(value="classpath:applicationContext.xml")
public class UserDaoTest {
	
	@Autowired
	private IUserDao userDao;

	@Test
	public void testAdd() {
		User user = new User();
		user.setName("xxx123");
		user.setPassword("xxx123");
		int add = userDao.add(user);
		System.out.println(add);
	}
	
	@Test
	public void testUpdate() {
		User user = new User();
		user.setId(16);
		user.setName("AaAA");
		user.setPassword("AAAA");
		int add = userDao.update(user);
		System.out.println(add);
	}
	
	@Test
	public void testGetById() {
		System.out.println(userDao.getById(16));
	}
	
	@Test
	public void testGetCount() {
		System.out.println(userDao.getCount());
	}
	
	@Test
	public void testGetList() {
		List<User> list = userDao.getList(0, 3);
		for (User user : list) {
			System.out.println(user);
		}
	}
	
	@Test
	public void testDelete() {
		System.out.println(userDao.delete(16));
	}

}

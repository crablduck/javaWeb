package com.xjw.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.xjw.entity.User;
import com.xjw.service.IUserService;
import com.xjw.service.impl.UserServiceImpl;

public class UserDaoImplTest {

	private IUserService userService = new UserServiceImpl();
	
	@Test
	public void Addtest() {
		
		User user = new User();
		user.setName("xiaomign");
		user.setPassword("123456");
		
		
		System.out.println(userService.add(user));
	}

}

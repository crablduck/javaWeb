package com.qf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qf.dao.IBaseDao;
import com.qf.dao.IUserDao;
import com.qf.entity.User;
import com.qf.service.IUserService;

//@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService{

	@Autowired
	private IUserDao userDao;
	
	@Override
	protected IBaseDao<User> getBaseDao() {
		return userDao;
	}

}

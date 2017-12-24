package com.qf.service.impl;

import com.qf.dao.IUserDao;
import com.qf.dao.impl.UserDaoImpl;
import com.qf.entity.Page;
import com.qf.entity.User;
import com.qf.service.IUserService;

public class UserServiceImpl implements IUserService {

	private IUserDao userDao = new UserDaoImpl();
	
	@Override
	public int add(User t) {
		return 0;
	}

	@Override
	public int update(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getList(Page page) {

	}

	@Override
	public User getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User login(String name, String password) {
		return userDao.login(name, password);
	}

}

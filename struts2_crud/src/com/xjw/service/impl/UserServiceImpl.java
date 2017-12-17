package com.xjw.service.impl;

import java.util.List;

import com.xjw.dao.IUserDao;
import com.xjw.dao.impl.UserDaoImpl;
import com.xjw.entity.Page;
import com.xjw.entity.User;
import com.xjw.service.IUserService;

public class UserServiceImpl implements IUserService {

	private IUserDao userDao = new UserDaoImpl();
	
	@Override
	public int add(User t) {
		// TODO Auto-generated method stub
		return userDao.add(t);
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return userDao.delete(id);
	}

	@Override
	public int update(User t) {
		// TODO Auto-generated method stub
		return userDao.update(t);
	}

	@Override
	public void list(Page page) {
		//每页的数量
		Integer pageSize = page.getPageSize();
		//1. 起始的坐标为多少
		Integer startIndex = (page.getCurrentPage()-1)*pageSize;
		//2. 查询当前页的页数
		List<User> list = userDao.list(startIndex, pageSize);
		//3. 查询总条数
		int count = userDao.getCount();
		
		//总页数
		Integer totalPage = null;
		if(count%pageSize == 0){
			totalPage = count/pageSize;
		}else{
			totalPage = count/pageSize+1;
		}
		
		page.setList(list);
		page.setTotalPage(totalPage);
		page.setTotalCount(count);
	}

	@Override
	public User ById(Integer id) {
		// TODO Auto-generated method stub
		return userDao.getById(id);
	}

}

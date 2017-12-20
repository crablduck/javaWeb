package com.xjw.dao;

import java.util.List;

import com.xjw.entity.User;

public interface IUserDao {

	User getUserById(Integer id);
	
	int add(User user);
	
	int update(User user);
	
	int delete(Integer id);
	
	List<User> list();
}

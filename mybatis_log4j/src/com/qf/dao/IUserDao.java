package com.qf.dao;

import java.util.List;

import com.qf.entity.User;

public interface IUserDao {

	public User getUserById(Integer id);

	public void add(User user);

	public void delete(Integer id);

	public void update(User user);

	public List<User> getUserList();
}

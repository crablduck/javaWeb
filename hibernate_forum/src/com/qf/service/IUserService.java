package com.qf.service;

import com.qf.entity.User;

public interface IUserService extends IBaseService<User> {

	public User login(String name,String password);

}

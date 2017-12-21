package com.xjw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.xjw.entity.User;

public interface IUserDao {

	List<User> getUserById(User user);
	
	List<User> andIf(User user);
	
	List<User> andWhere(User user);
	
	List<User> andTrim(User user);
	
	List<User> andChoose(User user);
	
	int add(User user);
	
	int update(User user);
	
	int delete(List<Integer> list);
	
	List<User> list();
}

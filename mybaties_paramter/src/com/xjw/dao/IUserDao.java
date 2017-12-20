package com.xjw.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.xjw.entity.User;

public interface IUserDao {

	User getUserById(Integer id);
	
	int add(User user);
	
	int update(User user);
	
	int delete(Integer id);
	
	List<User> list();
	
	User login1(User user);
	
	User login2(String username, String password);
	
	User login3(String username, String password);
	
	User login4(Map<String, String> map);
	
	User login5(@Param("username") String username, @Param("password") String password);
}

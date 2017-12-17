package com.xjw.service;

import java.util.List;

import com.xjw.entity.Page;
import com.xjw.entity.User;

public interface IBaseService<T> {

	public int add(T t);
	
	public int delete(Integer id);
	
	int update(T t);
	
	void list(Page page);
	
	User ById(Integer id);
	
	
	
}

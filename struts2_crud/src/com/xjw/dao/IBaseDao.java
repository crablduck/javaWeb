package com.xjw.dao;

import java.util.List;

import com.xjw.entity.Page;

public interface IBaseDao<T> {

	public int add(T t);
	
	public int delete(Integer id);
	
	public int update(T t);
	
	public List<T> list(Integer startIndex, Integer pageSize);
	
	public T getById(Integer id);
	
	public int getCount();
}

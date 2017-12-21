package com.qf.dao;

import java.util.List;

public interface IBaseDao<T> {

	public int add(T t);
	
	public int update(T t);
	
	public int delete(Integer ID);
	
	public T getById(Integer id);
	
	public int getCount();
	
	public List<T> getList(Integer startIndex,Integer size);
}

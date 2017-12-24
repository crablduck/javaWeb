package com.qf.dao;

import java.util.List;

public interface IBaseDao<T> {
	/**
	 * 添加操作
	 * @param 添加的对象
	 * @return 影响的行数
	 */
	public int add(T t);
	
	/**
	 * 修改操作
	 * @param t 修改对象
	 * @return 影响的行数
	 */
	public int update(T t);
	

	/**
	 * 删除操作
	 * @param id 删除数据的id
	 * @return 影响的行数
	 */
	public int delete(Integer id);
	
	/**
	 * 查询操作
	 * @param pageSize 
	 * @param startIndex 
	 * @return 对象集合
	 */
	public List<T> getList(Integer startIndex, Integer pageSize);
	
	
	/**
	 * 单个对象的查询
	 * @param id 数据id
	 * @return
	 */
	public T getById(Integer id);
	
	/**
	 * 总条数
	 * @return
	 */
	Integer getCount();
}

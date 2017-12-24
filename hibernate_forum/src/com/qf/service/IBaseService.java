package com.qf.service;

import java.util.List;

import com.qf.entity.Page;

public interface IBaseService<T> {

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
	 * @return 分页对象
	 */
	public void getList(Page page);
	
	
	/**
	 * 单个对象的查询
	 * @param id 数据id
	 * @return
	 */
	public T getById(Integer id);
}

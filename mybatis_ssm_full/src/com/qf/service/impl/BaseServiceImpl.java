package com.qf.service.impl;

import org.springframework.beans.factory.annotation.Value;

import com.qf.dao.IBaseDao;
import com.qf.entity.Page;
import com.qf.service.IBaseService;

public abstract class BaseServiceImpl<T> implements IBaseService<T>{

	@Value("${jdbc.url}")
	private String url;
	
	protected abstract IBaseDao<T> getBaseDao(); // 让子类初始化IbaseDao
	
//	protected  IBaseDao<T> getBaseDao(){
//		return null;
//	}; // 让子类初始化IbaseDao
	
	@Override
	public int add(T t) {
		return getBaseDao().add(t);
	}

	@Override
	public int update(T t) {
		return getBaseDao().update(t);
	}

	@Override
	public T getById(Integer id) {
		return getBaseDao().getById(id);
	}

	@Override
	public int delete(Integer id) {
		return getBaseDao().delete(id);
	}

	@Override
	public void getPage(Page page) {
		
		Integer currentPage = page.getCurrentPage();
		Integer pageSize = page.getPageSize();
		
		// 当前页的数据
		page.setList(getBaseDao().getList((currentPage-1)*pageSize, pageSize));
		
		// 总条数
		page.setTotalCount(getBaseDao().getCount());
	}

}

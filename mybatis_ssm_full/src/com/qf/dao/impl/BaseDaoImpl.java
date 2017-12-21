package com.qf.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import com.qf.dao.IBaseDao;

public class BaseDaoImpl<T> extends SqlSessionDaoSupport implements IBaseDao<T> {

	private Class<T> entity;
	
	public BaseDaoImpl() {
		ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();

		Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();

		entity = (Class<T>) actualTypeArguments[0];
	}

	@Override
	public int add(T t) {
		return getSqlSession().insert("com.qf.dao.I" + entity.getSimpleName() + "Dao.add", t);
	}

	@Override
	public int update(T t) {
		return getSqlSession().update("com.qf.dao.I" + entity.getSimpleName() + "Dao.update", t);
	}

	@Override
	public int delete(Integer id) {
		return getSqlSession().delete("com.qf.dao.I" + entity.getSimpleName() + "Dao.delete", id);
	}

	@Override
	public T getById(Integer id) {
		return getSqlSession().selectOne("com.qf.dao.I" + entity.getSimpleName() + "Dao.getById", id);
	}

	@Override
	public int getCount() {
		return getSqlSession().selectOne("com.qf.dao.I" + entity.getSimpleName() + "Dao.getCount");
	}

	@Override
	public List<T> getList(Integer startIndex, Integer size) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("startIndex", startIndex);
		map.put("size", size);
		return getSqlSession().selectList("com.qf.dao.I" + entity.getSimpleName() + "Dao.getList", map);
	}

}

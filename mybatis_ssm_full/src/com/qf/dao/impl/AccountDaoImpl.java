package com.qf.dao.impl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qf.dao.IAccountDao;
import com.qf.entity.Account;

@Repository
public class AccountDaoImpl extends BaseDaoImpl<Account> implements IAccountDao {

	@Override
	public void in(String name, Double moeny) {
		
	}

	@Override
	public void out(String name, Double moeny) {
		
	}
	
	
	@Autowired
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

}

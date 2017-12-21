package com.xjw.dao.impl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xjw.dao.IAccountDao;
import com.xjw.entity.Account;
import com.xjw.mapper.AccountMapper;


@Repository("accountDao")
public class AccountDaoImpl extends SqlSessionDaoSupport implements IAccountDao {
	
	
	@Autowired
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public int add(Account account) {
		// TODO Auto-generated method stub
		AccountMapper mapper = this.getSqlSession().getMapper(AccountMapper.class);
		return mapper.add(account);
	}


}

package com.xjw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjw.dao.IAccountDao;
import com.xjw.entity.Account;
import com.xjw.service.IAccountService;

@Service("accountService")
public class AccountServiceImpl implements IAccountService{
	
	@Autowired
	private IAccountDao accountDao;
	
	@Override
	public int add(Account account) {
		// TODO Auto-generated method stub
		return accountDao.add(account);
	}


}

package com.qf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qf.dao.IAccountDao;
import com.qf.dao.IBaseDao;
import com.qf.entity.Account;
import com.qf.service.IAccountService;

@Service
public class AccountServiceImpl extends BaseServiceImpl<Account> implements IAccountService {

	@Autowired
	private IAccountDao accountDao;

	@Override
	public void transfer(final String inName, final String outName, final Double money) {

		accountDao.out(outName, money);
//		int i = 10/0;
		accountDao.in(inName, money);

	}

	/**
	 * 给父类中的IBaseDao实例化
	 */
	@Override
	protected IBaseDao<Account> getBaseDao() {
		return accountDao;
	}

}

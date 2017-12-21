package com.qf.service;

import com.qf.entity.Account;

public interface IAccountService extends IBaseService<Account> {

	public void transfer(String inName,String outName,Double money);
}

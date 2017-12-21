package com.qf.dao;

import com.qf.entity.Account;

public interface IAccountDao extends IBaseDao<Account> {

	/**
	 * 进账
	 * @param name 用户名
	 * @param moeny 金额
	 */
	public void in(String name,Double moeny);
	
	
	/**
	 * 出账
	 * @param name 用户名
	 * @param moeny 金额
	 */
	public void out(String name,Double moeny);
}

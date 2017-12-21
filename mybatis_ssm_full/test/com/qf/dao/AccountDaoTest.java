package com.qf.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qf.entity.Account;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(value="classpath:applicationContext.xml")
public class AccountDaoTest {

	@Autowired
	private IAccountDao accountDao;
	
	@Test
	public void testGetList() {
		List<Account> list = accountDao.getList(1, 3);
		for (Account account : list) {
			System.out.println(account);
		}
	}

}

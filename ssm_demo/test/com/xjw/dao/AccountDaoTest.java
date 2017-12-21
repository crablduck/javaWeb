package com.xjw.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xjw.entity.Account;
import com.xjw.service.IAccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class AccountDaoTest {

	@Autowired
	private IAccountService accountService;
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAdd(){
		
		Account account = new Account();
		account.setAccount("xiaoming");
		account.setBalance(2000);
		int add = accountService.add(account);
		System.out.println(add);
	}

}

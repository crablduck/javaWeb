package com.xjw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xjw.entity.Account;
import com.xjw.service.IAccountService;

@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private IAccountService accountService;
	
	@RequestMapping("/toAdd")
	public String toAdd(){
		
		return "add";
	}
	
	@RequestMapping("/add")
	public String add(Account account){
		int add = accountService.add(account);
		return "ok";
	}
}

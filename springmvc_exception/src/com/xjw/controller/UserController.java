package com.xjw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		System.out.println("UserController.add()");
		int a = 2/0;
		return "ok";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		System.out.println("UserController.login()");
//		int a = 2/0;
		String name = null;
		name.length();
		return "ok";
	}

}

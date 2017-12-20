package com.xjw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xjw.entity.User;



@Controller
@RequestMapping(value="/user")
public class UserController {

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(User user) {
		System.out.println("UserController.add()");
		System.out.println(user.getName()+":"+user.getBrithday());
		return "ok";
	}
	

}

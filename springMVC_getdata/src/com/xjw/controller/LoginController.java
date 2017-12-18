package com.xjw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xjw.entity.User;

@Controller
public class LoginController {

	@RequestMapping("login")
	public String login(@RequestParam("username") String name, String password){
		System.out.println("name:"+name);
		System.out.println("password:"+password);
		return null;
	}
	
	@RequestMapping("login1")
	public String login1(String username, String password){
		System.out.println("name:"+username);
		System.out.println("password:"+password);
		return null;
	}
	
	@RequestMapping("login2")
	public String login2(User user){
		System.out.println("name:"+user.getUsername());
		System.out.println("password:"+user.getPassword());
		return null;
	}
	
	
}

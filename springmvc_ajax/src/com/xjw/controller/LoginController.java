package com.xjw.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjw.entity.User;

@Controller
public class LoginController {

	@RequestMapping("findStr")
	@ResponseBody
	public String findStr(){
		
		return "this is use jack to encoding";
	}
	
	@ResponseBody
	@RequestMapping("findJson")
	public List<User> findJson(String msg){
		System.out.println(msg);
		List<User> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			User user = new User();
			user.setUsername("username"+i);
			user.setPassword("password"+i);
			list.add(user);
		}
		return list;
	}
	
	
}

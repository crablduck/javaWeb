package com.xjw.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xjw.entity.User;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		System.out.println("UserController.add()");
		return "ok";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(User user, ModelMap map, HttpServletRequest request) {
		System.out.println("UserController.login()");
		if("admin".equals(user.getName()) && "123".equals(user.getPassword())){
			map.put("msg", "登录成功");
			request.getSession().setAttribute("user", user);
			return "ok";
		}
		return "login";
	}

}

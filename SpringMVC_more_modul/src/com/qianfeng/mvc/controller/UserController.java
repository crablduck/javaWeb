package com.qianfeng.mvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/add.do")
	public String add(String msg,HttpServletResponse response) throws IOException{
		System.out.println("user..add");
		return "ok";
	}
	
	@RequestMapping("/del.do")
	public String del(String msg,HttpServletResponse response) throws IOException{
		System.out.println("user..del");
		return "ok";
	}
	
}

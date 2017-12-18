package com.xjw.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{

	@RequestMapping("hello")
	public ModelAndView hello(){
		// TODO Auto-generated method stub
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		
		modelAndView.addObject("msg", "你好");
		return modelAndView;
	}
	
	@RequestMapping("hello1")
	public void hello1(HttpServletRequest request, HttpServletResponse response){
		// TODO Auto-generated method stub
		request.setAttribute("msg", "nihao");
		try {
//			request.getRequestDispatcher("hello.jsp").forward(request, response);
			response.sendRedirect("hello.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("hello2")
	public String hello2(ModelMap map){
		// TODO Auto-generated method stub
		
		map.put("msg", "nihao");
		return "hello";
	}
	
	@RequestMapping("hello3")
	public String hello3(ModelMap map){
		// TODO Auto-generated method stub
		
		map.put("msg", "nihao");
		return "redirect: hello.jsp"; //重定向到jsp
//		return "redirect: hello";  重定向到action
	}

}

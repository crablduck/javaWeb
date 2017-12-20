package com.xjw.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionHandle implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object object,
			Exception exception) {
		// TODO Auto-generated method stub
		
		//输出异常信息
		exception.printStackTrace();
		
		//输出在哪个类出的异常
		System.out.println(object);

		//利用ModelAndView进行跳转页面
		ModelAndView modelAndView = new ModelAndView();
		if(exception instanceof java.lang.ArithmeticException){
			modelAndView.setViewName("error1");
		}else {
			modelAndView.setViewName("error");
		}
		
		return modelAndView;
	}

}

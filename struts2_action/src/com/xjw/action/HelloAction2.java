package com.xjw.action;

import com.opensymphony.xwork2.Action;

public class HelloAction2 implements Action{

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("这个时候可能没有配置method属性");
		return Action.SUCCESS;
	}
	
	public String hello(){
		System.out.println("hello");
		return Action.SUCCESS;
	}
}

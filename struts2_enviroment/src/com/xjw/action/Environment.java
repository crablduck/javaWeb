package com.xjw.action;

import com.opensymphony.xwork2.Action;

public class Environment {

	public String hello(){
		System.out.println("hello");
		System.out.println("nihao");
		return Action.SUCCESS;
	}
}

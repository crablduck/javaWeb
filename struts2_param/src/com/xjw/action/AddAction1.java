package com.xjw.action;

import com.opensymphony.xwork2.Action;
import com.xjw.entity.User;

public class AddAction1 {

	//可以不创建对象， 只创建引用就行， 框架自动帮我们创建
	private User user;

	public String addUser(){
		System.out.println(user.getName()+":"+user.getPassword());
		return Action.SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}

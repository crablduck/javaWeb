package com.xjw.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.xjw.entity.User;

public class AddAction2 implements ModelDriven<User>{
	
	//实现ModelDriver接口就必须得创建对象
	private User user = new User();

	public String addUser(){
		System.out.println(user.getName()+":"+user.getPassword());
		return Action.SUCCESS;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}

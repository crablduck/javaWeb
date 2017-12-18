package com.xjw.action;

import com.opensymphony.xwork2.Action;

public class AddAction{

	private String name;
	private String password;
	
	public String addUser(){
		System.out.println(getName()+":"+getPassword());
		return Action.SUCCESS;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

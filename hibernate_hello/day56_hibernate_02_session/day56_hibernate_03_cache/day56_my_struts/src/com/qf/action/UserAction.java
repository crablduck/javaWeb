package com.qf.action;

public class UserAction {
	
	private String name;
	private String password;

	public String add(){
		System.out.println("UserAction.add()");
		return "error";
	}
	
	public String update(){
		System.out.println("UserAction.update() :"+name+",password:"+password);
		return "success";
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

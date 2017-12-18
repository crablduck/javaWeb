package com.xjw.action;

import com.opensymphony.xwork2.Action;

public class UserAction {

	public String add(){
		System.out.println("enclosing_type.enclosing_method()");
		return Action.SUCCESS;
	}
	
	public String delete(){
		System.out.println("UserAction.delete()");
		return Action.SUCCESS;
	}
	
	public String def(){
		System.out.println("UserAction.def()");
		return Action.SUCCESS;
	}
	
	public String update(){
		System.out.println("UserAction.update()");
		return Action.SUCCESS;
	}
	
	public String query(){
		System.out.println("UserAction.query()");
		return Action.SUCCESS;
	}
}

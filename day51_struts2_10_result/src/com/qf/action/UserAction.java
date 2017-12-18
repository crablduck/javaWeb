package com.qf.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	public String add() {
		System.out.println("UserAction.add()");
		return Action.SUCCESS;
	}
	
	public String def() {
		System.out.println("UserAction.defualt()");
		return Action.SUCCESS;
	}

	public String update() {
		System.out.println("UserAction.update()");
		return Action.SUCCESS;
	}

	public String delete() {
		System.out.println("UserAction.delete()");
		return Action.SUCCESS;
	}

	public String query() {
		System.out.println("UserAction.query()");
		return Action.SUCCESS;
	}

}

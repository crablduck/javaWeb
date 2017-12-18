package com.xjw.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.xjw.entity.User;

public class LoginAction {

	private User user;
	
	public String login(){
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		if("admin".equals(getUser().getName()) && "admin".equals(getUser().getPassword())){
			request.setAttribute("msg", "success");
			return Action.SUCCESS;
		}else{
			request.setAttribute("msg", "failr");
			return Action.INPUT;
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}

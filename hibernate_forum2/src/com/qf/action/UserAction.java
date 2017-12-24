package com.qf.action;

import org.apache.struts2.ServletActionContext;
import org.hibernate.transform.ResultTransformer;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.qf.entity.User;
import com.qf.service.IUserService;
import com.qf.service.impl.UserServiceImpl;

public class UserAction extends ActionSupport{
	
	private User user;
	
	private IUserService userService = new UserServiceImpl();
	
	public String login(){
		user = userService.login(user.getName(), user.getPassword());
		if(user == null){
			ServletActionContext.getRequest().setAttribute("msg", "用户名或密码错误");
			return Action.LOGIN;
		}
		ServletActionContext.getRequest().getSession().setAttribute("user", user);
		return Action.SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}

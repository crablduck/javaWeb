package com.xjw.action;

import org.apache.struts2.ServletActionContext;

import com.xjw.entity.Page;
import com.xjw.entity.User;
import com.xjw.service.IUserService;
import com.xjw.service.impl.UserServiceImpl;

public class UserAction {

	private IUserService userService = new UserServiceImpl();
	
	private User user;
	private Page<User> page = new Page();
	
	public String addUser(){
		int add = userService.add(user);
		return "success";
	}
	
	public String updateUser(){
		int update = userService.update(user);
		return "success";
	}
	
	public String deleteUser(){
		int delete = userService.delete(user.getId());
		return "success";
	}
	
	public String findUserById(){
		User byId = userService.ById(getUser().getId());
		ServletActionContext.getRequest().setAttribute("user", byId);
		return "success";
	}
	
	public String findUserList(){
		
		System.out.println("findUserList");
		
		//查询数据
		userService.list(getPage());
		
		//设置url
		getPage().setUrl("user/findUserList?");
		
		//放到作用域去
		ServletActionContext.getRequest().setAttribute("page", getPage());
		
		return "success";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Page<User> getPage() {
		return page;
	}

	public void setPage(Page<User> page) {
		this.page = page;
	}
}

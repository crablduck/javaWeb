package com.qf.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {

	private Integer id;
	
	private String name;
	
	private String password;
	
	private Date brithday;

	public User(String name, String pasword) {
		this.name = name;
		this.password =pasword;
	}
	public User() {
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public Date getBrithday() {
		return brithday;
	}
	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}
}

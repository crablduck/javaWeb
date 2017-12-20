package com.xjw.entity;

public class User {

	private Integer id;
	
	private String name;
	
	private String password;

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
}

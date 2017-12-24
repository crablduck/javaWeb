package com.qf.entity;

import java.util.Set;

public class Customer {
	private Integer id;
	
	private String name;
	
	private String password;
	
	private String age;
	
	private Set<OrderInfo> orderInfos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Set<OrderInfo> getOrderInfos() {
		return orderInfos;
	}

	public void setOrderInfos(Set<OrderInfo> orderInfos) {
		this.orderInfos = orderInfos;
	}

	
	
	
}

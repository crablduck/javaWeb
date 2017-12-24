package com.qf.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 一对多(一个客户对应多个订单)
 * @author admin
 *
 */
public class Customer {

	private Integer id;
	
	private String name;

	private Set<OrderInfo> orderInfos = new HashSet<OrderInfo>();
	
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

	public Set<OrderInfo> getOrderInfos() {
		return orderInfos;
	}

	public void setOrderInfos(Set<OrderInfo> orderInfos) {
		this.orderInfos = orderInfos;
	}
	
}

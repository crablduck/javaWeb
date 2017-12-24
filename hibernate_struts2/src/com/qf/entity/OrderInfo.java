package com.qf.entity;

/**
 * 多对一(多个订单对应一个客户)
 * @author admin
 *
 */
public class OrderInfo {
	
	private Integer id;
	
	private String orderName;
	
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "OrderInfo [id=" + id + ", orderName=" + orderName + ", customer=" + customer + "]";
	}
	
}

package com.qf.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.qf.entity.Customer;
import com.qf.service.ICustomerService;
import com.qf.service.impl.CustomerServiceImpl;

public class CustomerAction extends ActionSupport{

	private ICustomerService customerService = new CustomerServiceImpl();
	
	public String findCustomerList(){
		List<Customer> customerList = customerService.getList();
		ServletActionContext.getRequest().setAttribute("customerList",customerList);
		return Action.SUCCESS;
	}
}

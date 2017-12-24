package com.qf.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.qf.entity.Customer;
import com.qf.entity.Page;
import com.qf.service.ICustomerService;
import com.qf.service.IOrderService;
import com.qf.service.impl.CustomerServiceImpl;
import com.qf.service.impl.OrderServiceImpl;

public class CustomerAction {

	private ICustomerService customerService = new CustomerServiceImpl();
	private IOrderService orderService = new OrderServiceImpl();
	
	private Page page = new Page();
	private Customer customer;
	
	public String findCustomerList(){
		
		customerService.getList(getPage());
		page.setUrl("customer/findCustomerList?");
		return Action.SUCCESS;
	}
	
	public String findCustomerById(){

		customer = customerService.getById(getCustomer().getId());
		orderService.getOrderListByCustomerId(customer.getId(),page);
		page.setUrl("customer/findCustomerById?customer.id="+customer.getId()+"&");
		return Action.SUCCESS;
		
	}
	
	public String addCustomer(){
		List<Customer> list = customerService.getList();
		for (Customer customer1 : list) {
			if(getCustomer().getName().equals(customer1.getName())){
				ServletActionContext.getRequest().setAttribute("msg", "×¢²áÊ§°Ü");
				return Action.ERROR;
			}
		}
		
		
		customerService.add(customer);
		return Action.SUCCESS;
		
	}
	
	public String login(){
		List<Customer> list = customerService.getList();
		for (Customer customer1 : list) {
			if(getCustomer().getName().equals(customer1.getName()) && getCustomer().getPassword().equals(customer1.getPassword())){
				ServletActionContext.getRequest().setAttribute("msg", "µÇÂ¼³É¹¦");
				ServletActionContext.getRequest().getSession().setAttribute("customer", customer1);
				return Action.SUCCESS;
			}
		}
		ServletActionContext.getRequest().setAttribute("msg", "ÓÃ»§Ãû»òÃÜÂë´íÎó");
		return Action.ERROR;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}

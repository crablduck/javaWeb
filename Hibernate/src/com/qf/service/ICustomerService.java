package com.qf.service;

import java.util.List;

import com.qf.entity.Customer;

public interface ICustomerService extends IBaseService<Customer> {

	List<Customer> getList();

}

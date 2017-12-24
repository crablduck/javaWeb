package com.qf.service.impl;

import java.util.List;

import com.qf.dao.ICustomerDao;
import com.qf.dao.impl.CustomerDaoImpl;
import com.qf.entity.Customer;
import com.qf.service.ICustomerService;

public class CustomerServiceImpl implements ICustomerService {

	private ICustomerDao customerDao = new CustomerDaoImpl();
	
	@Override
	public int add(Customer t) {
		return customerDao.add(t);
	}

	@Override
	public int update(Customer t) {
		return customerDao.update(t);
	}

	@Override
	public int delete(Integer id) {
		return customerDao.delete(id);
	}

	@Override
	public List<Customer> getList() {
		return customerDao.getList();
	}

	@Override
	public Customer getById(Integer id) {
		return customerDao.getById(id);
	}

}

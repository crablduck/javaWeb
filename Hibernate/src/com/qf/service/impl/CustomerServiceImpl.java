package com.qf.service.impl;

import java.util.List;

import com.qf.dao.ICutomerDao;
import com.qf.dao.impl.CustomerDaoImpl;
import com.qf.entity.Customer;
import com.qf.entity.Page;
import com.qf.service.ICustomerService;

public class CustomerServiceImpl implements ICustomerService {

	private ICutomerDao customerDao = new CustomerDaoImpl();
	@Override
	public int add(Customer t) {
		// TODO Auto-generated method stub
		return customerDao.add(t);
	}

	@Override
	public int update(Customer t) {
		// TODO Auto-generated method stub
		return customerDao.update(t);
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return customerDao.delete(id);
	}

	@Override
	public void getList(Page page) {
		// TODO Auto-generated method stub
		Integer currentPage = page.getCurrentPage();
		Integer pageSize = page.getPageSize();
		
		Integer startIndex = (currentPage-1)*pageSize;
		
		List<Customer> list = customerDao.getList(startIndex, pageSize);
		
		Integer count = customerDao.getCount();
		
		Integer totalPage = 0;
		if(count % pageSize == 0 ){
			totalPage = count/pageSize;
		}else{
			totalPage = count/pageSize+1;
		}
		
		page.setList(list);
		page.setTotalCount(count);
		page.setTotalPage(totalPage);
	}

	@Override
	public Customer getById(Integer id) {
		// TODO Auto-generated method stub
		return customerDao.getById(id);
	}

	@Override
	public List<Customer> getList() {
		return customerDao.getList();
		
	}

}

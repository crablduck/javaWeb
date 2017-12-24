package com.qf.dao;

import java.util.List;

import com.qf.entity.Customer;

public interface ICutomerDao extends IBaseDao<Customer> {

	List<Customer> getList(Integer startIndex, Integer pageSize);

	Integer getCount();

	List<Customer> getList();

}

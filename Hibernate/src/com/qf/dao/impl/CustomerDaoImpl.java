package com.qf.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.qf.dao.ICutomerDao;
import com.qf.entity.Customer;
import com.qf.entity.Page;
import com.qf.util.HibernateUtil;

public class CustomerDaoImpl implements ICutomerDao {

	@Override
	public int add(Customer t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Customer t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getList(Page page) {
		// TODO Auto-generated method stub

	}

	@Override
	public Customer getById(Integer id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Customer customer = (Customer)session.get(Customer.class, id);
		return customer;
	}

	@Override
	public List<Customer> getList(Integer startIndex, Integer pageSize) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Query query = session.createQuery("from Customer");
		query.setFirstResult(startIndex);
		query.setMaxResults(pageSize);
		List<Customer> list = query.list();
		return list;
	}

	@Override
	public Integer getCount() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Query query = session.createQuery("select count(c) from Customer c");
		Long uniqueResult = (Long)query.uniqueResult();
		
		
		return Integer.parseInt(uniqueResult.toString());
	}

	@Override
	public List<Customer> getList() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Query query = session.createQuery("from Customer");
		List<Customer> list = query.list();
		return list;
	}

}

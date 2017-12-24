package com.qf.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.qf.dao.ICustomerDao;
import com.qf.entity.Customer;
import com.qf.utils.HibernateUtil;

public class CustomerDaoImpl implements ICustomerDao {

	@Override
	public int add(Customer t) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		int save = (int) session.save(t);
		transaction.commit();

		return save;
	}

	@Override
	public int update(Customer t) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.update(t);
		transaction.commit();
		return 0;
	}

	@Override
	public int delete(Integer id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.delete(session.get(Customer.class, id));
		transaction.commit();
		return 0;
	}

	@Override
	public List<Customer> getList() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Query query = session.createQuery("from Customer");
		List<Customer> list = query.list();
		return list;

	}

	@Override
	public Customer getById(Integer id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = (Customer) session.get(Customer.class, id);
		transaction.commit();
		return customer;
	}

}

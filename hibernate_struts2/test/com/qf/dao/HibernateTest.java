package com.qf.dao;

import static org.junit.Assert.*;

import java.io.Serializable;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.junit.Test;

import com.qf.entity.Customer;
import com.qf.utils.HibernateUtil;

public class HibernateTest {

	@Test
	public void test() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Transaction transaction = session.beginTransaction();
		Customer customer = (Customer) session.get(Customer.class, 1);
		System.out.println(customer.getName());
		transaction.commit();
	}

	@Test
	public void testAdd() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer.setName("zhang");
		int save = (int)session.save(customer);
		System.out.println(save);
		transaction.commit();
	}

}

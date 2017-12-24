package com.qf.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.junit.Test;

import com.qf.entity.Customer;
import com.qf.entity.OrderInfo;
import com.qf.util.HibernateUtil;

public class CustomerDaoImplTest {

	@Test
	public void test() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();

		for (int i = 0; i < 100; i++) {

			Customer customer = new Customer();

			customer.setName("xiaoming_" + i);
			customer.setAge("14");
			customer.setPassword("123" + i);

			session.save(customer);
		}

		transaction.commit();

	}

	@Test
	public void testAdd() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();

		Customer customer = (Customer) session.get(Customer.class, 1);
		for (int i = 0; i < 100; i++) {

			OrderInfo orderInfo = new OrderInfo();
			orderInfo.setOrderName("订单第——" + i);
			orderInfo.setOrderDesc("详情是——" + i);
			orderInfo.setCustomer(customer);

			session.save(orderInfo);
		}

		transaction.commit();

	}

	@Test
	public void testList() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from Customer");
		query.setFirstResult(1);
		query.setMaxResults(3);
		List<Customer> list = query.list();
		transaction.commit();

	}

}

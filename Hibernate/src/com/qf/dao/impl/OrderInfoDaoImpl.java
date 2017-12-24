package com.qf.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.classic.Session;

import com.qf.dao.IOrderInfoDao;
import com.qf.entity.Customer;
import com.qf.entity.OrderInfo;
import com.qf.entity.Page;
import com.qf.util.HibernateUtil;

public class OrderInfoDaoImpl implements IOrderInfoDao {

	@Override
	public int add(OrderInfo t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(OrderInfo t) {
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
	public OrderInfo getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer count() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Query query = session.createQuery("select count(o) from OrderInfo o");
		Long uniqueResult = (Long)query.uniqueResult();
		
		
		return Integer.parseInt(uniqueResult.toString());
	}

	@Override
	public List<OrderInfo> getList(Integer id, Integer startIndex, Integer pageSize) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Query query = session.createQuery("from OrderInfo o where o.customer.id =:id");
		query.setInteger("id", id);
		
		query.setMaxResults(pageSize);
		query.setFirstResult(startIndex);
		
		List<OrderInfo> orderList = query.list();
		
		return orderList;
	}

}

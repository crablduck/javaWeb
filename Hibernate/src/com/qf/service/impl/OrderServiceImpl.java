package com.qf.service.impl;

import java.util.List;

import com.qf.dao.IOrderInfoDao;
import com.qf.dao.impl.OrderInfoDaoImpl;
import com.qf.entity.OrderInfo;
import com.qf.entity.Page;
import com.qf.service.IOrderService;

public class OrderServiceImpl implements IOrderService {

	private IOrderInfoDao orderInfoDao = new OrderInfoDaoImpl();
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
	public void getOrderListByCustomerId(Integer id, Page page) {
		// TODO Auto-generated method stub
		Integer currentPage = page.getCurrentPage();
		Integer pageSize = page.getPageSize();
		Integer startIndex = (currentPage-1)*pageSize;
		
		Integer count = orderInfoDao.count();
		
		List<OrderInfo> list = orderInfoDao.getList(id, startIndex, pageSize);
		Integer totalPage = 0;
		if(count % pageSize == 0){
			
			totalPage = count/pageSize;
		}else{
			
			totalPage = count/pageSize+1;
		}
		
		page.setList(list);
		page.setTotalCount(count);
		page.setTotalPage(totalPage);
	}

}

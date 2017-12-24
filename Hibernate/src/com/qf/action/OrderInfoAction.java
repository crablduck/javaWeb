package com.qf.action;

import com.opensymphony.xwork2.Action;
import com.qf.entity.OrderInfo;
import com.qf.service.IOrderInfoService;
import com.qf.service.impl.OrderInfoService;

public class OrderInfoAction {

	private OrderInfo orderInfo;
	private IOrderInfoService orderInfoService = new OrderInfoService();
	
	public String findOrderInfoList(){
		
		return Action.SUCCESS;
	}
}

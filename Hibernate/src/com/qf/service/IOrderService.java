package com.qf.service;

import com.qf.entity.OrderInfo;
import com.qf.entity.Page;

public interface IOrderService extends IBaseService<OrderInfo>{

	void getOrderListByCustomerId(Integer id, Page page);

}

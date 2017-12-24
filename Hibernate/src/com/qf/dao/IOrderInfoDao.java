package com.qf.dao;

import java.util.List;

import com.qf.entity.OrderInfo;

public interface IOrderInfoDao  extends IBaseDao<OrderInfo>{

	Integer count();

	List<OrderInfo> getList(Integer id, Integer startIndex, Integer pageSize);

}

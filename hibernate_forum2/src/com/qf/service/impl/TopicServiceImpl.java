package com.qf.service.impl;

import java.util.List;

import com.qf.dao.ITopicDao;
import com.qf.dao.impl.TopicDaoImpl;
import com.qf.entity.Page;
import com.qf.entity.Topic;
import com.qf.service.ITopicService;

public class TopicServiceImpl implements ITopicService {

	private ITopicDao topicDao = new TopicDaoImpl();
	
	@Override
	public int add(Topic t) {
		return topicDao.add(t);
	}

	@Override
	public int update(Topic t) {
		return topicDao.update(t);
	}

	@Override
	public int delete(Integer id) {
		return topicDao.delete(id);
	}

	@Override
	public void getList(Page page) {
		
		Integer currentPage = page.getCurrentPage();
		Integer pageSize = page.getPageSize();
		
		// 1.查询总条数
		Integer count = topicDao.getCount();
		
		// 2.查询本业显示的数据
		List<Topic> list = topicDao.getList((currentPage-1)*pageSize,pageSize);
		
		Integer totalPage = 0;
		
		// 3.算出总页数
		if(count % pageSize == 0){
			totalPage = count/pageSize;
		}else{
			totalPage = count/pageSize+1;
		}
		page.setTotalCount(count);
		page.setList(list);
		page.setTotalPage(totalPage);
	}

	@Override
	public Topic getById(Integer id) {
		return topicDao.getById(id);
	}

}

package com.qf.service.impl;

import java.util.List;

import com.qf.dao.IReplyDao;
import com.qf.dao.impl.ReplyDaoImpl;
import com.qf.entity.Page;
import com.qf.entity.Reply;
import com.qf.service.IReplyService;

public class ReplyServiceImpl implements IReplyService {

	private IReplyDao replyDao = new ReplyDaoImpl();
	
	@Override
	public int add(Reply t) {
		return replyDao.add(t);
	}

	@Override
	public int update(Reply t) {
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
	public Reply getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getReplyListByTopicId(Integer id,Page page) {
		
		Integer currentPage = page.getCurrentPage();
		Integer pageSize = page.getPageSize();
		
		Integer count = replyDao.getCount(id);
		
		Integer totalPage =0;
		if(count % pageSize == 0){
			totalPage = count / pageSize;
		}else{
			totalPage = count / pageSize+1;
		}
		
		List<Reply> list = replyDao.getReplyListByTopicId(id,(currentPage-1)*pageSize,pageSize);
		
		page.setList(list);
		page.setTotalCount(count);
		page.setTotalPage(totalPage);;
		
	}

}

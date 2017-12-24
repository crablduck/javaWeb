package com.qf.service;

import java.util.List;

import com.qf.entity.Page;
import com.qf.entity.Reply;

public interface IReplyService extends IBaseService<Reply> {

	void getReplyListByTopicId(Integer id, Page page);
	
}

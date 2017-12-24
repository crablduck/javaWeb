package com.qf.dao;

import java.util.List;

import com.qf.entity.Reply;

public interface IReplyDao extends IBaseDao<Reply> {

	List<Reply> getReplyListByTopicId(Integer id, int startIndex, Integer pageSize);

	int getCount(int topicId);
	
}

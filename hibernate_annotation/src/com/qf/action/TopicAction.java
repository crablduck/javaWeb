package com.qf.action;

import java.util.HashSet;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.qf.entity.Page;
import com.qf.entity.Reply;
import com.qf.entity.Topic;
import com.qf.service.IReplyService;
import com.qf.service.ITopicService;
import com.qf.service.impl.ReplyServiceImpl;
import com.qf.service.impl.TopicServiceImpl;

public class TopicAction extends ActionSupport{

	private ITopicService topicService = new TopicServiceImpl();
	private IReplyService replyService = new ReplyServiceImpl();
	
	private Page page = new Page();
	private Topic topic;
	
	public String findTopicList(){
		topicService.getList(page);
		page.setUrl("topic/findTopicList?");
		return Action.SUCCESS;
	}
	
	public String findTopicById(){
		topic = topicService.getById(topic.getId());
		replyService.getReplyListByTopicId(topic.getId(),page);
		page.setUrl("topic/findTopicById?topic.id="+topic.getId()+"&");
		return Action.SUCCESS;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

}

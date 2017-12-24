package com.qf.entity;

import java.util.Date;

public class Reply {

	private Integer id;
	
	/**
	 * 回复内容
	 */
	private String content;
	
	/**
	 * 回复人
	 */
	private User user;
	
	/**
	 * 回复时间
	 */
	private Date createDate;
	
	/**
	 * 回复到那个帖子里面
	 */
	private Topic topic;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
}

package com.qf.entity;

import java.util.Date;
import java.util.Set;

public class Topic {
	
	private Integer id;
	
	/**
	 * 标题
	 */
	private String  title;
	
	/**
	 * 内容
	 */
	private String content;
	
	/**
	 * 发帖人
	 */
	private User user;
	
	private Set<Reply> replies;
	
	/**
	 * 发帖时间
	 */
	private Date createDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public Set<Reply> getReplies() {
		return replies;
	}

	public void setReplies(Set<Reply> replies) {
		this.replies = replies;
	}

	
}

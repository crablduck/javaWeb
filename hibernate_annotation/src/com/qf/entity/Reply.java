package com.qf.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_reply")
public class Reply {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	/**
	 * 回复内容
	 */
	private String content;
	
	/**
	 * 回复人
	 */
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	/**
	 * 回复时间
	 */
	@Column(name="create_date")
	private Date createDate;
	
	/**
	 * 回复到那个帖子里面
	 */
	@ManyToOne
	@JoinColumn(name="topic_id")
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

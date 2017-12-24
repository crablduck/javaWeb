package com.qf.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="Topic") // name可以不写
@Table(name="t_topic")
public class Topic {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany
	@JoinColumn(name="topic_id")
	private Set<Reply> replies;
	
	/**
	 * 发帖时间
	 */
	@Column(name="create_date")
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

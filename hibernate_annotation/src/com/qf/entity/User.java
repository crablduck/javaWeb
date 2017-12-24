package com.qf.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="User")
@Table(name="t_user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) // 配置注解策略
	private Integer id;
	
	// 如果对象中的属性和列名称一致不用加任何注解
	private String name;
	
	private String password;
	
	@Column(name="is_admin") // 表中的字段名称
	private String isAdmin;
	
	@OneToMany
	@JoinColumn(name="user_id") // 配置外键
	private Set<Topic> topics;

	public String getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set<Topic> getTopics() {
		return topics;
	}

	public void setTopics(Set<Topic> topics) {
		this.topics = topics;
	}
	
}

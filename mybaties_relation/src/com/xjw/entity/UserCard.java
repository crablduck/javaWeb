package com.xjw.entity;

import java.sql.Date;

public class UserCard {

	private Integer id;
	
	private Integer cardNo;
	
	private Date startDate;
	
	private Date endDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCardNo() {
		return cardNo;
	}

	public void setCardNo(Integer cardNo) {
		this.cardNo = cardNo;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "UserCard [id=" + id + ", cardNo=" + cardNo + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
}

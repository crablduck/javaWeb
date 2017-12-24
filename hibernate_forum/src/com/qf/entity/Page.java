package com.qf.entity;

import java.util.List;

public class Page {

	/**
	 * 当前页
	 */
	private Integer currentPage = 1;
	
	/**
	 * 每页显示的行数
	 */
	private Integer pageSize = 3;
	
	/**
	 * 总页数
	 */
	private Integer totalPage;
	
	/**
	 * 总条数
	 */
	private Integer totalCount;
	
	/**
	 * 展示数据
	 */
	private List<?> list;
	
	/**
	 * 查询路径
	 */
	private String url;
	

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	
}

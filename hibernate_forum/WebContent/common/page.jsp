<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%-- <c:if test="${empty page.list}">
			暂无数据
</c:if>
<c:if test="${page.totalCount > 3}">
	<s:a href="%{page.url}page.currentPage=1">首页</s:a>
		<s:if test="page.currentPage > 1">
			<s:a
				href="%{page.url}page.currentPage=%{page.currentPage-1}">上一页</s:a>
		</s:if>
		<s:if test="page.currentPage < page.totalPage">
			<s:a
				href="%{page.url}page.currentPage=%{page.currentPage+1}">下一页</s:a>
		</s:if>
		<s:a
			href="%{#request.page.url}page.currentPage=%{#request.page.totalPage}">尾页</s:a>
</c:if> --%>




<s:if test="%{page.list.isEmpty()}">
	暂无数据
</s:if>
<s:elseif test="%{page.totalCount <= 3}">
	
</s:elseif>
<s:else>
<s:a href="%{#request.page.url}page.currentPage=1">首页</s:a>
		<s:if test="#request.page.currentPage > 1">
			<s:a
				href="%{#request.page.url}page.currentPage=%{#request.page.currentPage-1}">上一页</s:a>
		</s:if>
		<s:if test="#request.page.currentPage < #request.page.totalPage">
			<s:a
				href="%{#request.page.url}page.currentPage=%{#request.page.currentPage+1}">下一页</s:a>
		</s:if>
		<s:a
			href="%{#request.page.url}page.currentPage=%{#request.page.totalPage}">尾页</s:a>
</s:else>

<%-- 
<c:choose>
	<c:when test="${empty page.list}">
			暂无数据
		</c:when>

	<c:otherwise>
		<s:a href="%{#request.page.url}page.currentPage=1">首页</s:a>
		<s:if test="#request.page.currentPage > 1">
			<s:a
				href="%{#request.page.url}page.currentPage=%{#request.page.currentPage-1}">上一页</s:a>
		</s:if>
		<s:if test="#request.page.currentPage < #request.page.totalPage">
			<s:a
				href="%{#request.page.url}page.currentPage=%{#request.page.currentPage+1}">下一页</s:a>
		</s:if>
		<s:a
			href="%{#request.page.url}page.currentPage=%{#request.page.totalPage}">尾页</s:a>
	</c:otherwise>
</c:choose> --%>



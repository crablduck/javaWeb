<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<base href="<%=request.getContextPath()+"/"%>">
</head>
<body>
<s:if test="%{page.list.isEmpty()}">
	暂无数据
</s:if>
<s:elseif test="%{page.totalCount <= 3}">
	
</s:elseif>

<s:else>

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
			href="%{page.url}page.currentPage=%{page.totalPage}">尾页</s:a>
</s:else>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
// 	out.print(request.getContextPath()+"/" );
%>
<base href="<%=request.getContextPath()+"/" %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<!-- <a href="xxxxxxxxxxxxxxx">sfasdfasdfasdf</a> -->
<body>

	<table border="1">
		<tr>
			<th>编号</th>
			<th>标题</th>
			<th>作者</th>
			<th>发帖时间</th>
		</tr>

			<s:iterator value="page.list" var="topic">
				<tr>
					<td><s:property value="#topic.id"/></td>
					<td>
					<s:a href="topic/findTopicById?topic.id=%{#topic.id}"><s:property value="#topic.title"/></s:a>
					</td>
					<td><s:property value="#topic.user.name"/></td>
					<td><s:date name="#topic.createDate" format="yyyy-MM-dd HH:mm:ss"/></td>
				</tr>
			</s:iterator>
	</table>
	
	<s:include value="common/page.jsp"></s:include>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<base href="<%=request.getContextPath()+"/"%>">
</head>
<body>
	<s:a href="user/add.jsp">添加</s:a>
	<table>
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>密码</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${page.list}" var="user">
			<tr>
				<th>${user.id}</th>
				<th>${user.name }</th>
				<th>${user.password }</th>
				<th>
					<a href="user/findUserById?user.id=${user.id}">编辑</a> 
					<a href="user/deleteUser?user.id=${user.id}">删除</a>
				</th>
			</tr>

		</c:forEach>
		
	</table>
	<c:import url="../common/page.jsp"></c:import>
</body>
</html>
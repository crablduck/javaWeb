<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<base href="<%=request.getContextPath()+"/"%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<a href="account/addAcount.jsp" >添加</a>
<table border="1" class="layui-table" >
 <thead>
	<tr>
		<th>编号</th>
		<th>账户</th>
		<th>余额</th>
		<th>操作</th>
	</tr>
</thead>
	<c:forEach items="${page.list}" var="account">
		
		<tr>
			<td>${account.id}</td>
			<td>${account.name}</td>
			<td>${account.balance}</td>
			<td>
				<a href="account/getById/${account.id}/${page.currentPage}">编辑</a>
				<a href="account/delete/${account.id}">删除</a>
			</td>
		</tr>
	</c:forEach>
</table>
	<jsp:include page="../common/page.jsp"></jsp:include>
</body>
</html>
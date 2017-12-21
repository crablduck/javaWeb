<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib uri="/struts-tags" prefix="s"%>     --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=request.getContextPath()+"/"%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="account/update/${currentPage}" method="post">
			<input type="hidden" name="id" value="${account.id}">
		账户:<input type="text" name="name" value="${account.name}"><br>
		余额:<input type="text" name="balance" value="${account.balance}"><br>
	<input type="submit" value="添加">
	</form>
</body>
</html>
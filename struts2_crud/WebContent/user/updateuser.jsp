<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="user/updateUser" method="post">
	<input type="hidden" name="user.id" value="${user.id}">
	姓名：<input type="text" name="user.name" value="${user.name}"/><br>
	密码：<input type="text" name="user.password" value="${user.password}"/><br>
	<input type="submit" value="提交">
</form>

</body>
</html>
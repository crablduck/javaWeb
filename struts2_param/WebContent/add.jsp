<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="add" method="post">
	name:<input type="text" name="name"><br>
	password:<input type="password" name="password"><br>
	<input type="submit" value="提交">
</form>


<br><br><br><br>======用对象实现接口=================<br><br><br>
<form action="add" method="post">
	name:<input type="text" name="user.name"><br>
	password:<input type="password" name="user.password"><br>
	<input type="submit" value="提交">
</form>


<br><br><br><br>======实现ModelDriven接口=================<br><br><br>
<form action="add" method="post">
	name:<input type="text" name="name"><br>
	password:<input type="password" name="password"><br>
	<input type="submit" value="提交">
</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=request.getContextPath()+"/"%>">
<title>Insert title here</title>
</head>
<body>
<form action="account/add" method="post">
	账户名:<input type="text" name="account"/><br/>
	余额:<input type="text" name="balance"/><br/>
	<input type="submit" value="添加">
</form>
</body>
</html>
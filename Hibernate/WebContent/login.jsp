<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<base href="<%=request.getContextPath()+"/"%>">
</head>
<body>
${msg}
	<s:form action="customer/login" method="post">
		<s:textfield label="name" name="customer.name"></s:textfield>
		<s:textfield label="password" name="customer.password"></s:textfield>
		<s:submit value="submit"></s:submit>
	</s:form>
</body>
</html>
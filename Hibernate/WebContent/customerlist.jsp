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
	<s:a href="addcustomer.jsp">添加</s:a>
	<table>
		<tr>
			<th>id</th>
			<th>name</th>
			<th>password</th>
			<th>age</th>
			<th>
				<s:a href="customer/updateCustomer">修改</s:a>
				<s:a href="customer/deleteCustomer">删除</s:a>
			</th>
		</tr>
		
		<s:iterator value="page.list" var="customer">
		 	<tr>
		 	
		 		<th><s:property value="#customer.id" /></th>
		 		<th>
		 		<s:a href="customer/findCustomerById?customer.id=%{#customer.id}"><s:property value="#customer.name" /></s:a>
		 		</th>
		 		<th><s:property value="#customer.password" /></th>
		 		<th><s:property value="#customer.age" /></th>
		 		<th>
		 			<s:a href="customer/updateCustomer">修改</s:a>
					<s:a href="customer/deleteCustomer">删除</s:a>
		 		</th>
		 	</tr>
		</s:iterator>
	</table>
		<s:include value="common/page.jsp"></s:include>
		
</body>
</html>
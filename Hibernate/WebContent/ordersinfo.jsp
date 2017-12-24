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
		<s:a href="customer/addCustomer">添加</s:a>
	<table>
		<tr>
			<th>ID</th>
			<th>订单名字</th>
			<th>订单详情</th>
			<th>用户</th>
			<th>
				操作
			</th>
		</tr>
		
		<s:iterator value="page.list" var="orderInfo">
		 	<tr>
		 	
		 		<th><s:property value="#orderInfo.id" /></th>
		 		<th><s:property value="#orderInfo.orderName" /></th>
		 		<th><s:property value="#orderInfo.orderDesc" /></th>
		 		<th><s:property value="#orderInfo.customer.name" /></th>
		 		<th>
		 			<s:a href="order/updateOrderInfo">修改</s:a>
					<s:a href="order/deleteOrderInfo">删除</s:a>
		 		</th>
		 	</tr>
		</s:iterator>
	</table>
		<s:include value="common/page.jsp"></s:include>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>
			<th>id</th>
			<th>name</th>
			<th>count</th>
		</tr>

			<s:iterator value="#request.customerList" var="customer">
				<tr>
					<td><s:property value="#customer.id"/></td>
					<td><s:property value="#customer.name"/></td>
<%-- 					<td><s:property value="#customer.orderInfos"/></td> --%>
					<s:set name="cus" value="#customer.orderInfos">
					</s:set>
					<td>${fn:length(cus)}</td>
				</tr>
			</s:iterator>

<!-- 		<br><br><br>=================================<br><br><br> -->
<%-- 		<c:forEach items="${customerList}" var="customer"> --%>
<!-- 			<tr> -->
<%-- 				<td>${customer.id}</td> --%>
<%-- 				<td>${customer.name}</td> --%>
<%-- 				<td>${fn:length(customer.orderInfos)}</td> --%>
<!-- 			</tr> -->
<%-- 		</c:forEach> --%>



	</table>
</body>
</html>
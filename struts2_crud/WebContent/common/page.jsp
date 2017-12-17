<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<base href="<%=request.getContextPath()+"/"%>">
</head>
<body>

	<a href="${page.url}page.currentPage = 1">首页</a>
	
	<c:if test="${page.currentPage > 1 }">
		<a href="${page.url}page.currentPage=${page.currentPage-1}">上一页</a>
	</c:if>
	
	<c:if test="${page.currentPage <page.totalPage }">
		<a href="${page.url}page.currentPage=${page.currentPage+1}">下一页</a>
	</c:if>
	
	<a href="${page.url}page.currentPage = ${page.totalPage}">尾页</a>

</body>
</html>
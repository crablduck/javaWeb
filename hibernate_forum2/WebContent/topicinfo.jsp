<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=request.getContextPath()+"/" %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>标题：<s:property value="topic.title"/></h1>
<h4>内容：<s:property value="topic.content"/></h4>
<div>
		<ul>
		<s:iterator value="page.list" var="reply">
			<li>
				内容：<s:property value="#reply.content"/><br>
				时间：<s:date name="#reply.createDate" format="yyyy-MM-dd HH:mm:ss"/><br>
				回复人：<s:property value="#reply.user.name"/><br>
			</li>
			=================================================================<br>
		</s:iterator>
		<s:include value="common/page.jsp"></s:include>
	</ul>
</div>

<div>
	<s:form method="post" action="reply/replyAdd">
		<s:hidden name="reply.topic.id" value="%{topic.id}"/>
		<s:textarea name="reply.content" cols="50" rows="10" />
		<s:submit value="回复" />		
	</s:form>
</div>

</body>
</html>
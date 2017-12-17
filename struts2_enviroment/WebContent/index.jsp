<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2><s:property value="message"/></h2>

<h3>Languages</h3>
<ul>
    <li>
        <s:url id="url" action="HelloWorld">
            <s:param name="request_locale">en</s:param>
        </s:url>
        <s:a class="test" href="%{url}">English</s:a>
    </li>
    <li>
        <s:url id="url" action="HelloWorld">
            <s:param name="request_locale">es</s:param>
        </s:url>
        <s:a href="%{url}">Espanol</s:a>
    </li>
</ul>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.2.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			$.post("ajax.do",{'msg':'ajax data'},function(data){
				$("#msg").html(data);
			})
		});
	});
</script>
</head>
<body>
	<input type="button" id="btn" value="哈哈"/>
	<div id="msg"></div>
</body>
</html>
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
			$.post("json.do",function(data){
				//<!-- [{'username':'zs','password':18},{'username':'ls','password':28}] -->
				var info;
				for(var i=0;i<data.length;i++){
					info+="<tr><td>"+data[i].username+"</td><td>"+data[i].password+"</td></tr>"
				}
				$("#tab").append(info);
			})
		});
	});
</script>
</head>
<body>
	<input type="button" id="btn" value="哈哈"/>
	<!-- [{'username':'zs','age':18},{'username':'ls','age':28}] -->
	<table border="1" id="tab">
		<tr>
			<td>用户名</td>
			<td>密码</td>
		</tr>
	</table>
</body>
</html>
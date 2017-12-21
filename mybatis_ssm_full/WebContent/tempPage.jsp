<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=request.getContextPath()+"/"%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="js/layui/css/layui.css" media="all">
 <script src="js/layui/layui.js"></script>
</head>
 <body>
<div id="test1"></div>
<script>
layui.use('laypage', function(){
  var laypage = layui.laypage;
  
  //执行一个laypage实例
  laypage.render({
	    elem: 'test1'
	    ,count: 100// 总条数
	    ,limit:5 // 每页显示的条数
	    ,layout: ['count', 'prev', 'page', 'next', 'limit', 'skip']
	    ,jump: function(obj, first){
	    	  //obj包含了当前分页的所有参数，比如：
	    	  debugger
	        console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
	        console.log(obj.limit); //得到每页显示的条数
	        
	        //首次不执行
	        if(!first){
	        	console.info("xxxxx");
	        }
	    }
	  });
});
</script>
</body>
</html>
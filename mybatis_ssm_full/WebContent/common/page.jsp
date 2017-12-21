<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <link rel="stylesheet" href="js/layui/css/layui.css" media="all">
 <script src="js/layui/layui.js"></script>

<div id="test1"></div>
<script>
layui.use('laypage', function(){
  var laypage = layui.laypage;
  
  //执行一个laypage实例
  laypage.render({
	    elem: 'test1'
	    ,curr:'${page.currentPage}'
	    ,count: '${page.totalCount}'// 总条数
	    ,limit:'${page.pageSize}' // 每页显示的条数
	    ,layout: ['prev', 'page', 'next','count']
	    ,jump: function(obj, first){
	    	  //obj包含了当前分页的所有参数，比如：
	    	  debugger
	        console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
	        console.log(obj.limit); //得到每页显示的条数
	        
	        //首次不执行
	        if(!first){
	        	location.href="account/getAccountList?currentPage="+obj.curr;
	        }
	    }
	  });
});
</script>

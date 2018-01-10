<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <base href="${pageContext.request.contextPath}/"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <!-- Invalid Stylesheet. This makes stuff look pretty. Remove it if you want the CSS completely valid -->
    <!-- Reset Stylesheet -->
    <link rel="stylesheet" href="resources/css/reset.css" type="text/css"
          media="screen"/>
    <!-- Main Stylesheet -->
    <link rel="stylesheet" href="resources/css/style.css" type="text/css"
          media="screen"/>
    <link rel="stylesheet" href="resources/css/invalid.css" type="text/css"
          media="screen"/>

    <!-- Javascripts -->
    <!-- jQuery -->
    <script type="text/javascript"
            src="resources/scripts/jquery-1.8.3.min.js"></script>

    <!-- jQuery Configuration-->
    <script type="text/javascript"
            src="resources/scripts/simpla.jquery.configuration.js"></script>

    <!-- dialog 弹出框 -->
    <link rel="stylesheet" href="//apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css"/>
    <script type="text/javascript" src="resources/widget/dialog/jquery-ui-1.9.2.custom.min.js"></script>

    <!-- ztree 树形结构 -->
    <link rel="stylesheet" href="resources/widget/zTree/demo.css" type="text/css">
    <link rel="stylesheet" href="resources/widget/zTree/zTreeStyle/zTreeStyle.css"/>
    <script type="text/javascript" src="resources/widget/zTree/jquery.ztree.all.min.js"></script>


</head>
<body>
<div id="main-content">
    <div class="content-box">
        <!-- End .content-box-header -->

        <!-- 需要弹出的框 -->
        <div>
            <div class="content-box-content">
                <div class="tab-content default-tab" id="tab2">
                    <!-- 添加角色的表单 -->
                    <form action="/index/sendEmail" method="post">
                        <fieldset>
                            <!-- Set class to "column-left" or "column-right" on fieldsets to divide the form into columns -->
                            <div>
                                <label><span style="color: red;">*</span>收件人：</label>
                                <div>
                                    <input placeholder="请输入收件人姓名" type="text">
                                    <input type="text" class="class=" text-input small-input" placeholder="请输入收件人地址"
                                    name="sendAddress" >
                                </div>
                                <div class="col-4"></div>
                            </div>

                            <div>
                                <label><span style="color: red;"></span>抄件人：</label>
                                <div>
                                    <input type="text" class="class=" text-input small-input" placeholder="请输入抄件人地址"
                                    name="copysendAddress" >
                                </div>
                                <div class="col-4"></div>
                            </div>

                            <div>
                                <label>标题：</label>
                                <div>
                                    <input type="text" class="class=" text-input small-input" placeholder="请输入标题"
                                    name="title" >
                                </div>
                                <div class="col-4"></div>
                            </div>

                            <div>
                                <label>内容：</label>
                                <div>
                                    <textarea style="width: 500px; height: 300px;" name="content"
                                              placeholder="输入10字以上内容"></textarea>
                                </div>
                                <div class="col-4"></div>
                            </div>


                            <div>
                                <div>
                                    <input class="text-input small-input" type="submit"
                                           value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
                                </div>
                            </div>
                        </fieldset>
                        <div class="clear"></div>
                        <!-- End .clear -->
                    </form>
                </div>
                <!-- End #tab2 -->
            </div>
            <!-- End .content-box-content -->
        </div>

    </div>

    <!-- End #main-content -->
</div>
</body>
</html>
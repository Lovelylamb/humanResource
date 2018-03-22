<%--
  Created by IntelliJ IDEA.
  User: Jesus
  Date: 2018/3/20
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>游客登陆</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <script src="/scripts/jquery-3.3.1.min.js"></script>
    <script src="/scripts/ajax.js"></script>
    <style>
        h1{
            text-align: center;
        }
        body{
            background-image: url("/images/banner.jpg");
            background-repeat: no-repeat;
            background-size: 100% 100%;
            background-attachment: fixed;
        }
    </style>
</head>
<body>
<jsp:include page="visitorRegisterTop.jsp"></jsp:include>
<div class="container">
    <div class="row">
        <h1>游客登陆</h1>
        <form action="/visitor/login.do" method="post" class="form-horizontal" role="form" name="form1">
            <div class="form-group">
                <label class="col-md-3 control-label">用户名:</label>
                <div class="col-md-6">
                    <input type="text" name="visitorName" class="form-control"required>
                </div>
                <div class="col-md-3"></div>
            </div>

            <div class="form-group">
                <label class="col-md-3 control-label">密码:</label>
                <div class="col-md-6">
                    <input type="password" name="visitorPassword" class="form-control" required>
                </div>
                <div class="col-md-3"></div>
            </div>

            <div class="form-group">
                <label class="col-md-3 control-label">记住密码:</label>
                <div class="col-md-6">
                    <input type="checkbox" value="on" name="isremember">
                </div>
                <div class="col-md-3"></div>
            </div>

            <div class="form-group">
                <div class="col-md-3"></div>
                    <div class="col-md-6">
                         <button type="submit" class="btn btn-primary btn-block">登陆</button>
                     </div>
                <div class="col-md-3"></div>
            </div>

        </form>
    </div>
</div>
</body>
</html>

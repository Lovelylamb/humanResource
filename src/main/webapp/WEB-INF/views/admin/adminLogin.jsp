<%--
  Created by IntelliJ IDEA.
  User: Jesus
  Date: 2018/3/20
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员登陆</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <script src="/scripts/jquery-3.3.1.min.js"></script>
    <script src="/scripts/ajax.js"></script>
    <style>
        body{
            background-image: url("/images/banner.jpg");
            background-repeat: no-repeat;
            background-size: 100% 100%;
            background-attachment: fixed;
        }
        input{
            background: rgba(0,0,0,0.3);
            border: none;
        }
        span{
            color: white;
        }
        span:hover{
            color: #2aabd2;
        }
        .navbar-default{
            background-image: url("/images/banner.jpg");
        }
        h1{
            text-align: center;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row">
        <h1>管理员登陆</h1>
        <form action="/admin/login.do" method="post" class="form-horizontal" role="form" name="form1">
            <div class="form-group">
                <label class="col-md-3 control-label">管理员名:</label>
                <div class="col-md-6">
                    <input type="text" name="adminName" class="form-control"required>
                </div>
                <div class="col-md-3"></div>
            </div>

            <div class="form-group">
                <label class="col-md-3 control-label">密码:</label>
                <div class="col-md-6">
                    <input type="password" name="adminPassword" class="form-control" required>
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

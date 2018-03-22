<%--
  Created by IntelliJ IDEA.
  User: Jesus
  Date: 2018/3/21
  Time: 0:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆头</title>
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
        span{
            color: white;
        }
        span:hover{
            color: #2aabd2;
        }
        .navbar-default{
            background-image: url("/images/banner.jpg");
        }
    </style>
</head>
<body>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">阿里巴巴</a>
        </div>
        <ul class="nav navbar-nav navbar-right">
            <li class="active"><a href="/visitorIndex1.do"><span>首页</span> </a></li>
            <li><a href="#"><span>功能介绍</span> </a></li>
            <li><a href="#"><span>关于我们</span> </a></li>
            <li><a href="/visitor/login.view"><span class="glyphicon glyphicon-log-in"> 登录</span></a></li>
        </ul>
    </div>
</nav>
</body>
</html>

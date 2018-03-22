<%--
  Created by IntelliJ IDEA.
  User: Jesus
  Date: 2018/3/17
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户首页面</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <script src="/scripts/jquery-3.3.1.min.js"></script>
    <script src="/scripts/ajax.js"></script>
    <style>
        .navbar-default .navbar-header .container-fluid .navbar-brand li{
            float: left;
            height: inherit;
        }
        .navbar-default .navbar-header{
            line-height: 34px;
        }
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
<%--<div class="alert alert-success">${visitor.visitorName}登陆成功</div>--%>
<div>
    <span>${info}</span>
</div>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">阿里巴巴</a>
        </div>
        <ul class="nav navbar-nav navbar-right">
            <li class="active"><a href="/visitorIndex1.do"><span>首页</span> </a></li>
            <li><a href="#"><span>功能介绍</span> </a></li>
            <li><a href="#"><span>版本套餐</span> </a></li>
            <li><a href="#"><span>最新动态</span> </a></li>
            <li><a href="#"><span>关于我们</span> </a></li>
            <li><a href="#"><span>下载</span> </a></li>
            <li><a href="#"><span>合伙人联盟</span> </a></li>
            <li><a href="/visitor/reg.view"><span class="glyphicon glyphicon-user">注册</span> </a></li>
            <li><a href="/visitor/login.view"><span class="glyphicon glyphicon-log-in">登录</span> </a></li>
        </ul>
    </div>
</nav>
</body>
</html>

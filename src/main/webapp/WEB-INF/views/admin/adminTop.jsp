<%--
  Created by IntelliJ IDEA.
  User: Jesus
  Date: 2018/3/20
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员首页</title>
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
            <a class="navbar-brand" href="/admin/adminTop.view">管理员首页</a>
        </div>
        <ul class="nav navbar-nav navbar-right">
            <%--<li class="dropdown">--%>
                <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown"><span>招聘管理</span></a>--%>
                <%--<ul class="dropdown-menu">--%>
                    <%--<li><a href="#"></a></li>--%>
                <%--</ul>--%>
            <%--</Li>--%>
                <li><a href="/admin/addRecriut.view"><span>招聘管理</span></a></li>
            <li><a href="/department/addDepartment.view"><span>部门管理</span> </a></Li>
            <li><a href="#"><span>职位管理</span> </a></Li>
            <li><a href="#"><span>员工管理</span> </a></Li>
            <li><a href="#"><span>培训管理</span> </a></Li>
            <li><a href="#"><span>薪资管理</span> </a></Li>
            <li><a href="#"><span class="glyphicon glyphicon-user"> 我的信息</span></a></li>
        </ul>
    </div>
</nav>
</body>
</html>












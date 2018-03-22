<%--
  Created by IntelliJ IDEA.
  User: Jesus
  Date: 2018/3/21
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>部门</title>
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
        h1{
            text-align: center;
        }
    </style>
</head>
<body>
<jsp:include page="../admin/adminTop.jsp"></jsp:include>
<h1>部门信息</h1>
<div class="container">
    <div class="row">
        <form action="/department/addDepartment.do" role="form" class="form-horizontal" name="from1">
            <div class="form-group">
                <label class="col-md-3 control-label">部门名:</label>
                <div class="col-md-6">
                    <input type="text" name="departmentName" class="form-control" required>
                </div>
                <div class="col-md-3"></div>
            </div>
            <div class="form-group">
                <div class="col-md-3"></div>
                   <div class="col-md-6" >
                       <button type="submit"class="btn btn-success btn-block">添加部门</button>
                   </div>
                <div class="col-md-3"></div>
            </div>

        </form>
    </div>
</div>

</body>
</html>

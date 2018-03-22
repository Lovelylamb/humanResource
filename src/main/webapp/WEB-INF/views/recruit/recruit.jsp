<%--
  Created by IntelliJ IDEA.
  User: Jesus
  Date: 2018/3/21
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>招聘管理</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <script src="/scripts/jquery-3.3.1.min.js"></script>
    <script src="/scripts/ajax.js"></script>
    <script>
        var deptArray;
        var selectDept;
        var selectPos;
        var posArray;
        window.onload=function () {
            selectDept=document.getElementById("dept_id");
            selectPos=document.getElementById("pos_id");
        }
        $(document).ready(function () {
            $.ajax({
                url: "department/obtainDpartment.do",
                type: "post",
                async: true,
                timeout: 5000,
                dataType: "json",

                success: function (data, textStatus) {
                    deptArray=data;
                    console.log(data);
                    console.log(textStatus);
                    adddept();

                }

            });
        });

        function adddept() {
            selectDept.length=deptArray.length;
//            console.log( selectDept.length);
            for(var i=0;i<deptArray.length;i++){
                selectDept.options[i].value=deptArray[i].departmentName;
                selectDept.options[i].text=deptArray[i].departmentName;
            }
            addpos(0);
        }

        function addpos(index){

            posArray =  deptArray[index].positionTypeList;
            selectPos.length=posArray.length;
            for(var i=0;i<posArray.length; i++){
                selectPos.options[i].value=posArray[i].positionTypeId;
                selectPos.options[i].text=posArray[i].positionTypeName;
            }
        }

    </script>
    <style>
        .form1{
            text-align: center;
        }
        .table{
            text-align: center;
            width: 600px;
            height: 500px;
            font-size: 20px;
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
<jsp:include page="../admin/adminTop.jsp"></jsp:include>
<div class="container">
    <div class="row">
        <div class="col-md-12" id="content">
            <form action="/admin/addRecruit.do" name="form1" class="form1">
                <table class="table table-bordered">
                    <tr class="h4">
                        <td colspan="4" >
                            招聘信息
                        </td>
                    </tr>
                    <tr>
                        <td>部门</td>
                        <td>
                            <select name="departmentId" id="dept_id" onchange="addpos(this.selectedIndex)">
                                <option value="-1">选择部门</option>
                            </select>
                        </td>
                        <td>职位</td>
                        <td>
                            <select name="positionId" id="pos_id">
                                <option value="-1">选择职位</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>招聘人数</td>
                        <td>
                            <input type="text" name="recruitNumber">
                        </td>
                        <td>薪资</td>
                        <td>
                            <input type="text" name="recruitSalary">
                        </td>
                    </tr>
                    <tr>
                        <td>主题</td>
                        <td>
                            <input type="text" name="recruitItem">
                        </td>
                        <td>内容</td>
                        <td>
                            <input type="text" name="recruitContent">
                        </td>
                    </tr>
                    <tr>
                        <td colspan="1">地址</td>
                        <td colspan="3">
                            <input type="text" name="recruitInterviewAddress">
                        </td>
                    </tr>
                    <tr>
                        <td>重置</td>
                        <td><input type="reset" value="重置"></td>
                        <td>提交</td>
                        <td><input type="submit" value="提交"></td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</div>
</body>
</html>

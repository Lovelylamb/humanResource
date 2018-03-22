<%--
  Created by IntelliJ IDEA.
  User: Jesus
  Date: 2018/3/17
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎来到注册中心</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <script src="/scripts/jquery-3.3.1.min.js"></script>
    <script src="/scripts/ajax.js"></script>
    <script>
        var xmlhttp;
        var mydate;
        var v_name;
        var v_trueName;
        var v_email;
        var v_phone;
        var v_password;
        var v_nextPassword;
        var v_address;
        var v_age;
       function validateName(value) {
           v_name =document.getElementById("v-name");

           if(window.XMLHttpRequest){
               xmlhttp=new XMLHttpRequest();
           }else{
               xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
           }
           //打开连接
           xmlhttp.open("GET","validateName.do?VisitorName="+value,true);
           //发送请求
           xmlhttp.send();
           //回掉结果
           xmlhttp.onreadystatechange=result;

           function result() {
               if(xmlhttp.readyState==4 && xmlhttp.status==200){
                   mydate=xmlhttp.responseText;
                   showValidate();
               }
           }
           function showValidate() {
               if(mydate.trim()=="is_exist"){
                   v_name.innerHTML="用户名已存在";
                   return false;
               }else{
                   v_name.innerHTML="";
                   return true;
               }
           }
       }


       function checkTrueName(value) {
           v_trueName=document.getElementById("v-trueName");
           if(value==null){
               v_trueName.innerHTML="姓名不能为空";
               return false;
           }
           return true;
       }

       function checkPassword(value) {
           v_password=document.getElementById("v-password");
           var reg=/^[a-z0-9_-]{6,18}$/;
           var r=reg.test(value);
           if(r){
               v_password.className="glyphicon glyphicon-ok";
               return true;
           }else{
               v_password.className="glyphicon glyphicon-remove";
               return false;
           }
       }
        function checkNextPassword(value) {
            v_nextPassword=document.getElementById("v-nextPassword");
            var password  =document.form1.visitorPassword.value;
            var r=value.trim()==password.trim();
            if(r){
                v_nextPassword.className ="glyphicon glyphicon-ok";
                return true;
            }else{
                v_nextPassword.className="glyphicon glyphicon-remove";
                return false;
            }
        }

       function validateEmail(value) {
           v_email=document.getElementById("v-email");
           //创建请求对象
           if (window.XMLHttpRequest) {
               xmlhttp = new XMLHttpRequest();
           } else {
               xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
           }
           //打开链接
           xmlhttp.open("GET", "validateEmail.do?VistiorEmail=" + value, true);
           //发送请求
           xmlhttp.send();
           //回掉结果
           xmlhttp.onreadystatechange = result1;

           function result1() {
               if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                   mydate = xmlhttp.responseText;
                   showValidate1();
               }
           }
           function showValidate1() {
               //如果存在返回 is_exist
               //如果不存在返回 is_not_exist
               if(mydate.trim()=="is_exist"){
                   v_email.innerHTML="邮箱已存在"
                   return false;
               }else{
                   v_email.innerHTML="";
                   return true;
               }
           }
       }
       function validatePhone(value) {
           v_phone=document.getElementById("v-phone");
           if(window.XMLHttpRequest){
               xmlhttp=new XMLHttpRequest();
           }else{
               xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
           }
           xmlhttp.open("GET","validatePhone.do?VisitorPhone="+value,true);
           xmlhttp.send();
           xmlhttp.onreadystatechange=result;

           function result() {
               if(xmlhttp.readyState==4 &&xmlhttp.status==200){
                   mydate=xmlhttp.responseText;
                   showValidate2();
               }
           }
           function showValidate2() {
               if(mydate.trim()=="is_exits"){
                   v_phone.innerHTML="手机号已存在";
                   return false;
               }else{
                   v_phone.innerHTML="";
                   return true;
               }
           }
       }


       function checkAddress(value) {
          v_address=document.getElementById("v-address");
          if(value==null){
              v_address.innerHTML="地址不能为空"
              return false;
          }
          return true;
       }
       function checkAge(value) {
           v_age=document.getElementById("v-age");
           if(value==null){
               v_age,innerHTML="年龄不能为空";
               return false;
           }
           return true;
       }
    </script>
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
<jsp:include page="visitorLoginTop.jsp"></jsp:include>
<%--注册用户的界面--%>
<div class="container">
    <div class="row">
        <h1>游客注册</h1>
        <form action="/visitor/register.do" method="post" class="form-horizontal" role="form" name="form1">
            <div class="form-group">
                <label class="col-md-3 control-label">昵称:</label>
                <div class="col-md-6">
                    <input name="visitorName" type="text" class="form-control" id="firstname" onblur="validateName(this.value)" >
                </div>
                <span id="v-name"></span>
                <div class="col-md-3"></div>
            </div>

            <div class="form-group">
                <label class="col-md-3 control-label">真实姓名</label>
                <div class="col-md-6">
                    <input name="visitorTrueName" type="text" class="form-control" id="truename" onblur="checkTrueName(this.value)">
                </div>
                <span id="v-trueName"></span>
                <div class="col-md-3"></div>
            </div>

            <div class="form-group">
                <label class="col-md-3 control-label">密码:</label>
                <div class="col-md-6">
                    <input type="password" name="visitorPassword" class="form-control"  onblur="checkPassword(this.value)">
                </div>
                <span id="v-password"></span>
                <div class="col-md-3"></div>
            </div>

            <div class="form-group">
                <label class="col-md-3 control-label">确认密码:</label>
                <div class="col-md-6">
                    <input type="password" name="visitorNextPassword" class="form-control"  onblur="checkNextPassword(this.value)">
                </div>
                <span id="v-nextPassword"></span>
                <div class="col-md-3"></div>
            </div>

            <div class="form-group">
                <label class="col-md-3 control-label">邮箱:</label>
                <div class="col-md-6">
                    <input type="email" name="visitorEmail" class="form-control" onblur="validateEmail(this.value)">
                </div>
                <span id="v-email"></span>
                <div class="col-md-3"></div>
            </div>

            <div class="form-group">
                <label class="col-md-3 control-label">手机号:</label>
                <div class="col-md-6">
                    <input type="text" name="visitorPhone" class="form-control" onblur="validatePhone(this.value)">
                </div>
                <span id="v-phone"></span>
                <div class="col-md-3"></div>
            </div>

            <div class="form-group">
                <label class="col-md-3 control-label">地址:</label>
                <div class="col-md-6">
                    <input type="text" name="visitorAddress" class="form-control" onblur="checkAddress(this.value)">
                </div>
                <span id="v-address"></span>
                <div class="col-md-3"></div>
            </div>

            <div class="form-group">
                <label class="col-md-3 control-label">年龄:</label>
                <div class="col-md-6">
                    <input type="text" name="visitorAge" class="form-control" onblur="checkAge(this.value)">
                </div>
                <span id="v-age"></span>
                <div class="col-md-3"></div>
            </div>

            <div class="form-group"></div>
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <button type="submit" class="btn btn-primary btn-block">注册</button>
            </div>
            <div class="col-md-3"></div>
        </form>
    </div>
</div>
</body>
</html>

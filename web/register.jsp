<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: wcy
  Date: 2016/4/23
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="js&css/bootstrap.min.css" rel="stylesheet">
    <link href="js&css/signin.css" rel="stylesheet">
    <script src="js&css/jquery-2.2.3.min.js"></script>
    <script src="js&css/bootstrap.min.js"></script>
</head>
<body>
<s:fielderror/>
<div style="padding: 20px 540px 0px">
    <form class="bs-example bs-example-form" role="form" action="register.action">
        <h1>Register</h1>
        <div class="input-group">
            <span class="input-group-addon">用户</span>
            <input name="login.username" type="text" class="form-control" placeholder="Name">
        </div>
        <br>

        <div class="input-group">
            <span class="input-group-addon">密码</span>
            <input name="login.password" type="password" class="form-control" placeholder="Password">
        </div>
        <br>

        <div class="input-group">
            <span class="input-group-addon">选项</span>
            <span class="input-group-addon">
            <select name="login.root">
                <option value="0">高级</option>
                <option value="1">一般</option>
            </select>
            </span>
        </div>
        <br>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>
    </form>
</div>
</body>
</html>

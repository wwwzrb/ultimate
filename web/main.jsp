<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: wcy
  Date: 2016/4/23
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="js&css/bootstrap.min.css" rel="stylesheet">
    <script src="js&css/jquery-2.2.3.min.js"></script>
    <script src="js&css/bootstrap.min.js"></script>
    <style>
        h1{
            text-align: center;
            font-size:  25px;
        }
        input, textarea{
            width: 60%;
            border-radius: 25px;
            border: 2px solid #8AC007;
            padding: 20px;
            margin-left: 20%;
            text-align:center;
            font-size: 18px;
        }
    </style>
</head>
<body>
<s:set name="login" value="#session['login']"/>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand active" href="main.jsp">主页</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li><a href="<s:url action="personsQuery"/>">个人</a></li>
                <li><a href="<s:url action="executeQuery"/>">所有</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><s:property value="#login.username"/><span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="index.jsp">登出</a></li>
                    </ul>
                </li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<form action="ly.action">
    <h1>Title:</h1><br>
    <input type="text" name="message.title" placeholder="MaxLength<=20" required><br>
    <h1>Content:</h1><br>
    <textarea rows="10" cols="30" type="text" name="message.content" placeholder="MaxLength<=500" required></textarea><br>
    <div style="margin-left: 20%;margin-right:20%;margin-top: 20px">
        <button type="submit" class="btn btn-lg btn-primary btn-block">Submit</button>
    </div>
</form>
</body>
</html>

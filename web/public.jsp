<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: wcy
  Date: 2016/5/2
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Public</title>
    <style>
        .font{font-size: 20px}
    </style>
    <link href="js&css/bootstrap.min.css" rel="stylesheet">
    <script src="js&css/jquery-2.2.3.min.js"></script>
    <script src="js&css/bootstrap.min.js"></script>
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
            <a class="navbar-brand" href="main.jsp">主页</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li><a href="<s:url action="personsQuery"/>">个人</a></li>
                <li><a href="<s:url action="executeQuery"/>" class="active">所有</a></li>
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
<table class="table table-hover table-bordered reference font">
    <h2 style="text-align: center">All</h2>
    <thead>
    <tr class="active">
        <th>Id</th>
        <th>Username</th>
        <th>Title</th>
        <th>Content</th>
        <th>Date</th>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#request['all']" id="result">
        <tr>
            <td><a href="query.action?result.id=<s:property value="#result.id"/>"><s:property value="#result.id"/></a></td>
            <td><s:property value="#result.username"/></td>
            <td><s:property value="#result.title"/></td>
            <td><s:property value="#result.content"/></td>
            <td><s:property value="#result.date"/></td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: wcy
  Date: 2016/5/3
  Time: 10:26
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
        h2{
            text-align: match-parent;
            font-size: 20px;
        }
        input, textarea{
            width: 60%;
            border-radius: 25px;
            border: 2px solid #8AC007;
            padding: 20px;
            margin-left: 20%;
            text-align:left;
            font-size: 18px;
        }
    </style>
</head>
<body>
<s:set name="details" value="#request['details']"/>
<form action="">
    <h1>Title:</h1>
    <div style="margin-left: 70%;margin-right:20%;margin-top: 20px">
        <h2>Author:<s:property value="#details.username"/></h2>
    </div>
    <textarea type="text"><s:property value="#details.title"/></textarea><br>
    <h1>Content:</h1><br>
    <textarea rows="10" cols="30" type="text" ><s:property value="#details.content"/></textarea><br>

</form>
</body>
</html>

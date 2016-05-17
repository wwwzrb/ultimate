<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: wcy
  Date: 2016/4/23
  Time: 13:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>$Title$</title>
  <link href="js&css/bootstrap.min.css" rel="stylesheet">
  <link href="js&css/signin.css" rel="stylesheet">

  <script src="js&css/bootstrap.min.js"></script>

</head>
<body>
<s:fielderror/>
<div class="container">
  <s:i18n name="message">
  <form class="form-signin" action="login.action" method="post">
    <h2 class="form-signin-heading"><s:text name="title"/></h2>
    <input type="text" name="login.username" class="form-control" placeholder="<s:property value="%{getText('ph1')}"/>">
    <input type="password" name="login.password" class="form-control" placeholder="<s:property value="%{getText('ph2')}"/>">
    <h2 style="font-size: 20px"><s:text name="new"/> <a href="register.jsp"><s:text name="here"/></a> <s:text name="register"/></h2>
    <button class="btn btn-lg btn-primary btn-block" type="submit"><s:property value="%{getText('button')}"/></button>
    <h2 style="font-size: 20px">
      <s:text name="select"/>:
      <a href="lau.action?request_locale=zh_CN"><s:text name="chinese"/></a>
      <a href="lau.action?request_locale=en_US"><s:text name="english"/></a>
    </h2>
</s:i18n>
  </form>
</div> <!-- /container -->

</body></html>

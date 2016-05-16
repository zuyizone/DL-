<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta charset="UTF-8">
  <title>登陆页面=======================</title>
  <link rel="stylesheet" href="css/stylet.css" media="screen" type="text/css" />
  <script src="js/modernizr.js"></script>
  </head>
  
  <body>
    <s:form action="checkUser" method="post">
		<input name="userNumber" placeholder="请填写您的userNumber?" class="name" required />
		<input type="password" name="password" placeholder="请填写您的密码?" class="name" required />
        <input name="submit" class="btn" type="submit" value="登陆"/>
   </s:form>
   
   
   <div style="text-align:center;clear:both">
        <script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
        <script src="/follow.js" type="text/javascript"></script>
   </div>
  <script src='js/jquery.js'></script>
  </body>
</html>

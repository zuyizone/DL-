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
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>导航栏</title>
	<link rel="stylesheet" type="text/css" href="css/normalize.css" />
	<link rel="stylesheet" type="text/css" href="css/default.css">
	<link href='http://fonts.useso.com/css?family=Open+Sans:400,600,700' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
  <body>
   <div id="info">
	<p class="i1">“租衣ZONE </p>
</div>

<div id="header">	
	<ul>
        <li><a href="index.jsp">首页</a></li>
        <li><a href="contact.jsp">联系我们</a></li>
        <li><a href="person.jsp">个人中心</a></li>
        <li><a href="cart.jsp">我的购物车</a></li> 
        <li><a href="login-singin.jsp">登陆/注册</a></li>
         		
    </ul>		
</div>

	
</body>
</html>

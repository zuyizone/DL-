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
	<title>用户信息</title>
	<link rel="stylesheet" type="text/css" href="icss/normalize.css" />
	<link rel="stylesheet" type="text/css" href="icss/default.css">
	<link href='http://fonts.useso.com/css?family=Open+Sans:400,600,700' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" type="text/css" href="icss/styles.css">
</head>
  
  <body>
  	 <jsp:include page="header.jsp"></jsp:include>
	<div>
		<div class="htmleaf-container">
		<header class="htmleaf-header">
			<h1>个人中心 </h1>
			
		</header>
		<div class="profile-card-wrap">
			<input id="check" type="checkbox" class="check"><label for="check" class="toggle"> + </label>
			<div class="content" data-text="欢迎来到jQuery之家">
				<div class="title">hi! 欢迎来到个人信息中心</div>
				<p>“租衣空间”一个专业的租衣网站</p>
			</div>
			<div class="link-info">
				<div class="social">
					<a class="link fb" href="#" target="_blank"><i class="fa fa-facebook">密码</i></a>
					<a class="link tw" href="#" target="_blank"><i class="fa fa-twitter">信息</i></a>
					<a class="link cp" href="#" target="_blank"><i class="fa fa-codepen">订单</i></a>
					<a class="link pi" href="#" target="_blank"><i class="fa fa-weibo">历史</i></a>
					<a class="link li" href="#" target="_blank"><i class="fa fa-weixin">xx</i></a>
					<a class="link yt" href="#" target="_blank"><i class="fa fa-qq">xx</i></a>
					<a class="link gp" href="#" target="_blank"><i class="fa fa-google-plus">xx</i></a>
				</div>
				<div class="photo"></div>
			</div>
		</div>

	</div>
		
		
	</div>
	
  </body>
</html>
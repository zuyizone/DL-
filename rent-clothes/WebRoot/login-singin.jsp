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
	<title>登录/注册</title>
	<link rel="stylesheet" type="text/css" href="lcss/normalize.css" />
	<link rel="stylesheet" type="text/css" href="lcss/default.css">
	<link href='http://fonts.useso.com/css?family=Open+Sans:400,600,700' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" type="text/css" href="lcss/styles.css">
</head>
  
  <body>
  	 <jsp:include page="header.jsp"></jsp:include>
	<div class="htmleaf-container">
		<header class="htmleaf-header">
			<h1>“租衣空间”更高效的服装租赁平台 <span></span></h1>
			
		</header>
	
		<div class="login-wrap">
			<div class="login-html">
				<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">登录</label>
				<input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">注册</label>
				<div class="login-form">
				
				<!--登录功能传值  -->
				<s:form action="checkUser" method="post">
					<div class="sign-in-htm">
						<div class="group">
							<label for="user" class="label">用户名</label>
							<input name="userNumber" id="user" type="text" class="input">
						</div>
						<div class="group">
							<label for="pass" class="label">密码</label>
							<input name="password" id="pass" type="password" class="input" data-type="password">
						</div>
						<div class="group">
							<input id="check" type="checkbox" class="check" checked>
							<label for="check"><span class="icon"></span> 自动登录</label>
						</div>
						<div class="group">
							<input name="submit" type="submit" class="button" value="登录">
						</div>
						<div class="hr"></div>
						<div class="foot-lnk">
							<a href="#forgot">忘记密码?</a>
						</div>
					</div>
				</s:form>
					
					<!--注册功能传值   由于注册的action还没有编写，我就用登录的action代替了，等注册的action写好了记得改过来-->
					<s:form action="checkUser" method="post">
					<div class="sign-up-htm">
						<div class="group">
							<label for="user" class="label">用户名</label>
							<input  name="userNumber" id="user" type="text" class="input">
						</div>
						<div class="group">
							<label for="pass" class="label">密码</label>
							<input name="password" id="pass" type="password" class="input" data-type="password">
						</div>
						<div class="group">
							<label for="pass" class="label">重复密码</label>
							<input name="password" id="pass" type="password" class="input" data-type="password">
						</div>
						<div class="group">
							<label for="pass" class="label">邮箱</label>
							<input name="email" id="pass" type="text" class="input">
						</div>
						<div class="group">
							<input name="submit" type="submit" class="button" value="注册">
						</div>
						<div class="hr"></div>
						<div class="foot-lnk">
							<label for="tab-1">已经注册?</a>
						</div>
					</div>
				</div>
				</s:form>
			</div>
		</div>
		
	</div>
	
  </body>
</html>


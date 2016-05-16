<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body>
  
	<jsp:include page="header.jsp"></jsp:include>
	<div class="content">
       	
       	<div id="formbackground" class="agile" style=" z-index:-1;text-align:center;"><img src="img/school.png" height="80%" width="100%"/></div>
        <script type="text/javascript">
        $(function(){
        $('#formbackground').height($(window).height());
        $('#formbackground').width($(window).width());
        });
        </script>
     
	</div>
	
	<div class="footer">
       	
     请联系我们
	</div>
	
  </body>
</html>

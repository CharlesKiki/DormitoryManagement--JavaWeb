<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>登录界面</title>
		<link href="style/style.css" rel="stylesheet" type="text/css" />
		<style type="text/css">
#nav li{
   list-style-type: none;
   
  }

#Nav li a {
	display: block;
	width: 180px;
	padding: 10px;
	background: #DFDFDF;
	border-bottom: 3px solid #D0D0D0;
	color: #333;
	font-weight: bold;
	text-decoration: none;
}

#Nav li img {
	padding-left: 2em;
	padding-right: 2em;
}

#Nav li a:hover {
	background: #FF9834;
	color: #FFF;
	border-right: 3px solid #E87200;
}

#Nav li ul li a {
	background: #585858;
}

#Nav li ul li a:hover {
	background: #666;
}

#Nav h2 {
	width: 180px;
	color: #D0D0D0;
	font-size: 12pt;
	left: 0;
	padding: 10px 0 8px 20px;
	border-bottom: 3px solid #D0D0D0;
}
</style>


	</head>

	<body id="login">
		<s:form action="u" id="loginForm" method="post" name="loginForm"
			theme="simple">
			<center>
				<h3>
					学校公寓管理信息系统欢迎你
				</h3>

				<uL id="Nav">
				    </br>
					<li>
						<a href="admin/login.jsp">管理员登录</a>
					</li></br></br>
					
					<li>
						<a href="user/login.jsp">学生登录</a>
					</li>
				</uL>
			</center>

		</s:form>
	</body>
</html>

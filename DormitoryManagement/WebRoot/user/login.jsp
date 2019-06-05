<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>学校公寓管理信息系统</title>
    <link href="style/style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript"> 
       
    function check() {
		if (document.loginForm.name.value == "") {
			alert("用户名不能为空");
			return false;
		}
		if (document.loginForm.pwd.value == "") {
			alert("密码不能为空");
			return false;
		}
	}
</script> 
	

  </head >
  
  <body id="login">
    <s:form action="user_login"  id="loginForm" method="post" name="loginForm" onSubmit="return check()" theme="simple">
    <h3>用户登录</h3>
    <center>
    <table >
    <tr><td>用户名:</td><td colspan="2"><s:textfield name="user.userName" id="name" label="用户名"></s:textfield></td></tr>
    <tr><td></td><td></td></tr>
    <tr><td>密码:</td><td colspan="2"><s:password name="user.userPwd" id="pwd" label="密码"></s:password></td></tr>
    </table>
    <br><br>
    <s:submit value="登录" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:reset value="重置"/><br><br>
    </center>
    </s:form>
  </body>
</html>

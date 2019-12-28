<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx"  uri="/struts-dojo-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//Dth HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addStudent.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="style/style.css" rel="stylesheet" type="text/css" />
	<style type="text/css">
	  th{
	      text-align:left;
	      font-size:14px;
	       }
	</style>
	 
  </head>
  
  <body id="page">
    <sx:head/> 
    <center>
    <h2>学生详细</h2>
    <br><br>
    <table width="60%" border="0" cellspacing="6px" cellpadding="10px">
    <tr><th>姓名</th><th> <s:property value="student.stuName"/></th></tr>
    <tr><th>性别</th><th><s:property value="student.sex"/></th></tr>
    <tr><th>学号</th><th><s:property value="student.stuNum"/></th></tr>
    <tr><th>班级</th><th> <s:property value="student.sbj"/></th></tr>
    <tr><th>专业</th><th><s:property value="student.stuMajor"/></th></tr>
    <tr><th>学院</th><th> <s:property value="student.stuCollege"/></th></tr>
    <tr><th>身份证</th><th><s:property value="student.ssfz"/></th></tr>
    <tr><th>出生日期</th><th><s:date name="student.stuBirth" format="yyyy-MM-dd" /></th></tr>
    <tr><th>入学日期</th><th><s:date name="student.stuEnter" format="yyyy-MM-dd" /></th></tr>
    <tr><th>电话</th><th><s:property value="student.stuPhone"/></th></tr>
    <tr><th>地址</th><th><s:property value="student.stuAddress"/></th></tr>
        
    </table>
    <br><br>
    <h3><a href="stubase_edit.action?stubaseId=<s:property value="student.stuId"/>">住宿信息</a></h3>
     </center>
  </body>
</html>

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
    
    <title>My JSP 'addStudent.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="style/style.css" rel="stylesheet" type="text/css" />

  </head>
  
  <body id="page">
    <center>
    <h2>更改学生住房信息</h2>
    <br><br>
    <s:form action="stubase_update" method="post" border="1" target="frameBord">
      <s:hidden name="stubase.stuId"></s:hidden>
      <s:select list="roomList" listValue="apartment.apartName+'号公寓'+floorNum+'层'+dormNum+'号房间'" listKey="roomId" name="roomId" label="房间号"></s:select>
      <s:textfield name="stubase.bedNum" label="床位编号"></s:textfield>
      <s:submit value="提交"></s:submit>
      </s:form>
      </center>
  </body>
</html>

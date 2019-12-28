<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx"  uri="/struts-dojo-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addvisit.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="style/style.css" rel="stylesheet" type="text/css" />

  </head>
  
  <body id="page">
    <sx:head/> 
    <center>
    <h2>增加卫生信息</h2>
    <br>
    <s:form action="health_save" method="post" border="1" target="frameBord">
      <s:select list="roomList" listValue="apartment.apartId+'号公寓'+floorNum+'层'+dormNum+'号房间'" listKey="roomId" name="roomId" label="房间号"></s:select>
      <s:select list="{'优','良','中','差'}" label="卫生" name="health.health"></s:select>
      <sx:datetimepicker label="检查日期" name="health.checkDate" displayFormat="yyyy-MM-dd"/>
      <s:submit value="提交"></s:submit>
      </s:form>
      </center>
  </body>
</html>
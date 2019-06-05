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
	<script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.validate.js"></script>
    <script type="text/javascript" src="js/jquery.metadata.js"></script>
    <script type="text/javascript" src="js/messages_cn.js"></script>
    <link rel="stylesheet" href="js/jquery.validity.css" type="text/css"></link>
	<script type="text/javascript">
		$().ready(function() {
$("#ap").validate({
  rules: {
      "apartment.apartName": {required:true,digits:true},
      "apartment.apartNum": { required:true,digits:true}
      },
     
  messages: {
   "apartment.apartName": {required: "请输入公寓号", digits: "输入必须是数字"},
   "apartment.apartNum": {
     required: "请输入可住人数",
     digits: "输入必须是数字"
    }
   }
    }
    );
});
	
	</script>

  </head>
  
  <body id="page">
    <center><h2>更新公寓信息</h2></center>
     <br>
    <div  style="margin-left:28em;position:absolute;">
    <s:form action="ap_update" method="post" border="1" target="frameBord"   name="ap" theme="simple"  id="ap">
    <s:hidden name="apartment.apartId"></s:hidden>
    <table>
    <tr><td>公寓名称</td><td style="width:300px"><s:textfield name="apartment.apartName" label="" ></s:textfield></td></tr>
    <tr><td>可住人数</td><td ><s:textfield name="apartment.apartNum" label="" ></s:textfield></td></tr>
    <tr><td>管理员</td><td ><s:select list="adminList" listValue="adminName" listKey="adminId" name="adminId" label=""></s:select></td></tr>
    <tr><td>公寓备注</td><td> <s:textarea name="apartment.apartNote" cols="26"  rows="8" label=""></s:textarea></td></tr>
    <tr><td></td><td>&nbsp;&nbsp;&nbsp;&nbsp;<s:submit value="提交"></s:submit>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:reset value="重置"/></td></tr>
    </table>
    </s:form>
      </div>
      
  </body>
</html>

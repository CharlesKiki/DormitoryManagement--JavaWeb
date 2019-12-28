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
$("#admin").validate({
  rules: {
      "manager.manName": {required:true},
      "manager.manPhone": {required:true,digits:true},
      "manager.manEmail": {required:true,email:true}
      },
     
  messages: {
   "manager.manName": {required: "帐户名不能为空"},
   "manager.manPhone": {
     required: "电话不能为空",
     digits: "输入必须是数字"
    }
   },
    "manager.manEmail": {
     required: "邮箱不能为空",
     email: "邮箱格式不正确"
    }
   }
    
    );
});
	
	</script>


  </head>
  
  <body id="page">
    
    <div><center><h2>更新管理员</h2></center></div>
    <div  style="margin-left:28em;position:absolute;">
    <br><br>
     <s:form action="man_update" method="post" border="1" target="frameBord" theme="simple" onSubmit="return check()" id="admin">
     <s:hidden name="manager.manId"></s:hidden>
     <table>
    <tr><td>姓名:</td><td style="width:300px"><s:textfield name="manager.manName"  ></s:textfield></td></tr>
    <tr><td>电话:</td><td><s:textfield name="manager.manPhone" onblur="phoneCheck(this)" ></s:textfield></td></tr>
    <tr><td>邮箱:</td><td><s:textfield name="manager.manEmail" onblur="emailCheck(this)" ></s:textfield></td></tr>
    <tr><td>简介:</td><td><s:textarea name="manager.note" cols="26"  rows="8" label="简介"></s:textarea></td><td></td></tr>
    <tr><td></td><td>&nbsp;&nbsp;&nbsp;&nbsp;<s:submit value="提交"></s:submit>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:reset value="重置"/></td></tr>
    </table>
     
     
      </s:form>
     </div> 
  </body>
</html>




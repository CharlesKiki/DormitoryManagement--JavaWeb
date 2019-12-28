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
$("#room").validate({
  rules: {
      "room.floorNum": {required:true,digits:true},
      "room.dormNum": {required:true,digits:true},
      "room.bedNum": {required:true,digits:true},
      "room.staNum": {required:true,digits:true}}
      ,
     
  messages: {
   "room.floorNum": {required: "楼层编号不能为空",digits: "输入必须是数字"},
   "room.dormNum": {required: "房间编号不能为空",digits: "输入必须是数字"},
   "room.bedNum": {required: "可住床位不能为空",digits: "输入必须是数字"},
   "room.staNum": {required: "已住床位不能为空",digits: "输入必须是数字"}
   
   }
    }
    );
});
	
	</script>

  </head>
  
  <body id="page">
    <center><h2>增加房间</h2></center>
    <br>
    <div  style="margin-left:28em;position:absolute;">
    <s:form action="r_save" method="post" border="1" target="frameBord" theme="simple" id="room">
    <table>
    <tr><td>公寓编号</td><td style="width:300px"><s:select list="apartList" listValue="apartName" listKey="apartId" name="apartId" label=""></s:select></td></tr>
    <tr><td>楼层编号</td><td><s:textfield name="room.floorNum" label=""></s:textfield></td></tr>
    <tr><td>房间编号</td><td><s:textfield name="room.dormNum" label=""></s:textfield></td></tr>
    <tr><td>可住床位</td><td><s:textfield name="room.bedNum" label=""></s:textfield></td></tr>
    <tr><td>已住床位</td><td> <s:textfield name="room.staNum" label=""></s:textfield></td></tr>
    <tr><td></td><td>&nbsp;&nbsp;&nbsp;&nbsp;<s:submit value="提交"></s:submit>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:reset value="重置"/></td></tr>
    
    </table>
    </s:form>
   </div>
    
  </body>
</html>

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
   <title>学生信息</title>
   <link href="style/style.css" rel="stylesheet" type="text/css" />
   <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.validate.js"></script>
    <script type="text/javascript" src="js/jquery.metadata.js"></script>
    <script type="text/javascript" src="js/messages_cn.js"></script>
    <link rel="stylesheet" href="js/jquery.validity.css" type="text/css"></link>
    
    <script type="text/javascript">
		
	function numCheck(oInput){
	if(!oInput.value){
		oInput.focus();		
		$("#num").html("<span style='color:red'>学号不能为空</span>");
		return;
	}
	$.post("numCheck1.action",{stuNum:oInput.value.toLowerCase()},
		//用jQuery来获取异步数据
		function(data){
			$("#num").html(decodeURI(data));
		}
	);
	 
	}
	</script>
 </head>
  
  <body id="page">
   <s:form action="findStu" theme="simple" method="post" style="margin-left:4em;position:absolute;">
   <table>
   <tr>
   <td>学号</td><td><s:textfield name="stuNum" onblur="numCheck(this)"></s:textfield></td><td><font id="num"></font></td>
   </tr>
   <tr>
   <td></td><td align="right"><s:submit value="查询"></s:submit></td><td></td>
   </tr>
   </table>
   </s:form>
  </body>
</html>

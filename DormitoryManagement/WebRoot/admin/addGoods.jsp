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
	<script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.validate.js"></script>
    <script type="text/javascript" src="js/jquery.metadata.js"></script>
    <script type="text/javascript" src="js/messages_cn.js"></script>
    <link rel="stylesheet" href="js/jquery.validity.css" type="text/css"></link>
	<script type="text/javascript">
		$().ready(function() {
$("#goods").validate({
  rules: {
      "stuNum": {required:true,digits:true}
      }
    }
    );
});
	
	</script>
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
    <sx:head/> 
    <center><h2>增加物品出入</h2>  </center>
    <br>
    <div  style="margin-left:28em;position:absolute;">
    <s:form action="goods_save" method="post" border="1" target="frameBord"  name="stu" theme="simple" id="goods">
    <table>
   <tr><td>学生学号</td><td><s:textfield name="stuNum" label="" onblur="numCheck(this)"></s:textfield></td><td><font id="num"></font></td></tr>
    <tr><td>带入物品</td><td><s:textfield name="goods.goodsIn" label=""></s:textfield></td><td></td></tr>
    <tr><td>带出物品</td><td><s:textfield name="goods.goodsOut" label=""></s:textfield></td><td></td></tr>
    <tr><td>记录时间</td><td><sx:datetimepicker label="" name="goods.goodsDate" displayFormat="yyyy-MM-dd"/></td><td></td></tr>
    <tr><td>备注</td><td><s:textarea name="goods.note" cols="26"  rows="8" label=""></s:textarea></td><td></td></tr>
    <tr><td></td><td>&nbsp;&nbsp;&nbsp;&nbsp;<s:submit value="提交"></s:submit>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:reset value="重置"/></td><td></td></tr>    
    </table>
    </s:form>
    </div>  
  </body>
</html>

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
$("#vis").validate({
  rules: {
      "stuNum": {required:true,digits:true},
      "visit.visitName": {required:true},
      "visit.relation": {required:true},
      "visit.visCret" : {required:true,digits:true}}
      ,
     
  messages: {
   "stuNum": {required: "学生学号不能为空",digits: "输入必须是数字"},
   "visit.visitName": {required: "来访者姓名不能为空"},
   "visit.relation": {required: "关系不能为空"},
   "visit.visCret": {required: "可用证件不能为空",digits: "输入必须是数字"}
   
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
    <center><h2>更新来访者信息</h2></center>
    <br>
     <div  style="margin-left:28em;position:absolute;">
    <s:form action="vis_update" method="post" border="1" target="frameBord"  id="vis" theme="simple">
    <s:hidden name="visit.visitId"></s:hidden>
    <table>
    <tr><td>学生学号</td><td style="width:300px"><s:textfield name="stuNum" label="" onblur="numCheck(this)"></s:textfield></td><td><font id="num"></font></td></tr>
    <tr><td>来访人姓名</td><td><s:textfield name="visit.visitName" label="" id="name"></s:textfield></td><td></td></tr>
    <tr><td>与学生关系</td><td><s:textfield name="visit.relation" label=""></s:textfield></td><td></td></tr>
    <tr><td>来访时间</td><td><sx:datetimepicker label="" name="visit.visDate" displayFormat="yyyy-MM-dd"/></td><td></td></tr>
    <tr><td>高开时间</td><td><sx:datetimepicker label="" name="visit.leaDate" displayFormat="yyyy-MM-dd"/></td><td></td></tr>
    <tr><td>证件</td><td><s:textfield name="visit.visCret" label="" id="cret"></s:textfield></td><td></td></tr>
    <tr><td>备注</td><td><s:textarea name="visit.note" cols="26"  rows="8" label=""></s:textarea></td><td></td></tr>
    <tr><td></td><td>&nbsp;&nbsp;&nbsp;&nbsp;<s:submit value="提交"></s:submit>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:reset value="重置"/></td><td></td></tr>
    
    </table>
     
    </s:form>
      </div>
      
  </body>
</html>




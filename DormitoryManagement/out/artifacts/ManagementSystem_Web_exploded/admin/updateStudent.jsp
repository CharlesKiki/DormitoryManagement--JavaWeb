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
$("#stu").validate({
  rules: {
      "student.stuName": {required:true},
      "student.stuNum": {required:true,digits:true},
      "student.sbj": {required:true,digits:true},
      "student.stuMajor": {required:true},
      "student.stuCollege": {required:true},
      "student.ssfz": {required:true,digits:true},
      "student.stuPhone": {required:true,digits:true},
      "student.stuAddress": {required:true}
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
	$.post("numCheck.action",{stuNum:oInput.value.toLowerCase()},
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
    <center><h2>更新学生信息</h2> </center>
     <div  style="margin-left:28em;position:absolute;">
     <s:form action="stu_update" method="post" border="1" target="frameBord" theme="simple" id="stu">
     <s:hidden name="student.stuId"></s:hidden>
    <table>
    <tr><td>学生姓名</td><td style="width:300px"><s:textfield name="student.stuName" ></s:textfield></td><td><span id="name"></span></td></tr>
    <tr><td>性别</td><td><s:select name="student.sex"  list="{'男','女 '}"></s:select></td><td></td></tr>
    <tr><td>学号</td><td><s:textfield name="student.stuNum" label=""  onblur="numCheck(this)"></s:textfield></td><td><span id="num"></span></td></tr>
    <tr><td>班级</td><td><s:textfield name="student.sbj" label="" ></s:textfield></td><td></td></tr>
    <tr><td>专业</td><td><s:textfield name="student.stuMajor" label="" ></s:textfield></td><td></td></tr>
    <tr><td>学院</td><td><s:textfield name="student.stuCollege" label="" ></s:textfield></td><td></td></tr>
    <tr><td>身份证号</td><td><s:textfield name="student.ssfz" label="" ></s:textfield></td><td></td></tr>
    <tr><td>出生日期</td><td><sx:datetimepicker label="" name="student.stuBirth" displayFormat="yyyy-MM-dd"/></td><td></td></tr>
    <tr><td>入学日期</td><td> <sx:datetimepicker label="" name="student.stuEnter" displayFormat="yyyy-MM-dd"/></td><td></td></tr>
    <tr><td>电话号码</td><td><s:textfield name="student.stuPhone" label="" ></s:textfield></td><td></td></tr>
    <tr><td>家庭地址</td><td><s:textfield name="student.stuAddress" label="" ></s:textfield></td><td></td></tr>
    <tr><td></td><td>&nbsp;&nbsp;&nbsp;&nbsp;<s:submit value="提交"></s:submit>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:reset value="重置"/></td><td></td></tr>
    
    </table>
    </s:form>
      <s:actionerror/>
   </div>
  </body>
</html>




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
   <script type=text/javascript>
   
     function validate()
        {
            var page = document.getElementsByName("page")[0].value;
                
            if(page > <s:property value="#session.stuPage.totalPage"/>)
            {
                alert("你输入的页数大于最大页数，页面将跳转到首页！");
                
                window.document.location.href = "stuAction.action";
                
                return false;
            }
            
            return true;
        }
    </script>
    <style type="text/css">
      .a1 th{
      color:#0065AF;      }
      </style>
  </head>
  
  <body id="page">
   <h2>学生信息</h2>
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr class="a1">
            <th >学号</th>
            <th >姓名</th>
            <th >性别</th>
            <th >班级</th>
            <th >专业</th>
            <th >学院</th>
            <th >详细信息</th>
            <th >修改</th>
            <th >删除</th>
        </tr>
    
    
    <s:iterator value="#session.stuPage.list" id="student">
    
        <tr>
            <th><s:property value="#student.stuNum"/></th>
            <th><s:property value="#student.stuName"/></th>
            <th><s:property value="#student.sex"/></th>
            <th><s:property value="#student.sbj"/></th>
            <th><s:property value="#student.stuMajor"/></th>
            <th><s:property value="#student.stuCollege"/></th>
            <th><a href='stu_detail.action?stuId=<s:property value="#student.stuId"/>' >详细信息</a></th>
            <th><a href='stu_edit.action?stuId=<s:property value="#student.stuId"/>' >修改</a></th>
            <th><a href='stu_delete.action?stuId=<s:property value="#student.stuId"/>' target="frameBord">删除</a></th>    
        </tr>
    
    </s:iterator>
    
    </table>
    
     <center>
    
        <font size="4">共<font color="red"><s:property value="#session.stuPage.totalPage"/></font>页 </font>&nbsp;&nbsp;
        <font size="4">共<font color="red"><s:property value="#session.stuPage.allRows"/></font>条记录</font><br><br>
        
        <s:if test="#session.stuPage.currentPage == 1">
            首页&nbsp;&nbsp;&nbsp;上一页
        </s:if>
        
        <s:else>
            <a href="stuAction.action">首页</a>
            &nbsp;&nbsp;&nbsp;
            <a href="stuAction.action?page=<s:property value="#session.stuPage.currentPage - 1"/>">上一页</a>
        </s:else>
        
        <s:if test="#session.stuPage.currentPage != #session.stuPage.totalPage">
            <a href="stuAction.action?page=<s:property value="#session.stuPage.currentPage + 1"/>">下一页</a>
            &nbsp;&nbsp;&nbsp;
            <a href="stuAction.action?page=<s:property value="#session.stuPage.totalPage"/>">尾页</a>
        </s:if>
        
        <s:else>
            下一页&nbsp;&nbsp;&nbsp;尾页
        </s:else>
    
    </center><br>
    
    <center>
        
        <form action="stuAction" onsubmit="return validate();">
            <font size="4">跳转至</font>
            <input type="text" size="2" name="page">页
            <input type="submit" value="跳转">
        </form>
        <h4><a href="admin/addStudent.jsp">增加学生</a></h4>
    </center>
  </body>
</html>

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
                
            if(page > <s:property value="#session.manPage.totalPage"/>)
            {
                alert("你输入的页数大于最大页数，页面将跳转到首页！");
                
                window.document.location.href = "manAction.action";
                
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
   <h2>管理员信息</h2>
   <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr class="a1">
            <th >姓名</th>
            <th >电话</th>
            <th >邮箱</th>
            <th >介绍</th>
            <th >修改</th>
            <th >删除</th>
        </tr>
    
    
    <s:iterator value="#session.manPage.list" id="manager">
    
        <tr>
            <th><s:property value="#manager.manName"/></th>
            <th><s:property value="#manager.manPhone"/></th>
            <th><s:property value="#manager.manEmail"/></th>
            <th><s:property value="#manager.note"/></th>
            <th><a href='man_edit.action?manId=<s:property value="#manager.manId"/>' >修改</a></th>
            <th><a href='man_delete.action?manId=<s:property value="#manager.manId"/>' target="frameBord">删除</a></th>    
        </tr>
    
    </s:iterator>
    
    </table>
    
     <center>
    
        <font size="5">共<font color="red"><s:property value="#session.manPage.totalPage"/></font>页 </font>&nbsp;&nbsp;
        <font size="5">共<font color="red"><s:property value="#session.manPage.allRows"/></font>条记录</font><br><br>
        
        <s:if test="#session.manPage.currentPage == 1">
            首页&nbsp;&nbsp;&nbsp;上一页
        </s:if>
        
        <s:else>
            <a href="manAction.action">首页</a>
            &nbsp;&nbsp;&nbsp;
            <a href="manAction.action?page=<s:property value="#session.manPage.currentPage - 1"/>">上一页</a>
        </s:else>
        
        <s:if test="#session.manPage.currentPage != #session.manPage.totalPage">
            <a href="manAction.action?page=<s:property value="#session.manPage.currentPage + 1"/>">下一页</a>
            &nbsp;&nbsp;&nbsp;
            <a href="manAction.action?page=<s:property value="#session.manPage.totalPage"/>">尾页</a>
        </s:if>
        
        <s:else>
            下一页&nbsp;&nbsp;&nbsp;尾页
        </s:else>
    
    </center><br>
    
    <center>
        
        <form action="manAction" onsubmit="return validate();">
            <font size="4">跳转至</font>
            <input type="text" size="2" name="page">页
            <input type="submit" value="跳转">
        </form>
        <br>
       <h3> <a href="admin/addManager.jsp">增加管理员</a></h3>
    </center>
  </body>
</html>

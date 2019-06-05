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
   <title>来访者信息</title>
   <link href="style/style.css" rel="stylesheet" type="text/css" />
   <script type=text/javascript>
   
     function validate()
        {
            var page = document.getElementsByName("page")[0].value;
                
            if(page > <s:property value="#session.visPage.totalPage"/>)
            {
                alert("你输入的页数大于最大页数，页面将跳转到首页！");
                
                window.document.location.href = "visAction.action";
                
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
   <h2>来访者信息</h2>
   <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr class="a1">
            <th>来访人姓名</th>
            <th>关系</th>
            <th>学生学号</th>
            <th>学生姓名</th>
            <th>来访时间</th>
            <th>离开时间</th>
            <th>记录人员</th>
            <th>备注</th>
            <th>修改</th>
            <th>删除</th>
        </tr>
    
    
    <s:iterator value="#session.visPage.list" id="visit">
    
        <tr>
            <th><s:property value="#visit.visitName"/></th>
            <th><s:property value="#visit.relation"/></th>
            <th><s:property value="#visit.student.stuNum"/></th>
            <th><s:property value="#visit.student.stuName"/></th>
            <th><s:date name="#visit.visDate" format="yyyy-MM-dd" /></th>
            <th><s:date name="#visit.leaDate" format="yyyy-MM-dd" /></th>
            <th><s:property value="#visit.admin.adminName"/></th>
            <th><s:property value="#visit.note"/></th>
            <th><a href='<s:url action='vis_edit.action'><s:param name="visitId" value="#visit.visitId"/><s:param name="stuNum" value="#visit.student.stuNum"/></s:url>' >修改</a></th>
            <th><a href='vis_delete.action?visitId=<s:property value="#visit.visitId"/>' target="frameBord">删除</a></th>    
        </tr>
    
    </s:iterator>
    
    </table>
    
     <center>
    
        <font size="5">共<font color="red"><s:property value="#session.visPage.totalPage"/></font>页 </font>&nbsp;&nbsp;
        <font size="5">共<font color="red"><s:property value="#session.visPage.allRows"/></font>条记录</font><br><br>
        
        <s:if test="#session.visPage.currentPage == 1">
            首页&nbsp;&nbsp;&nbsp;上一页
        </s:if>
        
        <s:else>
            <a href="visAction.action">首页</a>
            &nbsp;&nbsp;&nbsp;
            <a href="visAction.action?page=<s:property value="#session.visPage.currentPage - 1"/>">上一页</a>
        </s:else>
        
        <s:if test="#session.visPage.currentPage != #session.visPage.totalPage">
            <a href="visAction.action?page=<s:property value="#session.visPage.currentPage + 1"/>">下一页</a>
            &nbsp;&nbsp;&nbsp;
            <a href="visAction.action?page=<s:property value="#session.visPage.totalPage"/>">尾页</a>
        </s:if>
        
        <s:else>
            下一页&nbsp;&nbsp;&nbsp;尾页
        </s:else>
    
    </center><br>
    
    <center>
        
        <form action="visAction" onsubmit="return validate();">
            <font size="4">跳转至</font>
            <input type="text" size="2" name="page">页
            <input type="submit" value="跳转">
        </form>
        <br>
        <h3><a href="admin/addVisit.jsp">增加来访者</a></h3>
    </center>
  </body>
</html>

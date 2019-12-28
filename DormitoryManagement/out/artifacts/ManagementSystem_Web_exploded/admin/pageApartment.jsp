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
   <title>公寓信息</title>
   <link href="style/style.css" rel="stylesheet" type="text/css" />
   <script type=text/javascript>
   
     function validate()
        {
            var page = document.getElementsByName("page")[0].value;
                
            if(page > <s:property value="#session.apPage.totalPage"/>)
            {
                alert("你输入的页数大于最大页数，页面将跳转到首页！");
                
                window.document.location.href = "apAction.action";
                
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
   <h2>公寓信息</h2>
   <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr class="a1">
            <th >公寓名称</th>
            <th >可住人数</th>
            <th >管理员</th>
            <th >公寓备注</th>
            <th >修改</th>
            <th >删除</th>
        </tr>
    
    
    <s:iterator value="#session.apPage.list" id="apartment">
    
        <tr>
            <th><s:property value="#apartment.apartName"/>栋</th>
            <th><s:property value="#apartment.apartNum"/>人</th>
            <th><s:property value="#apartment.admin.adminName"/></th>
            <th><s:property value="#apartment.apartNote"/></th>
            <th><a href='<s:url action='ap_edit.action'><s:param name="apId" value="#apartment.apartId"/><s:param name="adminId" value="#apartment.admin.adminId"/></s:url>' >修改</a></th>
            <th><a href='ap_delete.action?apId=<s:property value="#apartment.apartId"/>' target="frameBord">删除</a></th>    
        </tr>
    
    </s:iterator>
    
    </table>
    
     <center>
    
        <font size="5">共<font color="red"><s:property value="#session.apPage.totalPage"/></font>页 </font>&nbsp;&nbsp;
        <font size="5">共<font color="red"><s:property value="#session.apPage.allRows"/></font>条记录</font><br><br>
        
        <s:if test="#session.apPage.currentPage == 1">
            首页&nbsp;&nbsp;&nbsp;上一页
        </s:if>
        
        <s:else>
            <a href="apAction.action">首页</a>
            &nbsp;&nbsp;&nbsp;
            <a href="apAction.action?page=<s:property value="#session.apPage.currentPage - 1"/>">上一页</a>
        </s:else>
        
        <s:if test="#session.apPage.currentPage != #session.apPage.totalPage">
            <a href="apAction.action?page=<s:property value="#session.apPage.currentPage + 1"/>">下一页</a>
            &nbsp;&nbsp;&nbsp;
            <a href="apAction.action?page=<s:property value="#session.apPage.totalPage"/>">尾页</a>
        </s:if>
        
        <s:else>
            下一页&nbsp;&nbsp;&nbsp;尾页
        </s:else>
    
    </center><br>
    
    <center>
        
        <form action="apAction" onsubmit="return validate();">
            <font size="4">跳转至</font>
            <input type="text" size="2" name="page">页
            <input type="submit" value="跳转">
        </form>
        <br>
       <h3> <a href="addApartment.action">增加公寓</a></h3>
    </center>
  </body>
</html>

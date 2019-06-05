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
   <title>卫生信息</title>
   <link href="style/style.css" rel="stylesheet" type="text/css" />
   <script type=text/javascript>
   
     function validate()
        {
            var page = document.getElementsByName("page")[0].value;
                
            if(page > <s:property value="#session.healthPage.totalPage"/>)
            {
                alert("你输入的页数大于最大页数，页面将跳转到首页！");
                
                window.document.location.href = "healthAction.action";
                
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
            <th>公寓编号</th>
            <th>楼层编号</th>
            <th>房间编号</th>
            <th>卫生</th>
            <th>检查时间</th>
           
        </tr>
    
    
    <s:iterator value="#session.healthPage.list" id="health">
    
        <tr>
            <th><s:property value="#health.room.apartment.apartId"/></th>
            <th><s:property value="#health.room.floorNum"/></th>
            <th><s:property value="#health.room.dormNum"/></th>
            <th><s:property value="#health.health"/></th>
            <th><s:date name="#health.checkDate" format="yyyy-MM-dd" /></th>
           
        </tr>
    
    </s:iterator>
    
    </table>
    
     <center>
    
        <font size="5">共<font color="red"><s:property value="#session.healthPage.totalPage"/></font>页 </font>&nbsp;&nbsp;
        <font size="5">共<font color="red"><s:property value="#session.healthPage.allRows"/></font>条记录</font><br><br>
        
        <s:if test="#session.healthPage.currentPage == 1">
            首页&nbsp;&nbsp;&nbsp;上一页
        </s:if>
        
        <s:else>
            <a href="healthAction.action">首页</a>
            &nbsp;&nbsp;&nbsp;
            <a href="healthAction.action?page=<s:property value="#session.healthPage.currentPage - 1"/>">上一页</a>
        </s:else>
        
        <s:if test="#session.healthPage.currentPage != #session.healthPage.totalPage">
            <a href="healthAction.action?page=<s:property value="#session.healthPage.currentPage + 1"/>">下一页</a>
            &nbsp;&nbsp;&nbsp;
            <a href="healthAction.action?page=<s:property value="#session.healthPage.totalPage"/>">尾页</a>
        </s:if>
        
        <s:else>
            下一页&nbsp;&nbsp;&nbsp;尾页
        </s:else>
    
    </center><br>
    
    <center>
        
        <form action="healthAction" onsubmit="return validate();">
            <font size="4">跳转至</font>
            <input type="text" size="2" name="page">页
            <input type="submit" value="跳转">
        </form>
       
    </center>
  </body>
</html>

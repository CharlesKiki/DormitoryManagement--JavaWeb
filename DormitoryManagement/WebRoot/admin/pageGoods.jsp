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
   <title>物品出入信息</title>
   <link href="style/style.css" rel="stylesheet" type="text/css" />
   <script type=text/javascript>
   
     function validate()
        {
            var page = document.getElementsByName("page")[0].value;
                
            if(page > <s:property value="#session.goodsPage.totalPage"/>)
            {
                alert("你输入的页数大于最大页数，页面将跳转到首页！");
                
                window.document.location.href = "goodsAction.action";
                
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
   <h2>物品出入信息</h2>
   <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr class="a1">
            <th>学生学号</th>
            <th>学生姓名</th>
            <th>带入物品</th>
            <th>带出物品</th>
            <th>记录时间</th>
            <th>记录人员</th>
            <th>备注</th>
            <th>修改</th>
            <th>删除</th>
        </tr>
    
    
    <s:iterator value="#session.goodsPage.list" id="goods">
    
        <tr>
            <th><s:property value="#goods.student.stuNum"/></th>
            <th><s:property value="#goods.student.stuName"/></th>
            <th><s:property value="#goods.goodsIn"/></th>
            <th><s:property value="#goods.goodsOut"/></th>
            <th><s:date name="#goods.goodsDate" format="yyyy-MM-dd" /></th>
            <th><s:property value="#goods.admin.adminName"/></th>
            <th><s:property value="#goods.note"/></th>
            <th><a href='<s:url action='goods_edit.action'><s:param name="goodsId" value="#goods.goodsId"/><s:param name="stuNum" value="#goods.student.stuNum"/></s:url>' >修改</a></th>
           <!--  <th><a href='goods_edit.action?goodsId=<s:property value="#goods.goodsId"/>' >修改</a></th>--> 
            <th><a href='goods_delete.action?goodsId=<s:property value="#goods.goodsId"/>' target="frameBord">删除</a></th>    
        </tr>
    
    </s:iterator>
    
    </table>
    
     <center>
    
        <font size="5">共<font color="red"><s:property value="#session.goodsPage.totalPage"/></font>页 </font>&nbsp;&nbsp;
        <font size="5">共<font color="red"><s:property value="#session.goodsPage.allRows"/></font>条记录</font><br><br>
        
        <s:if test="#session.goodsPage.currentPage == 1">
            首页&nbsp;&nbsp;&nbsp;上一页
        </s:if>
        
        <s:else>
            <a href="goodsAction.action">首页</a>
            &nbsp;&nbsp;&nbsp;
            <a href="goodsAction.action?page=<s:property value="#session.goodsPage.currentPage - 1"/>">上一页</a>
        </s:else>
        
        <s:if test="#session.goodsPage.currentPage != #session.goodsPage.totalPage">
            <a href="goodsAction.action?page=<s:property value="#session.goodsPage.currentPage + 1"/>">下一页</a>
            &nbsp;&nbsp;&nbsp;
            <a href="goodsAction.action?page=<s:property value="#session.goodsPage.totalPage"/>">尾页</a>
        </s:if>
        
        <s:else>
            下一页&nbsp;&nbsp;&nbsp;尾页
        </s:else>
    
    </center><br>
    
    <center>
        
        <form action="goodsAction" onsubmit="return validate();">
            <font size="4">跳转至</font>
            <input type="text" size="2" name="page">页
            <input type="submit" value="跳转">
        </form>
        <br>
        <h3><a href="admin/addGoods.jsp">增加出入物品</a></h3>
    </center>
  </body>
</html>

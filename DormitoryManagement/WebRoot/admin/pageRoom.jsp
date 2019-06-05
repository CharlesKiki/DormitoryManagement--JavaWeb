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
   <title>床位信息</title>
   <link href="style/style.css" rel="stylesheet" type="text/css" />
   <script type=text/javascript>
   
     function validate()
        {
            var page = document.getElementsByName("page")[0].value;
                
            if(page > <s:property value="#session.rPage.totalPage"/>)
            {
                alert("你输入的页数大于最大页数，页面将跳转到首页！");
                
                window.document.location.href = "rAction.action";
                
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
   <h2>房间信息</h2>
   <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr class="a1">
            <th >公寓编号</th>
            <th >楼层编号</th>
            <th >房间编号</th>
            <th >床位总数</th>
            <th >已住床位</th>
            <th >修改</th>
            <th >删除</th>
        </tr>
    
    
    <s:iterator value="#session.rPage.list" id="room">
    
        <tr>
            <th><s:property value="#room.apartment.apartName"/>栋</th>
            <th><s:property value="#room.floorNum"/>层</th>
            <th><s:property value="#room.dormNum"/>号房间</th>
            <th><s:property value="#room.bedNum"/>个床位</th>
            <th><s:property value="#room.staNum"/>个床位</th>
            <th><a href='<s:url action='r_edit.action'><s:param name="roomId" value="#room.roomId"/><s:param name="apartId" value="#room.apartment.apartId"/></s:url>' >修改</a></th>
            <th><a href='r_delete.action?roomId=<s:property value="#room.roomId"/>' target="frameBord">删除</a></th>    
        </tr>
    
    </s:iterator>
    
    </table>
    
     <center>
    
        <font size="5">共<font color="red"><s:property value="#session.rPage.totalPage"/></font>页 </font>&nbsp;&nbsp;
        <font size="5">共<font color="red"><s:property value="#session.rPage.allRows"/></font>条记录</font><br><br>
        
        <s:if test="#session.rPage.currentPage == 1">
            首页&nbsp;&nbsp;&nbsp;上一页
        </s:if>
        
        <s:else>
            <a href="rAction.action">首页</a>
            &nbsp;&nbsp;&nbsp;
            <a href="rAction.action?page=<s:property value="#session.rPage.currentPage - 1"/>">上一页</a>
        </s:else>
        
        <s:if test="#session.rPage.currentPage != #session.rPage.totalPage">
            <a href="rAction.action?page=<s:property value="#session.rPage.currentPage + 1"/>">下一页</a>
            &nbsp;&nbsp;&nbsp;
            <a href="rAction.action?page=<s:property value="#session.rPage.totalPage"/>">尾页</a>
        </s:if>
        
        <s:else>
            下一页&nbsp;&nbsp;&nbsp;尾页
        </s:else>
    
    </center><br>
    
    <center>
        
        <form action="rAction" onsubmit="return validate();">
            <font size="4">跳转至</font>
            <input type="text" size="2" name="page">页
            <input type="submit" value="跳转">
        </form>
        <br>
       <h3> <a href="addRoom.action">增加房间</a></h3>
    </center>
  </body>
</html>

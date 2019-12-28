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
   <title>学生住房信息</title>
   <link href="style/style.css" rel="stylesheet" type="text/css" />
   <script type=text/javascript>
   
     function validate()
        {
            var page = document.getElementsByName("page")[0].value;
                
            if(page > <s:property value="#session.stubasePage.totalPage"/>)
            {
                alert("你输入的页数大于最大页数，页面将跳转到首页！");
                
                window.document.location.href = "stubaseAction.action";
                
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
            <th >学号</th>
            <th >姓名</th>
            <th >学院</th>
            <th >楼层号</th>
            <th >房间号</th>
            <th >床位号</th>
            <th >修改</th>
            
        </tr>
    
    
    <s:iterator value="#session.stubasePage.list" id="stubase" status="status">
    
        <tr>
            <th><s:property value="#stubase.student.stuNum"/></th>
            <th><s:property value="#stubase.student.stuName"/></th>
            <th><s:property value="#stubase.student.stuCollege"/></th>
            <th><s:property value="#stubase.room.floorNum"/>层</th>
            <th><s:property value="#stubase.room.dormNum"/>号房间</th>
            <th><s:property value="#stubase.bedNum"/>号床位</th>
            <th><a href='stubase_edit.action?stubaseId=<s:property value="#stubase.stuId"/>' >修改</a></th>
              
        </tr>
    
    </s:iterator>
    
    </table>
    
     <center>
    
        <font size="5">共<font color="red"><s:property value="#session.stubasePage.totalPage"/></font>页 </font>&nbsp;&nbsp;
        <font size="5">共<font color="red"><s:property value="#session.stubasePage.allRows"/></font>条记录</font><br><br>
        
        <s:if test="#session.stubasePage.currentPage == 1">
            首页&nbsp;&nbsp;&nbsp;上一页
        </s:if>
        
        <s:else>
            <a href="stubaseAction.action">首页</a>
            &nbsp;&nbsp;&nbsp;
            <a href="stubaseAction.action?page=<s:property value="#session.stubasePage.currentPage - 1"/>">上一页</a>
        </s:else>
        
        <s:if test="#session.stubasePage.currentPage != #session.stubasePage.totalPage">
            <a href="stubaseAction.action?page=<s:property value="#session.stubasePage.currentPage + 1"/>">下一页</a>
            &nbsp;&nbsp;&nbsp;
            <a href="stubaseAction.action?page=<s:property value="#session.stubasePage.totalPage"/>">尾页</a>
        </s:if>
        
        <s:else>
            下一页&nbsp;&nbsp;&nbsp;尾页
        </s:else>
    
    </center><br>
    
    <center>
        
        <form action="stubaseAction" onsubmit="return validate();">
            <font size="4">跳转至</font>
            <input type="text" size="2" name="page">页
            <input type="submit" value="跳转">
        </form>
        <br>
       </center>
  </body>
</html>

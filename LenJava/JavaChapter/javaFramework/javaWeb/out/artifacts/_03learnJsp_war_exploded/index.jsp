<%--
  Created by IntelliJ IDEA.
  User: echo 小戴
  Date: 2023/6/27
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<%--  声明脚本--%>
<%!
  private Integer age;
  private String name;
  public void testMethod(String name){
    this.name=name;
    System.out.println(name);
  }

  public static class A{
  }
%>
<%--代码脚本  --%>
<%
  testMethod("zhangdan");
%>
<%--  表达式脚本--%>
  <%=this.name%>
  </body>
</html>

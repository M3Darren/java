<%--
  Created by IntelliJ IDEA.
  User: echo 小戴
  Date: 2023/6/27
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  pageContext.setAttribute("key", "this is pageContext values");
  request.setAttribute("key", "this is request values");
  session.setAttribute("key", "this is session values");
  application.setAttribute("key", "this is application values");
%>
<%--
访问顺序为：
          1、pageContext
          2、request
          3、session
          4、application
--%>
${key}

</body>
</html>

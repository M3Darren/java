<%--
  Created by IntelliJ IDEA.
  User: echo 小戴
  Date: 2023/6/27
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    out.write("out1");
    out.write("out2");
    response.getWriter().write("response1");
    response.getWriter().write("response2");
//    输出结果：总是response的语句在前
%>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: echo 小戴
  Date: 2023/6/27
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>四大域对象</title>
</head>
<body>
<%
    pageContext.setAttribute("key", "this is pageContext values");
    request.setAttribute("key", "this is request values");
    session.setAttribute("key", "this is session values");
    application.setAttribute("key", "this is application values");

%>
<p>pageContext values:<strong><%=pageContext.getAttribute("key")%></strong></p>
<p>request values:<strong><%=request.getAttribute("key")%></strong></p>
<p>session values:<strong><%=session.getAttribute("key")%></strong></p>
<p>application values:<strong><%=application.getAttribute("key")%></strong></p>
<jsp:forward page="/filestaticinclude.jsp"></jsp:forward>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: echo 小戴
  Date: 2023/6/27
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="public/header.jsp">
  <jsp:param name="username" value="sadsa"/>
</jsp:include>

<div id="main" style="position:absolute;top: 50px;">这是filedynamicinclude页面主体</div>
<jsp:include page="public/footer.jsp"></jsp:include>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: echo 小戴
  Date: 2023/6/27
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<div id="header" style="position: fixed;top: 0;width: 100%;height: 50px;background-color: aliceblue">
  这是头部，接收了filedynamicinclude页面传递的username参数：<%=request.getParameter("username")%>
</div>
</body>
</html>

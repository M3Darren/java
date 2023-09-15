<%--
  Created by IntelliJ IDEA.
  User: echo 小戴
  Date: 2023/6/28
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="http://localhost:8181/learnjsp/upload" method="post">
    <input type="file" name="fil">
    <input type="text" value="aaa" name="user">
    <input type="submit" value="提交">
</form>
</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: echo 小戴
  Date: 2023/7/5
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table style="border:1px solid black">
    <tr>
        <th>书名</th>
        <th>价格</th>
        <th>作者</th>
        <th>库存</th>
        <th>销量</th>
        <th colspan="2">操作</th>
    </tr>
    <c:forEach items="${requestScope.page.items}" var="book">
        <tr>
            <td>${book.name}</td>
            <td>${book.price}</td>
            <td>${book.author}</td>
            <td>${book.sales}</td>
            <td>${book.stock}</td>
            <td><a href="http://localhost:8181/bookStore/bookList?action=updateBook&param=${book.id}">修改</a></td>
            <td><a href="#">删除</a></td>
        </tr>
    </c:forEach>

</table>
<%@include file="/public/pageNav.jsp" %>
<a href="http://localhost:8181/bookStore/pages/addBook.jsp">添加图书</a>
</body>
</html>

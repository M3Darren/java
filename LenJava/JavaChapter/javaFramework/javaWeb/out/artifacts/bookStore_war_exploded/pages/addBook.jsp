<%--
  Created by IntelliJ IDEA.
  User: echo 小戴
  Date: 2023/7/5
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${requestScope.action!=null?requestScope.action:"addBook"}
<form action="http://localhost:8181/bookStore/bookList" method="get" style="margin: 100px auto;">
    <input type="hidden" name="action" value="${requestScope.action!=null?requestScope.action:"addBook"}" id="">
    <input type="hidden" name="id" value="${requestScope.book.id}">
    <label for="bookname">书名：<input type="text" name="name" id="bookname" value="${requestScope.book.name}" ></label>
    <label for="author">作者：<input type="text" name="author" id="author"  value="${requestScope.book.author}"></label>
    <label for="price">售价：<input type="text" name="price" id="price" value="${requestScope.book.price}"></label>
    <label for="sales">销量：<input type="text" name="sales" id="sales" value="${requestScope.book.sales}"></label>
    <label for="stock">库存：<input type="text" name="stock" id="stock" value="${requestScope.book.stock}"></label>
    <label for="submit"> <input type="submit"  id="submit"></label>
</form>
</body>
</html>

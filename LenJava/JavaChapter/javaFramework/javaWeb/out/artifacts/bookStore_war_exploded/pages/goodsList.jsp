<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: echo 小戴
  Date: 2023/7/13
  Time: 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <style>
    ul{
      width: 100%;
    }
    ul>li{
      list-style: none;
      margin: 20px 10px;
      float: left;
      width: 20%;
      text-align: center;
    }
    li>div,img{
      width: 100%;
    }
  </style>
  <base href="http://localhost:8181/bookStore/">
</head>
<body>
<%@include file="../index.jsp"%>
<ul>
  <c:forEach items="${requestScope.bookList}" var="goods">
    <li>
      <div style="border: 1px solid black">
        <img src="${goods.imgPath}" alt="">
        <p>${goods.name}</p>
        <p>${goods.author}</p>
        <p>${goods.price}</p>
        <a href="cartList?action=addCart&id=${goods.id}">添加购物车</a>
      </div>
    </li>
  </c:forEach>
</ul>
</body>
</html>

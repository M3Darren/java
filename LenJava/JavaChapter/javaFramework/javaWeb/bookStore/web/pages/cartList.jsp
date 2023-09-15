<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: echo 小戴
  Date: 2023/7/13
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        ul {
            width: 98%;
            height: 400px;
            margin: 50px auto;
            border: 1px black solid;
        }

        #tit {
            width: 100%;
            float: left;
            text-align: center;
        }

        ul > li {
            list-style: none;
            margin: 20px 10px;
            float: left;
            width: 20%;
            text-align: center;
        }

        li > div, img {
            width: 100%;
        }
    </style>
    <base href="http://localhost:8181/bookStore/">
</head>
<body>
<%@include file="../index.jsp" %>
<ul>

    <c:forEach items="${sessionScope.cart.items}" var="item">
        <li>
            <div>
                <p>${item.value.name}</p>
                <p><input type="text" value="${item.value.count}" goodsId="${item.value.id}" class="updateGood"></p>
                <p>${item.value.price}</p>
                <p>${item.value.totalPrice}</p>
            </div>
            <a href="cartList?action=deleteItem&id=${item.value.id}">从购物车中删除</a>
        </li>
    </c:forEach>
</ul>

<h3 id="tit">总数：${sessionScope.cart.totalCount}；总价：${sessionScope.cart.totalPrice}；<a href="cartList?action=clear">清空购物车</a>
    <a href="orderList?action=createOrder">结算</a>
</h3>

<script type="text/javascript">
   window.onload=function (){
       var update = document.getElementsByClassName("updateGood");

       for (let i = 0; i < update.length; i++) {
           update[i].onblur = function () {
               window.location.href = "cartList?action=updateItem&id=" + this.getAttribute("goodsId") + "&count=" + this.value;
           }
       }
   }

</script>
</body>

</html>

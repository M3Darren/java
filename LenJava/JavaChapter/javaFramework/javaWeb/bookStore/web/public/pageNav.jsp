<%--
  Created by IntelliJ IDEA.
  User: echo 小戴
  Date: 2023/7/11
  Time: 13:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <base href="http://localhost:8181/bookStore/">
</head>
<body>
<p>
    <a href="${requestScope.page.url}">首页</a>&nbsp;&nbsp;
    <c:if test="${requestScope.page.pageNo!=1}"><a
        href="${requestScope.page.url}&pageNo=${requestScope.page.pageNo-1}">上一页</a>&nbsp;&nbsp;</c:if>

    <c:choose>
        <%--    情形一：总页数小于5--%>
    <c:when test="${requestScope.page.pageTotal<=5}">
        <c:set var="begin" value="1"></c:set>
        <c:set var="end" value="${requestScope.page.pageTotal}"></c:set>
    </c:when>
        <%--    情形二：总页数大于5--%>
    <c:when test="${requestScope.page.pageTotal>5}">
    <c:choose>
        <%--    情形2.1：当前页码为1，2。3，页码范围1~5--%>
    <c:when test="${requestScope.page.pageNo<=3}">
        <c:set var="begin" value="1"></c:set>
        <c:set var="end" value="5"></c:set>
    </c:when>
        <%--    情形2.2：当前页码为后三个8,9,10,页码范围：总页码-4 ~总页码--%>
    <c:when test="${requestScope.page.pageNo>requestScope.page.pageTotal-3}">
        <c:set var="begin" value="${requestScope.page.pageTotal-4}"></c:set>
        <c:set var="end" value="${requestScope.page.pageTotal}"></c:set>
    </c:when>
        <%--    情形2.3：当前页码为：4,5,6,7；页码范围：当前页码-2~当前页码+2--%>
    <c:otherwise>
        <c:set var="begin" value="${requestScope.page.pageNo-2}"></c:set>
        <c:set var="end" value="${requestScope.page.pageNo+2}"></c:set>
    </c:otherwise>
    </c:choose>
    </c:when>
    </c:choose>

    <c:forEach begin="${begin}" end="${end}" var="i">
    <c:if test="${i==requestScope.page.pageNo}">【${i}】</c:if>
    <c:if test="${i != requestScope.page.pageNo}">
    <a href="${requestScope.page.url}&pageNo=${i}">${i}</a>
    </c:if>
    </c:forEach>

    <c:if test="${requestScope.page.pageNo!=requestScope.page.pageTotal}"><a
        href="${requestScope.page.url}&pageNo=${requestScope.page.pageNo+1}">下一页</a>&nbsp;&nbsp;</c:if>
    <a href="${requestScope.page.url}&pageNo=${requestScope.page.pageTotal}">尾页</a>
    <a href="">总页数《${requestScope.page.pageTotal}》</a>&nbsp;&nbsp;
    <a href="">总记录数<${requestScope.page.pageTotalCount}></a>&nbsp;&nbsp;
<form action="http://localhost:8181/bookStore/bookList">
    <input type="hidden" name="action" value="getPage">
    跳转到第 <input type="text" name="pageNo"> 页
    <input type="submit" value="提交">
</form>
</p>
</body>
</html>

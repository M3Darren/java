<%@ page import="java.util.List" %>
<%@ page import="pojo.Person" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: echo 小戴
  Date: 2023/6/28
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <c:set scope="request" var="req" value="sss" />
${requestScope.req}

<c:if test="${1!=2}">
    这里判断成功
</c:if>

<c:choose>
    <c:when test="${'sss'.equals(requestScope.req)}">
        requestScope.req值为：sss
    </c:when>
    <c:when test="${'ss'.equals(requestScope.req)}">
        requestScope.req值为：ss
    </c:when>

<%--    这里是多路判断--%>
    <c:otherwise>
        <c:choose>
            <c:when test="${'a'.equals(requestScope.req)}">
                还可是别的字母啊
            </c:when>
        </c:choose>
    </c:otherwise>
</c:choose>

<c:forEach begin="1" end="10" var="i">
    ${i}
</c:forEach>
<%--遍历数组--%>
<% request.setAttribute("arr",new String[]{"121","qwq"}); %>
<c:forEach items="${requestScope.arr}" var="item">
    ${item} <br>
</c:forEach>

<%--遍历list--%>
<%
    List<Person> people = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
        people.add(new Person("namew"+i,i,null,null));
    }
    request.setAttribute("p",people);
%>
 <table style="border: 1px">
<c:forEach items="${requestScope.p}" var="person" varStatus="status" step="1">
    <tr>
        <td>${person.name}</td>
        <td>${person.age}</td>
        <td>${status.current}</td>
    </tr>
</c:forEach>
 </table>

</body>
</html>

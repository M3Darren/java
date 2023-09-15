<%@ page import="pojo.Person" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: echo 小戴
  Date: 2023/6/27
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Person person = new Person();
    person.setName("张三");
    person.setAge(18);
    person.setTelephone(new String[]{"15527528193","15926874905"});
    HashMap<String, Object> personHashMap = new HashMap<>();
    personHashMap.put("key1","刷剧");
    personHashMap.put("key2","学技术");
    personHashMap.put("key3","提升自我");
    person.setHobby(personHashMap);

    pageContext.setAttribute("person",person);
%>
${person.name}
${person.telephone[0]}
</body>
</html>

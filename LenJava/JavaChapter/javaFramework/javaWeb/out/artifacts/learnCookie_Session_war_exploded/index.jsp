<%--
  Created by IntelliJ IDEA.
  User: echo 小戴
  Date: 2023/7/12
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <base href="http://localhost:8181/learnCS/">
  </head>
  <body>
  <ul>
    <li><a href="learnCookie?action=createCookie">创建cookie</a></li>
    <li><a href="learnCookie?action=igetCookie">获取cookies</a></li>
    <li><a href="learnCookie?action=updateCookie">修改cookie</a></li>
    <li><a href="learnCookie?action=setCookiePath">设置cookie的path</a></li>
  </ul>

  <ol>
    <li><a href="learnSession?action=createSession">创建session</a></li>
    <li><a href="learnSession?action=setValue">设置session值</a></li>
    <li><a href="learnSession?action=getValue">获取session值</a></li>
    <li><a href="learnSession?action=deleteSession">销毁session</a></li>
  </ol>

  <form action="learnKaptcha?action=testLogin">
    <input type="hidden" name="action" value="testLogin" id="">
    验证码：<input type="text" name="code"  >
    <img src="kaptcha.jpg" id="code" alt="">
    <input type="submit" value="提交" name=""  >
  </form>

  </body>
<script>
  window.onload=function (){
   var code = document.getElementById("code");
   code.onclick=function (){
     this.setAttribute("src","${basePath}/learnCS/kaptcha.jpg?param=+"+Math.random()+new Date() )
     console.log(this)
   }

  }
</script>
</html>

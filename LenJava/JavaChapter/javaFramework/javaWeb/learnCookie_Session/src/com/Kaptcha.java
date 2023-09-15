package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

public class Kaptcha extends BasicServlet {
     public void testLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//               获取session中的验证码
          Object token = req.getSession().getAttribute(KAPTCHA_SESSION_KEY);
//          删除session中的验证码
          req.getSession().removeAttribute(KAPTCHA_SESSION_KEY);
//          获取用户提交的验证码
          String code = req.getParameter("code");
          if (token!=null && token.equals(code)){
               System.out.println("ok");
          }else{
               resp.sendRedirect(req.getContextPath());
          }


     }
}

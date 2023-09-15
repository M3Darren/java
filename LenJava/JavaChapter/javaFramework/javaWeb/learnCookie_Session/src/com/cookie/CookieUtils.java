package com.cookie;

import javax.servlet.http.Cookie;

public class CookieUtils {
    public static Cookie findCookie(String name,Cookie[] cookie){
        if(name==null || cookie==null || cookie.length==0)return null;
        for (Cookie cookie1 : cookie) {
            if(name.equals(cookie1.getName()))return cookie1;
        }
        return null;
    }
}

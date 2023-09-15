package com.loy.utils;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;

public class WebUtils {
    public static <T> T copyParamToBean(HttpServletRequest req,T bean){
//        将请求参数注入到bean中
        try {
            BeanUtils.populate(bean,req.getParameterMap());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        return bean;
    }


}

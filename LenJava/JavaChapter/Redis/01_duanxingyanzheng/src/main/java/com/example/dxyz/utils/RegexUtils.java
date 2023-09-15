package com.example.dxyz.utils;
import cn.hutool.core.util.ReUtil;

public  class RegexUtils {
    public static boolean isPhoneInvalid(String phone){
        return ReUtil.isMatch(RegexPatterns.PHONE_REGEX,phone);
    }


}

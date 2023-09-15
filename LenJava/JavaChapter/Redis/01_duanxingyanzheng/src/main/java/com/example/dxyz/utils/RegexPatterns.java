package com.example.dxyz.utils;

public abstract class RegexPatterns  {
    /**
     * 手机号正则
     */
    public static final String PHONE_REGEX="^1([34578])\\d{9}$";
    /**
     * 邮箱正则
     */
    public static final String EMAIL_REGEX="^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
    /**
     * 验证码正则
     * ^[a-zA-Z0-9]{6}$
     */
    public static final String VERIFY_REGEX="^[a-zA-Z0-9]{6}$";
    /**
     * 密码正则
     * 包含至少一个大写字母、一个小写字母、一个数字和一个特殊字符，长度为8-20个字符
     *^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[!@#$%^&*()-=_+]).{8,20}$
     */
    public static final String PASSWORD_REGEX="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()-=_+]).{8,20}$";
}

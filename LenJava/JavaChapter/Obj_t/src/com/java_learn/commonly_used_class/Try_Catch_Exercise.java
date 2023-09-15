package com.java_learn.commonly_used_class;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 异常练习题
 */
public class Try_Catch_Exercise {
    public static void main(String[] args) {
            try {
                regs("sad","12312","@cc.vom");
            }catch (Exception e){
                System.out.println(e);
            }
    }
    /*
    需求：校验用户输入
    1.名字不能为空且长度在2~4
    2.密码不能包含字母
    3.邮箱必须有@和.  并且@在.前面
     */
    public static void   regs(String name,String pwd,String email){
            if(!((name!=null) && (pwd!=null) && (email!=null))){
                throw new RuntimeException("三个参数都不能为空");
            }

            char[] value=pwd.toCharArray();
            for (int i = 0; i < pwd.length(); i++) {
                if(value[i]<'0' || value[i]>'9' ){
                throw new RuntimeException("密码只能是数字");
                }
            }

            int i=email.indexOf("@");
            int j=email.indexOf(".");
            if(!(i>0 && i<j)){
                throw new RuntimeException("邮箱格式不正确");
            }
    }
}

package com.java_learn.commonly_used_class.stringbuffer_;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary StringBuffer常用方法
 */
public class StringBuffer_method {
    public static void main(String[] args) {
            StringBuffer sb=new StringBuffer("ECHO:");
            //增：append();
        sb.append("java,").append("go;");
        System.out.println(sb);
//        删：delete()
        sb.delete(1,2);
        System.out.println(sb);
//        改：replace(start,end,str);
        sb.replace(2,3,"haha");
        System.out.println(sb);
//        查：indexOf(index);
        int index=sb.indexOf("java");
        System.out.println(index);
//        插：insert(index,str);
        sb.insert(index,"ok");
        System.out.println(sb);


    }
}

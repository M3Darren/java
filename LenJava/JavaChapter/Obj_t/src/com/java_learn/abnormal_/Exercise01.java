package com.java_learn.abnormal_;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 注意return细节
 */
public class Exercise01 {
    public static void main(String[] args) {
        System.out.println( Ex01.method());
    }

}
class Ex01{
    public static int method(){
        String[] name=new String[3];
        int i=0;
        try {
            i++;
            if(name[1].equals("aa")){
                name[1]="bb";
            }else{
                name[3]="ccc";//此时数组索引越界
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            return i++;
        }catch (NullPointerException e){
            System.out.println(e);
            return i++;//此时不会立即执行return，而是执行tmp=i++，执行完finally再return tmp;
        }finally {
            i++;
            System.out.println("i="+i);
        }
return -1;
    }
}
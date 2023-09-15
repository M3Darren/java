package com.java_learn.abnormal_;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 父类异常在后，子类异常在前，发生异常只会匹配一个catch
 */
public class Many_catch {
    public static void main(String[] args) {
        Mc01 mc01 = new Mc01();

        mc01=null;
        try {
            mc01.getName();
            int n=10/0;
        }catch (NullPointerException e){
            System.out.println(e);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (Exception e){//父类异常在最后
            System.out.println(e);
        }
    }
}
class Mc01{
    private String name="jack";

    public String getName() {
        return name;
    }
}

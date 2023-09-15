package com.java_learn.generic_;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class Generic_02 {
    public static void main(String[] args) {
        Pe<String> stringPe = new Pe<>("aa");
        System.out.println(stringPe.getS());
    }
}
class Pe<E>{//E的具体类型根据定义时确定
    E s;
    public  E  ges(E s){
        return s;
    }
    public Pe(E s) {
        this.s = s;
    }
    public E getS() {
        return s;
    }
}

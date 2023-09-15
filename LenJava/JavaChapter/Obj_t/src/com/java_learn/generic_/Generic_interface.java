package com.java_learn.generic_;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class Generic_interface {
    public static void main(String[] args) {

    }
}
interface Dew<T,R>{
//    T name;由于接口的属性都是静态的不可使用泛型
   <K> void met();
}
class G_i implements Dew<String,Integer>{
    @Override
    public <String> void met() {

    }
}
package com.java_learn.generic_;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class Generic_method {
    public static void main(String[] args) {
        G_m g_m = new G_m();
        g_m.met(1);
    }
}
class G_m{
    public <K> void met(K a){
        System.out.println(a.getClass());
    }
}
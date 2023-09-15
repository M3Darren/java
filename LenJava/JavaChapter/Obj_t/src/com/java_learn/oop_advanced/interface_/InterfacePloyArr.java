package com.java_learn.oop_advanced.interface_;

public class InterfacePloyArr {
    public static void main(String[] args) {
        Run[] runs=new Run[2];
        runs[0]=new Camera();
        runs[1]=new Usb();
        for (int i = 0; i < runs.length; i++) {
            runs[i].start();
            if(runs[i] instanceof Camera){
                ((Camera) runs[i]).pictures();
            }
        }
    }
}

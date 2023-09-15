package com.java_learn.oop_advanced.inner_;

public class Exercise01 {
    public static void main(String[] args) {
        Cellphone.alarmclock(
                new Bell() {
                    @Override
                    public void ring() {
                        System.out.println("起床了");
                    }
                }
        );
    }
}
interface Bell{
    void ring();
}
class Cellphone{
    public static void alarmclock( Bell b){
        b.ring();
    }
}
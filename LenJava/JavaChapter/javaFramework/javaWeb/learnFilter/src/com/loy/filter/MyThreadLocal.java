package com.loy.filter;

public class MyThreadLocal {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 3; i++) {
            new Thread(new Task()).start();
        }
    }
    public static ThreadLocal<Object> threadLocal=new ThreadLocal<>();

    public static class Task implements Runnable{

        @Override
        public void run() {
            threadLocal.set("value1");
            threadLocal.set("value2");//只能关联一个数据，若需要存多个需要实例化多个ThreadLocal
            System.out.println(threadLocal.get());
        }
    }


}

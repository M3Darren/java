package com.java_learn.many_thread;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 线程常用方法
 */
public class mt_Met {
    public static void main(String[] args) throws InterruptedException {
        Mt1 mt1 = new Mt1();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程"+Thread.currentThread().getName()+"正在执行");
            if (i==4){
                Thread thread = new Thread(mt1);
                thread.start();
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            Thread.sleep(1000);
        }

    }
}
class  Mt1 implements Runnable{
private int i=0;
    @Override
    public void run() {
        while (true){
            System.out.println("线程"+Thread.currentThread().getName()+"正在执行"+i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i>10){
                break;
            }
        }
    }
}
package com.java_learn.many_thread;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 设置守护线程
 */
public class m_Guard {
    public static void main(String[] args) throws InterruptedException {
        My_Guard my_guard = new My_Guard();
        my_guard.setDaemon(true);//设置守护线程
        my_guard.start();
        for (int i = 0; i <5 ; i++) {
            System.out.println("主线程执行"+i);
            Thread.sleep(1000);
        }
    }
}
class My_Guard extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("子线程"+Thread.currentThread().getName()+"正在工作");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

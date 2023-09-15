package com.java_learn.many_thread;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 多线程使用
 */
public class m_Thread {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("正在执行主线程"+Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }
}
class Cat extends Thread{
    @Override
    public void run() {
        int count=0;
        //执行输出程序
        while(true){
            try {
                count++;
                System.out.println("正在执行线程"+Thread.currentThread().getName());
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
            if(count==10)break;
        }
    }
}

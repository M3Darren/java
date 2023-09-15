package com.java_learn.many_thread;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 模拟售票，会出现超卖现象，即需要解决线程同步和互斥问题
 */
public class m_T_Exercise {
    public static void main(String[] args) {
        SellTicket sellTicket = new SellTicket();
        new Thread(sellTicket).start();
        new Thread(sellTicket).start();
        new Thread(sellTicket).start();
    }
}
class SellTicket implements Runnable{
private static int count=20;
    @Override
    public void run() {
        while (true){
            if (count<=0){
                System.out.println("已卖完");
                break;
            }else{
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                --count;
                System.out.println("窗口"+Thread.currentThread().getName()+"正在售卖；剩余票数："+count);
            }

        }
    }
}
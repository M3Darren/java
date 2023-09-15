package com.java_learn.many_thread;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 使用线程同步解决超卖问题
 */
public class m_T_synchronized {
    public static void main(String[] args) {
        SellTicket01 sellTicket01 = new SellTicket01();

        new Thread(sellTicket01).start();
        new Thread(sellTicket01).start();
        new Thread(sellTicket01).start();
    }

}
class SellTicket01 implements Runnable{
    int ticket=20;
private boolean loop=true;
    @Override
    public void run() {
        while (loop){
            sell();
        }
    }
    public synchronized void sell(){//方法同步
        if(ticket<=0){
            System.out.println("已售完。。。");
            loop=false;
            return;
        }
        System.out.println("窗口"+Thread.currentThread().getName()+"正在售卖;当前票数："+--ticket);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void met(){
        synchronized (this){//同步代码块
            System.out.println("ok");
        }
    }
    public static void met1(){//当在静态方法下不可使用this来加锁
        synchronized (SellTicket01.class){
            System.out.println("static");
        }
    }


}

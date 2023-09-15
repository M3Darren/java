package com.java_learn.many_thread;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class m_t_Exit {
    public static void main(String[] args) throws InterruptedException {
        Exit_mt exit_mt = new Exit_mt();
        new Thread(exit_mt).start();
        Thread.sleep(10*1000);//使主线程休眠十秒钟，然后停止子线程
        exit_mt.setFlag(false);

    }
}
class Exit_mt implements Runnable{
    private boolean flag=true;

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        while (flag){
            System.out.println("线程"+Thread.currentThread().getName()+"正在执行");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
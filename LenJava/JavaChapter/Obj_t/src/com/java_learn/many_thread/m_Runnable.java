package com.java_learn.many_thread;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 使用接口可以避免单继承的限制
 */
public class m_Runnable {
    public static void main(String[] args) {
        System.out.println("这里是线程"+Thread.currentThread().getName());
        Dog dog = new Dog();
        //实现了Runnable但是不能直接使用start方法，
        Thread thread = new Thread(dog);//底层使用代理模式实现
        thread.start();//底层流程start->start0->run(判断target是否为空）->（不为空调用target.run()方法）
    }
}
class Dog implements Runnable{
    @Override
    public void run() {
        System.out.println("正在执行线程"+Thread.currentThread().getName());
        try {
           Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
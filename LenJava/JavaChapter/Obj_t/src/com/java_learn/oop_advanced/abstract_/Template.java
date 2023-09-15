package com.java_learn.oop_advanced.abstract_;

public class Template {
    public static void main(String[] args) {
            /**
            *模板设计模式
             * 当多个任务有相同部分时
             * 可提取相同作为模板
             * 不同的抽象到父类方法
             * */
        Tmp1 sub1 = new Sub1();
        sub1.caluateTime();
        Tmp1 sub2 = new Sub2();
        sub2.caluateTime();
    }
}
abstract class  Tmp1{
    public abstract void job();
    public void caluateTime(){
        long start=System.currentTimeMillis();//计算当前时间
        job();//具体工作子类实现
        //此时job方法会动态绑定
        long end=System.currentTimeMillis();//计算当前时间
        System.out.println("job方法工作了"+(end-start)+"ms");//计算出job运行时间
    }
}
class Sub1 extends Tmp1{
    public void job(){//执行工作不同
        int i=0;
        while (i<2000000000){
            i++;
        }
    }
}
class Sub2 extends Tmp1{
    @Override
    public void job() {//执行工作不同
        for (int i = 0; i < 1000000; i++) {
            i+=0.1;
        }
    }
}
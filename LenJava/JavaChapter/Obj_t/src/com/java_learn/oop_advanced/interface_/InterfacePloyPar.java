package com.java_learn.oop_advanced.interface_;

public class InterfacePloyPar {
    public static void main(String[] args) {
        /**
         * 一个电脑有多个接口
         * 实现usb接入电脑
         * 相机接入电脑
         */
        Computer computer = new Computer();
        Usb usb = new Usb();
        Camera camera = new Camera();
        computer.work(usb);
        computer.work(camera);
    }
}
interface Run{
    void start();
    void stop();
}
class Computer{
    public void work(Run run_i){
        run_i.start();
        run_i.stop();
    }
}
class Camera implements Run{
    public void pictures(){//向上转型的类中特有方法使用instanceof判断如何向下转型执行特有方法
        System.out.println("相机正在照相");
    }
    @Override
    public void start() {
        System.out.println("相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作");
    }
}
class Usb implements Run{
    @Override
    public void start() {
        System.out.println("usb开始工作");
    }

    @Override
    public void stop() {
        System.out.println("usb停止工作");
    }
}
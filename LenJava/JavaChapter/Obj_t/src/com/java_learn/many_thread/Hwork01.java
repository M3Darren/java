package com.java_learn.many_thread;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class Hwork01 {
    public static void main(String[] args) {

    }
}
class H1 implements Runnable{
    private boolean flag;

    public H1(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        while (flag){
            System.out.println(Math.random()*100+1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class H2 implements Runnable {


    @Override
    public void run() {
    }
}
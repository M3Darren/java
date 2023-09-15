package com.java_learn.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary Java事件处理机制
 */
public class Ev01 extends JFrame {
    private Ep pl=null;
    public static void main(String[] args) {
        Ev01 ev01 = new Ev01();

    }
    public Ev01(){
        pl= new Ep();

        this.add(pl);
        this.addKeyListener(pl);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
class Ep extends JPanel implements KeyListener {
int x=100;
int y=100;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,30,30);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {//键盘按下触发事件
        if (e.getKeyCode()==KeyEvent.VK_DOWN){
            y+=2;

        }else if(e.getKeyCode()==KeyEvent.VK_UP){
            y-=2;
        }else if(e.getKeyCode()==KeyEvent.VK_LEFT){
            x-=2;
        }else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            x+=2;
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
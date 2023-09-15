package cn.demo.tankwar;

import javax.swing.*;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class Dp_t extends JFrame {
    Panel_ pl=null;
    public static void main(String[] args) {
        Dp_t dp_t = new Dp_t();
    }
    public Dp_t(){
        pl=new Panel_();
        new Thread(pl).start();
        this.add(pl);
        this.setSize(1000,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addKeyListener(pl);
    }
}

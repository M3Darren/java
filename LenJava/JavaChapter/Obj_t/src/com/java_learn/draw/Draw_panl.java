package com.java_learn.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 在面板绘制图形
 */
public class Draw_panl extends JFrame {
    //定义一个面板
    private Mypanel mp=null;
    public static void main(String[] args) {
        Draw_panl draw_panl = new Draw_panl();
    }
    //初始化面板
    public Draw_panl(){
        mp=new Mypanel();
        //将面板加入画框中
        this.add(mp);
        //设置画框的宽高
        this.setSize(200,200);
        //画框可见
        this.setVisible(true);
        //设置叉掉程序jvm释放资源
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class Mypanel extends JPanel{
    @Override
    public void paint(Graphics g) {//绘图方法
        super.paint(g);
//        g.drawLine(1,4,2,4);//画直线
//        g.drawOval(0,0,100,100);//画椭圆边框
//        g.drawRect(1,20,20,40);//画矩形边框
//        g.setColor(Color.red);//设置填充色
//        g.fillOval(10,10,50,50);//填充椭圆
//        g.fillRect(20,20,50,50);//填充矩形

//        Image image=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bg.jpg"));
//        g.drawImage(image,20,20,100,100,this);//画图片

//        g.setFont(new Font("隶书",Font.BOLD,20));
//        g.drawString("hello world",100,100);

    }
}

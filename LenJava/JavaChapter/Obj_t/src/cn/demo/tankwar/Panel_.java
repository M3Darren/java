package cn.demo.tankwar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 绘图区
 */
public class Panel_ extends JPanel implements KeyListener, Runnable {
    Hero mt = null;
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTanksSize = 3;

    public Panel_() {
        mt = new Hero(500, 100);
        for (int i = 0; i < enemyTanksSize; i++) {
            enemyTanks.add(new EnemyTank(100 * (i + 1), 0));
            new Thread(enemyTanks.get(i)).start();

        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //绘制面板
        g.fillRect(0, 0, 1000, 480);
        //绘制玩家坦克
        if(mt!=null && mt.isLife){
            drawTank(mt.getX(), mt.getY(), g, mt.getDirect(), 0);
        }
        //判断玩家子弹是否存活，开始绘制子弹

        for (Bullet b : mt.map) {
            if (b != null && b.isLife) {
                g.draw3DRect(b.getX(), b.getY(), 1, 1, false);
            }
        }
        //绘制敌方坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank t = enemyTanks.get(i);
            //判断敌坦克是否存活
            if (t.isLife) {
                drawTank(t.getX(), t.getY(), g, t.getDirect(), 1);
                //绘制敌方子弹
                for (int j = 0; j < t.shot.size(); j++) {
                    Bullet bullet = (Bullet) t.shot.get(j);
                    if (bullet.isLife) {
                        g.draw3DRect(bullet.getX(), bullet.getY(), 1, 1, false);
                    } else {
                        t.shot.remove(bullet);
                    }
                }
            }

        }


    }

    //画坦克的方法

    /**
     * @param x      坦克左上角坐标
     * @param y      坦克左上角纵坐标
     * @param g      画笔
     * @param direct 坦克的方向
     * @param type   坦克的类型
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0://玩家坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌人的坦克
                g.setColor(Color.yellow);
                break;
        }
        //判断坦克的方向
        switch (direct) {
            case 0://正向，朝上
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1://，朝右
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2://正向，朝上
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3://，朝右
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;
        }
    }


    //判断子弹击中坦克
    public void hitTnak(Bullet shot, Tank enemyTank) {
        switch (enemyTank.getDirect()) {
            case 0:
            case 2:
                if (shot.getX() > enemyTank.getX() && shot.getX() < enemyTank.getX() + 40 && shot.getY() > enemyTank.getY() && shot.getY() < enemyTank.getY() + 60) {
                    shot.isLife = false;
                    enemyTank.isLife = false;

                        enemyTanks.remove(enemyTank);
                        mt.map.remove(shot);

                }
                break;
            case 1:
            case 3:
                if (shot.getX() > enemyTank.getX() && shot.getX() < enemyTank.getX() + 60 && shot.getY() > enemyTank.getY() && shot.getY() < enemyTank.getY() + 40) {
                    shot.isLife = false;
                    enemyTank.isLife = false;
                    enemyTanks.remove(enemyTank);
                    mt.map.remove(shot);
                }
        }
    }
public void hithero(){
    for (int i = 0; i <enemyTanks.size() ; i++) {
        for (int j=0;j<enemyTanks.get(i).shot.size();j++){
            Bullet shot=enemyTanks.get(i).shot.get(j);
          if (shot.isLife && mt.isLife){
              hitTnak(shot,mt);
          }
        }
    }
}
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            mt.setDirect(0);
            if (mt.getY() > 0) {
                mt.moveUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            mt.setDirect(1);
            if (mt.getX() < 1000) {
                mt.moveRight();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            mt.setDirect(2);
            if (mt.getY() + 60 < 750) {
                mt.moveDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            mt.setDirect(3);
            if (mt.getX() > 0) {
                mt.moveLeft();
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_J) {

            mt.shot();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (mt.bullet != null && mt.bullet.isLife) {
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    for (int j = 0; j < mt.map.size(); j++) {
                        hitTnak(mt.map.get(j), enemyTank);
                    }

                }
            }
            hithero();
            this.repaint();
        }
    }

}

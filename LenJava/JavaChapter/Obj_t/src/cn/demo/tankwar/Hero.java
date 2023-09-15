package cn.demo.tankwar;

import java.util.*;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 玩家坦克
 */
public class Hero extends Tank{
    Bullet bullet=null;
    public Hero(int x, int y) {
        super(x, y);
    }
    Vector<Bullet> map=new Vector<>();
    public void shot(){

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        switch (getDirect()){
            case 0:
                bullet=new Bullet(getX()+20,getY(),0);
                map.add(bullet);
                break;
            case 1:
                bullet=new Bullet(getX()+60,getY()+20,1);
                map.add(bullet);
                break;
            case 2:
                bullet=new Bullet(getX()+20,getY()+60,2);
                map.add(bullet);
                break;
            case 3:
                bullet=new Bullet(getX(),getY()+20,3);
                map.add(bullet);
                break;
        }
        for (Bullet b:map){
            new Thread(b).start();
        }
    }
}

package cn.demo.tankwar;

import java.util.Map;
import java.util.Vector;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class EnemyTank extends Tank implements Runnable{
   Vector<Bullet> shot=new Vector<>();
   Bullet bullet=null;
   boolean isLife=true;
    public EnemyTank(int x, int y) {
        super(x, y);
        this.setDirect(2);
    }

    @Override
    public void run() {

        while (true){
            if (shot.size()!=3){
                switch (getDirect()){
                    case 0:
                        bullet=new Bullet(getX()+20,getY(),0);

                        break;
                    case 1:
                        bullet=new Bullet(getX()+60,getY()+20,1);

                        break;
                    case 2:
                        bullet=new Bullet(getX()+20,getY()+60,2);

                        break;
                    case 3:
                        bullet=new Bullet(getX(),getY()+20,3);

                        break;
                }
                shot.add(bullet);
                new Thread(bullet).start();
            }

            switch (this.getDirect()){
                case 0:
                   if(getY()>0){
                       moveUp();

                   }

                    break;
                case 1:
                   if(getX()<1000){
                       moveRight();
                   }
                    break;
                case 2:
                   if(getY()+60<750){
                       moveDown();
                   }
                    break;
                case 3:
                   if(getX()>0){
                       moveLeft();
                   }
                    break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.setDirect((int)(Math.random()*4));
            if (!isLife){
                break;
            }
        }
    }
}

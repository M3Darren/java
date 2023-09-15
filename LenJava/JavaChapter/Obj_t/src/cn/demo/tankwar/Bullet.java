package cn.demo.tankwar;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class Bullet implements Runnable{
    private int x;
    private int y;
private int speed=10;
private int tank_direct;
public boolean isLife=true;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }



    public Bullet(int x, int y, int tank_direct) {
        this.x = x;
        this.y = y;
        this.tank_direct=tank_direct;
    }

    @Override
    public void run() {
        while (true){
            switch (tank_direct){
                case 0:
                    y-=speed;
                    break;
                case 1:
                    x+=speed;
                    break;
                case 2:
                    y+=speed;
                    break;
                case 3:
                    x-=speed;
                    break;
            }
//            System.out.println(x+" - "+y);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (!((x>=0 && x<=1000) && (y>=0 && y<=500)) && isLife){
                System.out.println("子弹线程退出");
                isLife=false;
                break;
            }
        }

    }
}

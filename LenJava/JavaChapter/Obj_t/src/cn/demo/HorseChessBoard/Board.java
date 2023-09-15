package cn.demo.HorseChessBoard;

import java.awt.*;
import java.util.ArrayList;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class Board {
    private static int X=6;
    private static int Y=6;
    private static int[][] chessBoard=new int[Y][X];
    private static boolean[] visited=new boolean[X*Y];//记录是否走过该位置
    private static boolean finished=false;//记录是否遍历完棋盘


    public static void main(String[] args) {

        int row=2;
        int col=2;
        traversalChessBoard(chessBoard,row-1,col-1,1);
        //显示当前棋盘状态
        for (int[] rows:chessBoard){
            for (int step:rows){
                System.out.print(step+"\t");
            }
            System.out.println();
        }
    }

    //遍历棋盘并且将马走的地方记录下来
    public static void traversalChessBoard(int[][] chessBoard,int row,int col,int step){
        chessBoard[row][col]=step;
        //设置该位置已走过
        visited[row*X+col]=true;
        //获取当前点可以走的位置
        ArrayList<Point> next = next(new Point(col, row));
        while (!next.isEmpty()){
            //若不为空，取出一个点
            Point remove = next.remove(0);
            //判断该位置是否走过
            if (!visited[remove.y*X+remove.x]){
                traversalChessBoard(chessBoard,remove.y, remove.x,step+1);
            }
        }
        //退出循环后，是否遍历成功；若不成功则重置相应值，开始回溯
        if(step<X*Y && !finished){
            chessBoard[row][col]=0;
            visited[row*X+col]=false;
        }

    }
    //编写方法，判断下次可走位置
    public static ArrayList<Point> next(Point curPoint){
        ArrayList<Point> points = new ArrayList<>();
        Point point = new Point();
        //判断5位置是否能走
        if((point.x=curPoint.x-2)>=0 && (point.y=curPoint.y-1)>=0){
            points.add(new Point(point));
        }
        //判断6位置是否能走
        if((point.x=curPoint.x-1)>=0 && (point.y=curPoint.y-2)>=0){
            points.add(new Point(point));
        }
        //判断7位置是否能走
        if((point.x=curPoint.x+1)<X && (point.y=curPoint.y-2)>=0){
            points.add(new Point(point));
        }
        //判断0位置是否能走
        if((point.x=curPoint.x+2)<X && (point.y=curPoint.y-1)>=0){
            points.add(new Point(point));
        }
        //判断1位置是否能走
        if((point.x=curPoint.x+2)<X && (point.y=curPoint.y+1)<Y){
            points.add(new Point(point));
        }
        //判断2位置是否能走
        if((point.x=curPoint.x+1)<X && (point.y=curPoint.y+2)<Y){
            points.add(new Point(point));
        }
        //判断3位置是否能走
        if((point.x=curPoint.x-1)>=0 && (point.y=curPoint.y+2)<Y){
            points.add(new Point(point));
        }
        //判断4位置是否能走
        if((point.x=curPoint.x-2)>=0 && (point.y=curPoint.y+1)<Y){
            points.add(new Point(point));
        }
        return points;
    }
}

package cn.demo.pocket;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pocket {
   private double balance;//余额
    private String detailp="";//明细
    private double income;//收入
    private double outcome;//支出
private boolean loop=true;
    private Date date=null;
    SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm ");
    Scanner scanner=new Scanner(System.in);
    public void mainMenu(){

        do {
            System.out.println("=============零钱通================");
            System.out.println("\t\t\t1.明   细");
            System.out.println("\t\t\t2.收   益");
            System.out.println("\t\t\t3.消   费");
            System.out.println("\t\t\t4.退   出");
           Scanner scan= new Scanner(System.in);
        System.out.println("请输入编号进行操作（1~4）：");
        switch (scan.nextInt()){
            case 1:
                System.out.println("---------明细------------");
                System.out.print("交易类型\t金额\t\t时间\t\t\t\t余额");
                System.out.println(detailp);

                break;
            case 2:
                this.incomep_m();
                break;
            case 3:
                this.outcome_m();
                break;
            case 4:
                loop=false;
                System.out.println("退出程序");
                break;

        }
        }while (loop);
    }
    public void detail(String type,double come,String time,double balance){

        detailp+="\n"+type+"\t"+come+"\t"+time+"\t"+balance;

    }
    public void incomep_m(){
        System.out.println("收入金额：");
        income=scanner.nextDouble();
        if (income<=0)return;
        date=new Date();
        balance+=income;
        detail("入账：",income,time.format(date),balance);
    }
    public void outcome_m(){
        System.out.println("消费金额：");
        outcome=scanner.nextDouble();
        if (outcome>this.balance || outcome<=0){
            return;
        }
        date=new Date();
        balance-=outcome;
        System.out.println("消费类型：");
        detail(scanner.next(),-outcome, time.format(date),balance );
    }
}

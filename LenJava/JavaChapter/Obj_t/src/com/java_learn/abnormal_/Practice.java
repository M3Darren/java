package com.java_learn.abnormal_;

import java.util.Scanner;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary try-catch实践：判断用户输入的合法性
 */
public class Practice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入：");
        String inputStr=scanner.next();
        while (true){
            try {
                int num=Integer.parseInt(inputStr);
                break;
            }catch (Exception e){
                System.out.println("输入的不是整数,重新输入");
            }
            inputStr=scanner.next();
        }
    }
}

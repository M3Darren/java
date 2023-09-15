package com.java_learn.abnormal_;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 如果没有catch捕获异常，程序执行finally后将退出
 */
public class try_inally {
    public static void main(String[] args) {

        try {
            int n=10/0;
        } finally {
            System.out.println("执行完毕，程序不会往下执行，直接退出。。。");
        }
        System.out.println("后续代码");

    }
}

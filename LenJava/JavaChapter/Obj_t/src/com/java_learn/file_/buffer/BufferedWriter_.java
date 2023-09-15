package com.java_learn.file_.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("./src/src",true));
        bufferedWriter.write("\n这里是BufferedWriter新增内容");
        bufferedWriter.close();
    }
}

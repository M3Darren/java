package com.java_learn.file_.in_output_stream_r_w;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("./src/src",true),"gbk");
        osw.write("hi,world晓呆");
        osw.close();
    }
}

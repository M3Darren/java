package com.java_learn.file_.buffer;

import java.io.*;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class BufferedCopy {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader("./src/src"));
            bw = new BufferedWriter(new FileWriter("./src/Buffer_src"));
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();//根据系统换行，没有的话会连接成一行

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}

package com.java_learn.alllist_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class Exercise_01 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(new News("新冠确诊病例超千万，数百万印度教信徒去恒河圣浴"));
        list.add(new News("男子突然想起两个月前钓的鱼还在网兜里，捞起来议案赶紧放生"));
        Collections.reverse(list);
        for (Object o: list){
            News n=(News) o;
            n.setTitle((n.getTitle()).substring(0,15).concat("..."));
            System.out.println(o);
        }
    }
}
class News{
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return
                "title='" + title + '\'' ;
    }
}
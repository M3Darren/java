package com.java_learn.alllist_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 深刻理解HashSet底层
 */
public class Exercise_05 {
    public static void main(String[] args) {
        //前提重写hashCode和toString
        P p1=new P(1001,"Aa");
        P p2=new P(1002,"Bb");
        P p3=new P(1001,"Cc");
        HashSet hashSet = new HashSet();
            hashSet.add(p1);
            hashSet.add(p2);
            p1.name="Cc";
        System.out.println(hashSet.remove(p1));
        System.out.println(hashSet);
            hashSet.add(p3);
            hashSet.add(new P(1001,"Cc"));
        System.out.println(hashSet);
            hashSet.add(new P(1001,"Aa"));
        System.out.println(hashSet);
    }
}
class P{
    private int id;
    public String name;

    public P(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        P p = (P) o;
        return id == p.id && Objects.equals(name, p.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "P{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

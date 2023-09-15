package com.loy.jdbc.bean;

public class Tmp {
    private int id;
    private String name;

    public Tmp() {
    }

    public Tmp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tmp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

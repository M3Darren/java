package com.loy.base.domain;

public class Animate {
    private Integer id;
    private String name;

    public Animate(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Animate() {
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Animate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

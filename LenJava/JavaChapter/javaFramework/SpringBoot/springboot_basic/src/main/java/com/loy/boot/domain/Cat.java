package com.loy.boot.domain;

import org.springframework.stereotype.Repository;


public class Cat {
    private Integer id;
    private String name;
    private  String species;

    public Cat(Integer id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}

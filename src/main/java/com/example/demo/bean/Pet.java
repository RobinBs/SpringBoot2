package com.example.demo.bean;

public class Pet {
    private String name;
    private Double weight;

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public Pet(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

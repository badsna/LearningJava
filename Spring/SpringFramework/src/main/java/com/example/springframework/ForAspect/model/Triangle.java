package com.example.springframework.ForAspect.model;

public class Triangle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("traingle's setter called");

    }
}

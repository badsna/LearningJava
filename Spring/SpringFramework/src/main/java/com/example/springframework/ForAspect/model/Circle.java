package com.example.springframework.ForAspect.model;


import com.example.springframework.ForAspect.aspect.Loggable;

public class Circle {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
        //for @After
        System.out.println("circle's setter called");
        throw new RuntimeException();
    }
}

package com.example.springframework.ForAspect.Service;


import com.example.springframework.ForAspect.aspect.Loggable;
import com.example.springframework.ForAspect.model.Circle;
import com.example.springframework.ForAspect.model.Triangle;

public class ShapeService {
    //these have be configured in xml file
    private Circle circle;
    private Triangle triangle;

    @Loggable
    public Circle getCircle() {
        System.out.println("Circle being called");
        return circle;
    }

    public void setCircle(Circle circle) {

        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}

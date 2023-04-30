package com.example.springframework.ForAspect.Service;

import com.example.springframework.ForAspect.model.Circle;
import com.example.springframework.ForAspect.model.Triangle;

public class FactoryService {
    //takes information what bean to take
    public Object getBean(String beanType){
//        if(beanType.equals("shapeService")) return new ShapeService();
        if(beanType.equals("shapeService")) return new ShapeServiceProxy();

        if(beanType.equals("circle")) return new Circle();

        if(beanType.equals("triangle")) return new Triangle();

        return null;

    }
}

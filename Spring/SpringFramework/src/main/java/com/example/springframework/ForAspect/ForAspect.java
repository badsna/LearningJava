package com.example.springframework.ForAspect;

import com.example.springframework.ForAspect.Service.FactoryService;
import com.example.springframework.ForAspect.Service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ForAspect {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//        you dont need to cast in this way
        ShapeService shapeService=context.getBean("shapeService", ShapeService.class);

        System.out.println(shapeService.getCircle().getName());
//        System.out.println(shapeService.getTriangle().getName());

        System.out.println("");
        shapeService.getTriangle().setName("dummy code");
        System.out.println("");
        shapeService.getTriangle();
        shapeService.getCircle().setName("Dummy name");

        //ShapeServiceProxy
        FactoryService factoryService=new FactoryService();
        //this will return an object so cast it in ShapeService
        //so we make ShapeServiceProxy a child of ShapeService
        ShapeService shapeService1= (ShapeService) factoryService.getBean("shapeService");
        shapeService1.getCircle();
        //Now i want to call aspect whenever getCircle is being called.


    }
}

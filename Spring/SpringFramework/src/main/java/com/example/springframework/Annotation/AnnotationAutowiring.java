package com.example.springframework.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAutowiring {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("annotationautowire.xml");
        Emp emp1= context.getBean("emp", Emp.class);
        System.out.println(emp1);
    }
}

package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoApplication {

    public static void main(String[] args) {
        //Setter based DI

        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("beginnerbean.xml");


        ForRequiredStudent student1= (ForRequiredStudent) context.getBean("student1");
        System.out.println("Name: "+student1.getName());
        System.out.println("Age: "+student1.getAge());



    }

}

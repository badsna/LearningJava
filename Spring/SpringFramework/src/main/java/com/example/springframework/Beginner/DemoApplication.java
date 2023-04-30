package com.example.springframework.Beginner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoApplication {

    public static void main(String[] args) {
        //Setter based DI

        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("beginnerbean.xml");
        Student student= (Student) context.getBean("student");
        System.out.println(student);

        ForRequiredStudent student1= (ForRequiredStudent) context.getBean("student1");
        System.out.println("Name: "+student1.getName());
        System.out.println("Age: "+student1.getAge());



    }

}

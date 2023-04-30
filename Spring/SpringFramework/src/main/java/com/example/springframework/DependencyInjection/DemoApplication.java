package com.example.springframework.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoApplication {

    public static void main(String[] args) {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Student student= (Student) context.getBean("student");
        System.out.println(student);

        //using constructor based DI
        Student student1= (Student) context.getBean("student1");
        System.out.println(student1);





    }

}

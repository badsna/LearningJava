package com.example.springframework.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowiring {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("autowire.xml");
        Emp emp1= context.getBean("emp", Emp.class);
        System.out.println(emp1);
    }
}

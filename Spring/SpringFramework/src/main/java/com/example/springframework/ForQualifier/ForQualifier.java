package com.example.springframework.ForQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ForQualifier {

    public static void main(String[] args) {
        System.out.println( "Hello World!" );
        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("forQualifier.xml");
        Profile profile=(Profile) context.getBean("profile");
        profile.printId();
        profile.printName();


    }

}

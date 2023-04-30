package com.example.springframework.ForQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Profile {

    @Qualifier("std2")
    @Autowired
    private Student student;
    public Profile(){
        System.out.println("Inside profile constructor");
    }
    public void printId(){
        System.out.println("Age : "+student.getStudentId());
    }

    public void printName(){
        System.out.println("Name : "+student.getStudentName());
    }
}

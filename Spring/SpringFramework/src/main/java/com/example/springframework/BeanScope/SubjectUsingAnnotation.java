package com.example.springframework.BeanScope;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SubjectUsingAnnotation {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setting pepsi price");
        this.price = price;
    }

    public SubjectUsingAnnotation() {
    }

    @Override
    public String toString() {
        return "Pespi{" +
                "price=" + price +
                '}';
    }

    @PostConstruct
    public void start()  {
        System.out.println("Starting pe init");
    }

    @PreDestroy

    public void end()  {
        System.out.println("starting pe destory");
    }
}



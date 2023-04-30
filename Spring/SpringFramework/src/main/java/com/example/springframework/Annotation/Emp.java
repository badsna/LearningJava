package com.example.springframework.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Emp {
    @Autowired
    //yesma byType hunxa
    private Address address;

    public Address getAddress() {
        return address;
    }
    @Autowired
    public void setAddress(Address address) {
        System.out.println("calling setter method");
        this.address = address;
    }

    @Autowired
    public Emp(Address address) {
        this.address = address;
        System.out.println("parameterized constructor");
    }

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}


package com.example.springframework.Autowiring;

public class Emp {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

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


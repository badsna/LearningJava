package com.example.springframework.BeanScope;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PespiUsingInterface implements InitializingBean, DisposableBean {

        private double price;

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            System.out.println("setting pepsi price");
            this.price = price;
        }

    public PespiUsingInterface() {
    }

    @Override
        public String toString() {
            return "Pespi{" +
                    "price=" + price +
                    '}';
        }

    @Override
    public void destroy() throws Exception {
        System.out.println("Starting pepsi init");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("starting pepsi destory");
    }
}



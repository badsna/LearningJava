package com.example.springframework.SpringJavaBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//indicates that the class can be used by the Spring IOC container
//as a source of bean defination
@Configuration
public class HelloWorldConfig {
    //tells Spring that a method will return an object that
    //should be registerd as a bean in the Spring application context
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}

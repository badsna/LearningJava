package com.example.springframework.BeanScope;

import com.example.springframework.BeanScope.Samosa;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //to call destory method
        //use AbstractApplication instead of Application
        //only see the order for one bean
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("XMLBean.xml ");
//        context.registerShutdownHook();
//        Samosa s1= (Samosa) context.getBean("samosa");
//        System.out.println(s1);
//
//        System.out.println("###########3");
//        PespiUsingInterface pespiUsingInterface= (PespiUsingInterface) context.getBean("pespi");
//        System.out.println(pespiUsingInterface);

        SubjectUsingAnnotation subjectUsingAnnotation= (SubjectUsingAnnotation) context.getBean("subject");
        System.out.println(subjectUsingAnnotation);
        context.registerShutdownHook();

    }
}

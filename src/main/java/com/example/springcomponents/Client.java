package com.example.springcomponents;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
        College obj = (College)context.getBean("college");
        obj.test();
        System.out.println(obj);
    }
}

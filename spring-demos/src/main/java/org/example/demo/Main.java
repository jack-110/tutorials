package org.example.demo;

import org.example.demo.ioc.BeanConfig;
import org.example.demo.ioc.Bird;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        Bird bird = applicationContext.getBean(Bird.class);
        System.out.println(bird.call());
    }
}
package org.example.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(10)
@Component
public class YourAspect {


    @Pointcut("within(org.example.demo.ioc..*)")
    public void inWebLayer() {
    }

    @Before("org.example.demo.aop.MyAspect.inWebLayer()")
    public void doResultCheck() {
        System.out.println("The bird is flying.");
    }
}

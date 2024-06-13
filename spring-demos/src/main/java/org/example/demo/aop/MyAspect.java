package org.example.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(40)
@Component
public class MyAspect {

    @Pointcut("within(org.example.demo.ioc..*)")
    public void inWebLayer() {
    }

    @Order(20)
    @Before("org.example.demo.aop.MyAspect.inWebLayer()")
    public void doAccessCheck() {
        System.out.println("The bird is calling.");
    }

    @Order(10)
    @Before("org.example.demo.aop.MyAspect.inWebLayer()")
    public void doPermissionCheck() {
        System.out.println("The bird is calling calling.");
    }

}

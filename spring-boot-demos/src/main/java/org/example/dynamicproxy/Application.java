package org.example.dynamicproxy;

import java.lang.reflect.Proxy;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        DynamicProxyTest proxyInstance = (DynamicProxyTest) Proxy.newProxyInstance(DynamicProxyTest.class.getClassLoader(), new Class[]{DynamicProxyTest.class}, new DynamicInvocationHandler());
        proxyInstance.getResult();
    }
}

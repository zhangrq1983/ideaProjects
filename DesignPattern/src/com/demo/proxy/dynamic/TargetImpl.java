package com.demo.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TargetImpl implements InvocationHandler {


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("--method:"+method.getName());
        System.out.println("--动态代理实现类！！！");
        return null;
    }
}

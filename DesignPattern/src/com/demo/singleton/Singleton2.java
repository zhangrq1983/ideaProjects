package com.demo.singleton;


public class Singleton2 {

    //类共享实例对象
    private static Singleton2 singleton = new Singleton2();

    //私有构造方法
    private Singleton2(){
        System.out.println("--this is Singleton!!!");
    }

    //获得单例方法
    public synchronized static Singleton2 getInstance() {
       //直接返回共享对象
        return singleton;
    }
}

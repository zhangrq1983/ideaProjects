package com.demo.singleton;

public class Singleton {

    //类共享实例对象
    private static Singleton singleton = null;

    //私有构造方法
    private Singleton(){
        System.out.println("--this is Singleton!!!");
    }

    //获得单例方法
    public synchronized static Singleton getInstance() {

        //判断共享对象是否为null，如果为null则new一个对象
        if(singleton == null)
        {
            singleton = new Singleton();
        }
        return singleton;
    }
}

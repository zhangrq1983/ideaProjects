package com.demo.static_code_block;

public class SubClass extends SuperClass{

    static{
        System.out.println("子类静态代码块");
    }

    {
        System.out.println("子类构造代码块");
    }

    public SubClass(){
        System.out.println("子类构造函数");
    }

}
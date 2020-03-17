package com.demo.singleton;

public class Client {

    public static void main(String[] args){

        //首先检验是否能用new操作符创建Singleton对象实例
        Singleton singleton = Singleton.getInstance();

        //再此获得Singleton对象实例
        Singleton singleton1 = Singleton.getInstance();

        //比较两个对象是否是同一个对象实例
        if(singleton == singleton1){
            System.out.println("--这是同一个对象！");
        }else {
            System.out.println("--这是不同对象！");
        }

        //首先检验是否能用new操作符创建Singleton2对象实例
        Singleton2 singleton2 = Singleton2.getInstance();

        //再此获得Singleton2对象实例
        Singleton2 singleton3 = Singleton2.getInstance();

        //比较两个对象是否是同一个对象实例
        if(singleton2 == singleton3){
            System.out.println("--这是同一个对象！");
        }else {
            System.out.println("--这是不同对象！");
        }

    }
}

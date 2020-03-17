package com.demo.factory.model;

public abstract class AbstractSword {

    //宝刀的名称
    private String name;

    //抽象父类的构造方法
    public AbstractSword(){}

    //获得宝刀名称
    public String getName(){
        return name;
    }

    //设置宝刀名称
    public void setName(String name) {
        this.name = name;
    }
}

package com.demo.factory;

import com.demo.factory.itf.ISwordFactory;
import com.demo.factory.model.AbstractSword;

public class Client {

    public static void main(String[] args){

        //创建曹操实例对象（返回使用接口类型 ISwordFactory）
        ISwordFactory swordFactory = new Caocao();
        //获得宝刀实例——七星宝刀
        AbstractSword sword = swordFactory.createSword();
        //刺杀董卓
        System.out.println("曹操使用" + sword.getName() + "刺杀董卓！");

        //创建曹操实例对象（返回使用接口类型 ISwordFactory）
        swordFactory = new Caocao2();
        //获得宝刀实例——八星宝刀
        sword = swordFactory.createSword();
        //刺杀董卓
        System.out.println("曹操使用" + sword.getName() + "刺杀董卓！");

    }
}

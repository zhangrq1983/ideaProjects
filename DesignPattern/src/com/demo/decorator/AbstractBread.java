package com.demo.decorator;

import com.demo.decorator.abs.IBread;

public class AbstractBread implements IBread {

    //存储传入的IBread对象
    private final IBread bread;

    public AbstractBread(IBread bread){
        this.bread = bread;
    }

    //准备材料
    public void prepair(){
        System.out.println("AbstractBread.prepair()");
        System.out.println(this.bread.getClass());
        this.bread.prepair();
    }

    //和面
    public void kneadFlour(){
        System.out.println("AbstractBread.kneadFlour()");
        System.out.println(this.bread.getClass());
        this.bread.kneadFlour();
    }

    //蒸馒头
    public void steamed(){
        System.out.println("AbstractBread.steamed()");
        System.out.println(this.bread.getClass());
        this.bread.steamed();
    }

    //加工馒头方法
    public void process(){
        System.out.println("AbstractBread.process()");
        prepair();
        kneadFlour();
        steamed();
    }







}

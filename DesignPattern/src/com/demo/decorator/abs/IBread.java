package com.demo.decorator.abs;

public  interface IBread {

    //准备材料
    public void prepair();

    //和面
    public void kneadFlour();

    //蒸馒头
    public void steamed();

    //加工馒头方法
    public void process();


}

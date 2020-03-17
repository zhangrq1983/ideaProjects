package com.demo.proxy.real.impl;

import com.demo.proxy.real.IRedWine;

public class RealRedWineFactory implements IRedWine {

    //生产红酒方法
    @Override
    public void product() {
        System.out.println("红酒工厂生产红酒。。。");
    }

    //销售红酒方法
    @Override
    public void sell() {
        System.out.println("红酒工厂销售红酒。。。");
    }
}

package com.demo.adapter.power.v12;

import com.demo.adapter.power.AbsBasePower;

public class Power12 extends AbsBasePower implements IPower12 {

    //12V电源构造方法
    public Power12(){
        super(12);
    }

    //12V电源输出
    @Override
    public void output12v() {
        System.out.println("----这是[" + this.getPower() + this.getUnit() + "]电源！。。。");
    }
}

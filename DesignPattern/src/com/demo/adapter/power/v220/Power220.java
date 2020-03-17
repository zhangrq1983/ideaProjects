package com.demo.adapter.power.v220;

import com.demo.adapter.power.AbsBasePower;

public class Power220 extends AbsBasePower implements IPower220 {

    //构造方法
    public Power220(){
        super(220);
    }

    //220V电源输出
    @Override
    public void output220v() {
        System.out.println("----这是[" + this.getPower() + this.getUnit() + "]电源！。。。");
    }
}

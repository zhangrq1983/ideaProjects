package com.demo.adapter;

import com.demo.adapter.adapter.AdapterPower12;
import com.demo.adapter.adapter.AdapterPower12Ext;
import com.demo.adapter.power.v12.IPower12;
import com.demo.adapter.power.v12.Power12;
import com.demo.adapter.power.v220.Power220;

public class Client {

    public static void main(String[] args){
        //首先生成一个220电源对象
        Power220 power220 = new Power220();
        power220.output220v();

        //接下来再生成一个12V电源对象
        Power12 power12 = new Power12();
        power12.output12v();

        //最后使用电源适配器将220V电源转换为12V电源！
        System.out.println("\n----电源适配器转换中。。。");
        IPower12 adapterPower12 = new AdapterPower12(power220);
        adapterPower12.output12v();
        System.out.println("----电源适配器转结束！");

        //类适配器实现
        System.out.println("\n----类适配器 电源适配器转换中。。。");
        IPower12 adapterPower12ext = new AdapterPower12Ext(power220);
        adapterPower12ext.output12v();
        System.out.println("----类适配器 电源适配器转结束！");
    }
}

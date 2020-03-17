package com.demo.decorator.common;

import com.demo.decorator.abs.NormalBread;

public class SweetBread extends NormalBread {

    //黑心商贩开始添加甜蜜素
    public void paint(){
        System.out.println("添加甜蜜素。。。");
    }

    //重载父类的和面方法
    @Override
    public void kneadFlour(){
        System.out.println("SweetBread.kneadFlour()");
        //在面粉中加入甜蜜素之后才开始和面
        this.paint();
        //和面
        super.kneadFlour();
    }
}

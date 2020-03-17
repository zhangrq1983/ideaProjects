package com.demo.decorator.common;

import com.demo.decorator.abs.NormalBread;

public class CornBread extends NormalBread {

    //黑心商贩开始染色
    public void paint(){
        System.out.println("添加柠檬黄的着色剂。。。。");
    }

    //重载父类的和面方法
    @Override
    public void kneadFlour(){
        System.out.println("CornBread.kneadFlour()");
        //在面粉中加入染色剂之后才开始和面
        this.paint();
        //和面
        super.kneadFlour();
    }
}

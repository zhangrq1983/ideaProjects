package com.demo.decorator;

import com.demo.decorator.abs.IBread;
import com.demo.decorator.abs.NormalBread;
import com.demo.decorator.common.CornBread;
import com.demo.decorator.common.CornDecorator;
import com.demo.decorator.common.SweetBread;
import com.demo.decorator.common.SweetDecorator;

public class Client {

    public static void main(String[] args){

        //生产正常的馒头
        System.out.println("=====开始生产正常馒头。。。");
        //创建普通的馒头实例
        IBread normalBread = new NormalBread();
        //加工馒头
        normalBread.process();
        System.out.println("=====正常馒头生产结束。。。");


        System.out.println("=====开始生产染色的玉米馒头。。。");
        //创建染色馒头实例
        IBread normalBread2 = new CornBread();
        //加工馒头
        normalBread2.process();
        System.out.println("=====染色的玉米馒头生产结束。。。");

        System.out.println("=====开始生产甜蜜素馒头。。。");
        //创建甜蜜素馒头实例
        IBread normalBread3 = new SweetBread();
        //加工馒头
        normalBread3.process();
        System.out.println("=====甜蜜素馒头生产结束。。。");

        //生产装饰馒头
        System.out.println("\n=====开始装饰馒头！！！");
        System.out.println("Client IBread normalBread = new NormalBread()");
        //创建普通的正常馒头实例
        //这是我们需要包装（装饰）的对象实例
        normalBread = new NormalBread();

        //下面就开始对正常馒头进行装饰！！！
        //使用甜蜜素装饰馒头
        System.out.println("Client normalBread = new SweetDecorator(normalBread)");
        normalBread = new SweetDecorator(normalBread);
        //使用柠檬黄的着色剂装饰馒头
        System.out.println("Client normalBread = new CornDecorator(normalBread)");
        normalBread = new CornDecorator(normalBread);
        //生产馒头信息
        System.out.println("Client normalBread.process()");
        normalBread.process();
        System.out.println("=====装饰馒头结束！！！");
    }
}

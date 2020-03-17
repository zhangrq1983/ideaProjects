package com.demo.proxy;

import com.demo.proxy.real.IRedWine;
import com.demo.proxy.real.impl.RealRedWineFactory;

public class Client {

    public static void main(String[] args){

        //创建红酒生产工厂
        IRedWine realRed = new RealRedWineFactory();
        //工厂生产红酒
        realRed.product();
        //工厂销售红酒
        realRed.sell();

        //创建真实的红酒工厂对象实例
        IRedWine realRedWineFactory = new RealRedWineFactory();
        //获得代理对象实例
        IRedWine redWineProxy = new RedWineProxy(realRedWineFactory);
        //代理商生产红酒（其实真正生产的是工厂）
        redWineProxy.product();
        //代理商销售红酒（批发价拿货，然后以较高价格出售，赚取差额利润）
        redWineProxy.sell();
    }
}

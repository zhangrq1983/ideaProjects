package com.demo.factory;

import com.demo.factory.itf.ISwordFactory;
import com.demo.factory.model.AbstractSword;
import com.demo.factory.model.object.QixingSword;

public class Caocao implements ISwordFactory {

    //实现ISwordFactory接口的createSword方法，生产七星宝刀！
    @Override
    public AbstractSword createSword() {

        return new QixingSword();

    }
}

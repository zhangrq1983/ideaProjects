package com.demo.factory.itf;

import com.demo.factory.model.AbstractSword;

public interface ISwordFactory {

    //生产各类宝刀（返回值是抽象宝刀类型）
    public AbstractSword createSword();

}

package com.demo.factory;

import com.demo.factory.itf.ISwordFactory;
import com.demo.factory.model.AbstractSword;
import com.demo.factory.model.object.BaxingSword;

public class Caocao2 implements ISwordFactory {
    @Override
    public AbstractSword createSword() {

        return new BaxingSword();

    }
}

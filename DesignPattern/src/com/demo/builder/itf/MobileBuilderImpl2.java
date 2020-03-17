package com.demo.builder.itf;

import com.demo.builder.base.*;
import com.demo.builder.model.*;

/**
 * @author zhangrq
 * @version V1.0
 * @Title: MobileBuilderImpl2
 * @Package com.demo.builder.itf
 * @Description: 套餐2
 * @date 2019/4/28 17:28
 */
public class MobileBuilderImpl2 extends AbstractBasePackage implements IMobileBuilder {

    //建造手机套餐的话费
    @Override
    public void buildMoney() {
        this.mobilePackage.setMoney(30.0f);
    }

    //建造手机套餐的短信
    @Override
    public void buildShortInfo() {
        this.mobilePackage.setShortInfo(600);
    }

    //建造手机套餐的彩铃
    @Override
    public void buildMusic() {
        this.mobilePackage.setMusic("大海");
    }

    //返回建造的手机套餐对象
    @Override
    public MobilePackage getMobilePackage() {
        return this.mobilePackage;
    }

}

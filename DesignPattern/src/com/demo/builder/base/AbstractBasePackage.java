package com.demo.builder.base;

import com.demo.builder.model.*;

/**
 * @author zhangrq
 * @version V1.0
 * @Title: AbstractBasePackage
 * @Package com.demo.builder.base
 * @Description:
 * @date 2019/4/28 17:23
 */
public class AbstractBasePackage {

    //手机套餐实例变量
    protected MobilePackage mobilePackage;

    public AbstractBasePackage(){
        this.mobilePackage = new MobilePackage();
    }
}

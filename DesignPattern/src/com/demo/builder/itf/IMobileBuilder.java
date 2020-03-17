package com.demo.builder.itf;

import com.demo.builder.model.*;

/*
 * @Author zrq
 * @Description 手机套餐Builder
 * @Date 17:16 2019/4/28
 * @Param
 * @return
 **/
public interface IMobileBuilder {

    //建造手机套餐的话费
    public void buildMoney();

    //建造手机套餐的短信
    public void buildShortInfo();

    //建造手机套餐的彩铃
    public void buildMusic();

    //返回建造的手机套餐对象
    public MobilePackage getMobilePackage();

}

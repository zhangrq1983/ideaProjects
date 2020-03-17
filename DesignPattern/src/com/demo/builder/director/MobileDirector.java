package com.demo.builder.director;

import com.demo.builder.itf.*;
import com.demo.builder.model.*;

/**
 * @author zhangrq
 * @version V1.0
 * @Title: MobileDirector
 * @Package com.demo.builder.director
 * @Description: 手机套餐指导者
 * @date 2019/4/28 17:39
 */
public class MobileDirector {

    public MobilePackage createMobilePackage(IMobileBuilder mobileBuilder){

        if(mobileBuilder != null){

            //构建话费
            mobileBuilder.buildMoney();

            //构建短信
            mobileBuilder.buildShortInfo();

            //构建彩铃
            mobileBuilder.buildMusic();

            //返回手机套餐
            return mobileBuilder.getMobilePackage();
        }
        return null;
    }
}

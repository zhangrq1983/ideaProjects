package com.demo.builder;

import com.demo.builder.director.*;
import com.demo.builder.itf.*;
import com.demo.builder.model.*;

/**
 * @author zhangrq
 * @version V1.0
 * @Title: MainApp
 * @Package com.demo.builder
 * @Description: 主应用程序
 * @date 2019/4/28 17:43
 */
public class client {

    public static void main(String[] args) {

        //创建指导者
        MobileDirector mobileDirector = new MobileDirector();

        //套餐1
        MobileBuilderImpl1 mobileBuilderImpl1 = new MobileBuilderImpl1();

        //套餐2
        MobileBuilderImpl2 mobileBuilderImpl2 = new MobileBuilderImpl2();

        printMessage(mobileDirector.createMobilePackage(mobileBuilderImpl1));

        printMessage(mobileDirector.createMobilePackage(mobileBuilderImpl2));
    }

    public static void printMessage(MobilePackage mobilePackage) {
        System.out.println("--话费：" + mobilePackage.getMoney() + "\t短信：" + mobilePackage.getShortInfo() + "条\t彩铃：" + mobilePackage.getMusic());
    }
}

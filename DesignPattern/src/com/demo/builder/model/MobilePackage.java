package com.demo.builder.model;

/*
 * @Author zrq
 * @Description 手机套餐
 * @Date 17:11 2019/4/28
 * @Param
 * @return
 **/
public class MobilePackage {

    //话费
    private float money;

    //短信
    private int shortInfo;

    //彩铃
    private String music;


    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public int getShortInfo() {
        return shortInfo;
    }

    public void setShortInfo(int shortInfo) {
        this.shortInfo = shortInfo;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

}

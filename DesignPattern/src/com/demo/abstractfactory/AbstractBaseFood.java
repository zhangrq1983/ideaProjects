package com.demo.abstractfactory;

/*
 * @Author zrq
 * @Description 食物类
 * @Date 15:39 2019/3/28
 * @Param
 * @return
 **/
public abstract class AbstractBaseFood {

    //类别
    protected String kind;

    //数量
    protected int num;

    //价格
    protected float price;

    /*
     * @Author zrq
     * @Description 合计
     * @Date 15:42 2019/3/28
     * @Param []
     * @return float
     **/
    public float totalPrice(){
        return this.num * this.price;
    }

}

package com.demo.abstractfactory.model.kfc;

import com.demo.abstractfactory.model.Beverage;

/*
 * @Author zrq
 * @Description 饮料实现类
 * @Date 16:01 2019/3/28
 * @Param
 * @return
 **/
public class ChinaBeverage extends Beverage {
	/*
	 * @Author zrq
	 * @Description 构造方法
	 * @Date 16:02 2019/3/28
	 * @Param [num]
	 * @return
	 **/
	public ChinaBeverage(int num){
		this.kind = "可乐";
		this.price = 7.0f;
		this.num = num;
	}
}

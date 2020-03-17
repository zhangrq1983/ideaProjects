package com.demo.abstractfactory.model.kfc;

import com.demo.abstractfactory.model.FrenchFries;

/*
 * @Author zrq
 * @Description 薯条实现类
 * @Date 16:01 2019/3/28
 * @Param
 * @return
 **/
public class ChinaFrenchFries extends FrenchFries {
	/*
	 * @Author zrq
	 * @Description 构造方法
	 * @Date 16:02 2019/3/28
	 * @Param [num]
	 * @return
	 **/
	public ChinaFrenchFries(int num){
		this.kind = "普通";
		this.price = 8.0f;
		this.num = num;
	}
}

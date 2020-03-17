package com.demo.abstractfactory.model.kfc;

import com.demo.abstractfactory.model.ChickenWings;

/*
 * @Author zrq
 * @Description 鸡翅实现类
 * @Date 16:01 2019/3/28
 * @Param
 * @return
 **/
public class ChinaChickenWings extends ChickenWings {
	/*
	 * @Author zrq
	 * @Description 构造方法
	 * @Date 16:02 2019/3/28
	 * @Param [num]
	 * @return
	 **/
	public ChinaChickenWings(int num){
		this.kind = "奥尔良";
		this.price = 2.5f;
		this.num = num;
	}
}

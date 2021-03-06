package com.demo.abstractfactory.model;

import com.demo.abstractfactory.AbstractBaseFood;

/*
 * @Author zrq
 * @Description 薯条基类
 * @Date 15:58 2019/3/28
 * @Param
 * @return
 **/
public abstract class FrenchFries extends AbstractBaseFood implements IFood {
	/*
	 * @Author zrq
	 * @Description
	 * @Date 15:48 2019/3/28
	 * @Param []
	 * @return void
	 **/
	public void printMessage() {

		System.out.println("--" + this.kind + "风味薯条，\t 单价：" + this.price + "，\t 数量：" + this.num + "\t 合计：" + this.totalPrice());

	}
}

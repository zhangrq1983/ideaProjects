package com.demo.abstractfactory.model;

import com.demo.abstractfactory.AbstractBaseFood;

/*
 * @Author zrq
 * @Description 鸡翅基类
 * @Date 15:57 2019/3/28
 * @Param
 * @return
 **/
public abstract class ChickenWings extends AbstractBaseFood implements IFood {
	/*
	 * @Author zrq
	 * @Description
	 * @Date 15:48 2019/3/28
	 * @Param []
	 * @return void
	 **/
	public void printMessage() {

		System.out.println("--" + this.kind + "风味鸡翅，\t 单价：" + this.price + "，\t 数量：" + this.num + "\t 合计：" + this.totalPrice());

	}
}
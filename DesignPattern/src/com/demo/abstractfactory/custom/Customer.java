package com.demo.abstractfactory.custom;

import com.demo.abstractfactory.itf.IKfcFactory;
import com.demo.abstractfactory.model.Beverage;
import com.demo.abstractfactory.model.ChickenWings;
import com.demo.abstractfactory.model.FrenchFries;
import com.demo.abstractfactory.model.Hamburg;

/*
 * @Author zrq
 * @Description 客户类
 * @Date 16:14 2019/3/28
 * @Param
 * @return
 **/
public class Customer {

	//抽象工厂
	private IKfcFactory kfcFactory;

	//构造方法将抽象工厂作为参数传入
	public Customer(IKfcFactory kfcFactory) {
		this.kfcFactory = kfcFactory;
	}

	/*
	 * @Author zrq
	 * @Description 订购食物
	 * @Date 16:17 2019/3/28
	 * @Param [num]
	 * @return float
	 **/
	//订购麻辣鸡腿汉堡
	public float orderHamburg(int num) {

		//获得麻辣鸡腿汉堡
		Hamburg hamburg = kfcFactory.createHamburg(num);

		//输出订购信息
		hamburg.printMessage();

		//返回总价
		return hamburg.totalPrice();
	}

	//订购奥尔良烤鸡翅
	public float orderChickenWings(int num) {

		//获得奥尔良烤鸡翅
		ChickenWings chickenWings = kfcFactory.createChickenWings(num);

		//输出订购信息
		chickenWings.printMessage();

		//返回总价
		return chickenWings.totalPrice();
	}

	//订购薯条
	public float orderFrenchFries(int num) {

		//获得薯条
		FrenchFries frenchFries = kfcFactory.createFrenchFries(num);

		//输出订购信息
		frenchFries.printMessage();

		//返回总价
		return frenchFries.totalPrice();
	}

	//订购可乐
	public float orderBeverage(int num) {

		//获得可乐
		Beverage beverage = kfcFactory.createBeverage(num);

		//输出订购信息
		beverage.printMessage();

		//返回总价
		return beverage.totalPrice();
	}
}

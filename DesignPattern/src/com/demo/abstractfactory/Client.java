package com.demo.abstractfactory;

import com.demo.abstractfactory.custom.Customer;
import com.demo.abstractfactory.itf.ChinaKfcFactory;
import com.demo.abstractfactory.itf.IKfcFactory;

public class Client {

	/*
	 * @Author zrq
	 * @Description 主应用程序方法
	 * @Date 16:24 2019/3/28
	 * @Param [args]
	 * @return void
	 **/
	public static void main(String args[]){

		/*
		 * @Author zrq
		 * @Description 定义一个肯德基（IKfcFactory类型）
		 * @Date 16:26 2019/3/28
		 * @Param [args]
		 * @return void
		 **/
		IKfcFactory kfcFactory = new ChinaKfcFactory();

		/*
		 * @Author zrq
		 * @Description 爸爸和儿子走进肯德基，准备点餐
		 * @Date 16:33 2019/3/28
		 * @Param [args]
		 * @return void
		 **/
		Customer customer = new Customer(kfcFactory);

		/*
		 * @Author zrq
		 * @Description 开始点餐
		 * @Date 16:34 2019/3/28
		 * @Param [args]
		 * @return void
		 **/
		//一个麻辣鸡腿汉堡
		float hamburgMoney = customer.orderHamburg(1);

		//四个奥尔良烤鸡翅
		float chickenWingsMoney = customer.orderChickenWings(4);

		//一包薯条
		float frenchFriesMoney = customer.orderFrenchFries(1);

		//两杯可乐
		float beverageMoney = customer.orderBeverage(2);

		System.out.println("总计：" + (hamburgMoney + chickenWingsMoney + frenchFriesMoney + beverageMoney));
	}
}

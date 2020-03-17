package com.demo.abstractfactory.itf;

import com.demo.abstractfactory.model.Beverage;
import com.demo.abstractfactory.model.ChickenWings;
import com.demo.abstractfactory.model.FrenchFries;
import com.demo.abstractfactory.model.Hamburg;
import com.demo.abstractfactory.model.kfc.ChinaBeverage;
import com.demo.abstractfactory.model.kfc.ChinaChickenWings;
import com.demo.abstractfactory.model.kfc.ChinaFrenchFries;
import com.demo.abstractfactory.model.kfc.ChinaHanburm;

/*
 * @Author zrq
 * @Description 具体工厂
 * @Date 16:27 2019/3/28
 * @Param
 * @return
 **/
public class ChinaKfcFactory implements IKfcFactory{

	//生产可乐
	@Override
	public Beverage createBeverage(int num) {
		return new ChinaBeverage(num);
	}

	//生产奥尔良鸡翅
	@Override
	public ChickenWings createChickenWings(int num) {
		return new ChinaChickenWings(num);
	}

	//生产薯条
	@Override
	public FrenchFries createFrenchFries(int num) {
		return new ChinaFrenchFries(num);
	}

	//生产麻辣风味鸡腿汉堡
	@Override
	public Hamburg createHamburg(int num) {
		return new ChinaHanburm(num);
	}
}

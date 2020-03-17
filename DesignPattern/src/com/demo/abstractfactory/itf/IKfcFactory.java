package com.demo.abstractfactory.itf;

import com.demo.abstractfactory.model.Beverage;
import com.demo.abstractfactory.model.ChickenWings;
import com.demo.abstractfactory.model.FrenchFries;
import com.demo.abstractfactory.model.Hamburg;

/*
 * @Author zrq
 * @Description 肯德基抽象工厂
 * @Date 16:09 2019/3/28
 * @Param
 * @return
 **/
public interface IKfcFactory {
	/*
	 * @Author zrq
	 * @Description 生产汉堡
	 * @Date 16:10 2019/3/28
	 * @Param [num]
	 * @return com.demo.abstractfactory.model.Hamburg
	 **/
	public Hamburg createHamburg(int num);

	/*
	 * @Author zrq
	 * @Description 生产薯条
	 * @Date 16:12 2019/3/28
	 * @Param
	 * @return
	 **/
	public FrenchFries createFrenchFries(int num);

	/*
	 * @Author zrq
	 * @Description 生产鸡翅
	 * @Date 16:12 2019/3/28
	 * @Param
	 * @return
	 **/
	public ChickenWings createChickenWings(int num);

	/*
	 * @Author zrq
	 * @Description 生产饮料
	 * @Date 16:13 2019/3/28
	 * @Param
	 * @return
	 **/
	public Beverage createBeverage(int num);

}

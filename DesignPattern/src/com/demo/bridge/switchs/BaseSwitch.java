package com.demo.bridge.switchs;

import com.demo.bridge.lights.ILight;

/*
 * @Author zrq
 * @Description 开关顶层类
 * @Date 12:52 2019/4/4
 * @Param
 * @return
 **/
public class BaseSwitch {

	//使用组合，以免浪费ILight为内部私有属性，此为桥梁
	protected ILight light;

	/*
	 * @Author zrq
	 * @Description 构造方法将外部的light类型注入进来
	 * @Date 12:53 2019/4/4
	 * @Param [light]
	 * @return
	 **/
	public BaseSwitch(ILight light){
		this.light = light;
	}

	/*
	 * @Author zrq
	 * @Description 开灯方法
	 * @Date 12:56 2019/4/4
	 * @Param []
	 * @return void
	 **/
	public final void makeLight(){

		//打开开关，接通电流
		this.light.electricConnected();

		//照明
		this.light.light();

		//关闭开关，断开电流
		this.light.electricClosed();
	}
}

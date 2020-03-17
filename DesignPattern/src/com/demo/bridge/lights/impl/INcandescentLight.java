package com.demo.bridge.lights.impl;

import com.demo.bridge.lights.ILight;

/*
 * @Author zrq
 * @Description 白炽灯实现
 * @Date 13:06 2019/4/4
 * @Param
 * @return
 **/
public class INcandescentLight implements ILight {

	/*
	 * @Author zrq
	 * @Description 接通电流
	 * @Date 13:06 2019/4/4
	 * @Param []
	 * @return void
	 **/
	@Override
	public void electricConnected() {
		System.out.println("白炽灯被打开了。。。");
	}

	/*
	 * @Author zrq
	 * @Description 照明
	 * @Date 13:06 2019/4/4
	 * @Param []
	 * @return void
	 **/
	@Override
	public void light() {
		System.out.println("白炽灯照明。。。");
	}

	/*
	 * @Author zrq
	 * @Description 断开电流
	 * @Date 13:06 2019/4/4
	 * @Param []
	 * @return void
	 **/
	@Override
	public void electricClosed() {
		System.out.println("白炽灯被关闭了。。。");
	}
}

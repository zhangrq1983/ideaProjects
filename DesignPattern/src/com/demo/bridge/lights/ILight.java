package com.demo.bridge.lights;

/*
 * @Author zrq
 * @Description 电灯接口
 * @Date 12:48 2019/4/4
 * @Param
 * @return
 **/
public interface ILight {

	/*
	 * @Author zrq
	 * @Description 接通电流
	 * @Date 12:49 2019/4/4
	 * @Param []
	 * @return
	 **/
	public void electricConnected();

	/*
	 * @Author zrq
	 * @Description 照明
	 * @Date 12:50 2019/4/4
	 * @Param []
	 * @return void
	 **/
	public void light();

	/*
	 * @Author zrq
	 * @Description 断开电流
	 * @Date 12:50 2019/4/4
	 * @Param []
	 * @return void
	 **/
	public void electricClosed();
}

package com.demo.bridge;

import com.demo.bridge.lights.ILight;
import com.demo.bridge.lights.impl.CrystalLight;
import com.demo.bridge.lights.impl.INcandescentLight;
import com.demo.bridge.switchs.BaseSwitch;
import com.demo.bridge.switchs.sub.RemoteControlSwitch;

/*
 * @Author zrq
 * @Description 客户端应用程序
 * @Date 13:10 2019/4/4
 * @Param
 * @return
 **/
public class Client {

	/*
	 * @Author zrq
	 * @Description //TODO
	 * @Date 13:14 2019/4/4
	 * @Param [args]
	 * @return void
	 **/
	public static void main(String[] args) {

		//白炽灯实例
		ILight incandescentLight = new INcandescentLight();

		//水晶灯实例
		ILight crystalLight = new CrystalLight();

		//一般开关
		System.out.println("-- 一般开关 -- ");
		BaseSwitch switch1 = new BaseSwitch(incandescentLight);
		switch1.makeLight();
		System.out.println("-- 遥控开关 -- ");

		//遥控开关
		RemoteControlSwitch remoteControlSwitch = new RemoteControlSwitch(crystalLight);
		remoteControlSwitch.makeRemoteLight(1);

		//遥控开关
		RemoteControlSwitch remoteControlSwitch1 = new RemoteControlSwitch(incandescentLight);
		remoteControlSwitch1.makeRemoteLight(1);
	}
}

package com.demo.bridge.switchs.sub;

import com.demo.bridge.lights.ILight;
import com.demo.bridge.switchs.BaseSwitch;

/*
 * @Author zrq
 * @Description 遥控开关，继承BaseSwitch扩展功能
 * @Date 12:57 2019/4/4
 * @Param
 * @return
 **/
public class RemoteControlSwitch extends BaseSwitch {

	/*
	 * @Author zrq
	 * @Description 构造方法
	 * @Date 12:58 2019/4/4
	 * @Param [light]
	 * @return
	 **/
	public RemoteControlSwitch(ILight light){
		super(light);
	}

	/*
	 * @Author zrq
	 * @Description 使用遥控开关控制开灯
	 * @Date 12:59 2019/4/4
	 * @Param [operColor] 灯颜色
	 * @return void
	 **/
	public final void makeRemoteLight(int operColor){

		//打开开关，接通电流
		this.light.electricConnected();

		//照明
		this.light.light();
		String color = "";
		switch (operColor)
		{
			case 1:
				color = "暖色";
				break;
			case 2:
				color = "蓝色";
				break;
			case 3:
				color = "红色";
				break;
			default:
				color = "白色";
				break;
		}
		System.out.println("。。。现在是" + color + "！");

		//关闭开关，断开电流
		this.light.electricClosed();
	}
}

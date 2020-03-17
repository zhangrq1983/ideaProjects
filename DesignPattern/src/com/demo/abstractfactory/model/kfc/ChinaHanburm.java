package com.demo.abstractfactory.model.kfc;

import com.demo.abstractfactory.model.Hamburg;

/*
 * @Author zrq
 * @Description 中国风味的麻辣鸡腿汉堡
 * @Date 16:01 2019/3/28
 * @Param
 * @return
 **/
public class ChinaHanburm extends Hamburg {
	/*
	 * @Author zrq
	 * @Description 构造方法
	 * @Date 16:02 2019/3/28
	 * @Param [num]
	 * @return
	 **/
	public ChinaHanburm(int num){
		this.kind = "麻辣";
		this.price = 14.0f;
		this.num = num;
	}
}

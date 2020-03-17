package com.demo.observer.subject;

import com.demo.observer.observer.IObserver;

/*
 * @Author zrq
 * @Description 主接口（被观察者）
 * @Date 23:16 2019/3/31
 * @Param
 * @return
 **/
public interface ISubject {

	/*
	 * @Author zrq
	 * @Description 增加观察者
	 * @Date 23:19 2019/3/31
	 * @Param [observer]
	 * @return boolean
	 **/
	public boolean add(IObserver observer);

	/*
	 * @Author zrq
	 * @Description 删除观察者
	 * @Date 23:19 2019/3/31
	 * @Param [observer]
	 * @return boolean
	 **/
	public boolean remove(IObserver observer);

	/*
	 * @Author zrq
	 * @Description 通知所有观察者更新数据
	 * @Date 23:19 2019/3/31
	 * @Param
	 * @return
	 **/
	public void notifyAllObserver();

	/*
	 * @Author zrq
	 * @Description 设置温度
	 * @Date 23:19 2019/3/31
	 * @Param
	 * @return
	 **/
	public void setTemperature(float temperature);

	/*
	 * @Author zrq
	 * @Description 获得温度预警
	 * @Date 23:19 2019/3/31
	 * @Param
	 * @return String
	 **/
	public String temperatureReport();
}

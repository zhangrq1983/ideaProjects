package com.demo.observer.subject;

import com.demo.observer.observer.IObserver;

import java.util.Iterator;
import java.util.Vector;

/*
 * @Author zrq
 * @Description 主题实现类（被观察者）
 * @Date 23:24 2019/3/31
 * @Param
 * @return
 **/
public class Subject implements ISubject{

	//温度
	/*
	 * （一）高温黄色预警信号
	 * 标准：连续三天日最高气温将在35℃以上
	 * （二）高温橙色预警信号
	 * 标准：24小时内最高气温将升至37℃以上
	 * （三）高温红色预警信号
	 * 标准：24小时内最高气温将升至40℃以上
	 **/
	private float temperature;

	//预警级别
	private String warningLevel;

	//保存观察者列表
	private Vector<IObserver> vector;

	/*
	 * @Author zrq
	 * @Description 构造方法，初始化观察者列表
	 * @Date 23:29 2019/3/31
	 * @Param
	 * @return
	 **/
	public Subject(){

		vector = new Vector<IObserver>();
	}

	/*
	 * @Author zrq
	 * @Description 增加观察者
	 * @Date 23:31 2019/3/31
	 * @Param [observer]
	 * @return boolean
	 **/
	@Override
	public boolean add(IObserver observer) {
		if (observer != null && !vector.contains(observer)) {
			return vector.add(observer);
		}
		return false;
	}

	/*
	 * @Author zrq
	 * @Description 移除观察者
	 * @Date 23:31 2019/3/31
	 * @Param
	 * @return
	 **/
	@Override
	public boolean remove(IObserver observer) {
		return vector.remove(observer);
	}

	/*
	 * @Author zrq
	 * @Description 通知所有观察者更新数据
	 * @Date 23:31 2019/3/31
	 * @Param []
	 * @return void
	 **/
	@Override
	public void notifyAllObserver() {
		System.out.println("======气象部门发布高温" + this.warningLevel + "警报！======");
		Iterator<IObserver> iterator = vector.iterator();
		while (iterator.hasNext()){
			(iterator.next()).update(this);
		}
	}

	/*
	 * @Author zrq
	 * @Description 私有方法，根据温度值设置预警级别，然后通知所有观察者
	 * @Date 23:36 2019/3/31
	 * @Param []
	 * @return void
	 **/
	private void invoke(){
		if (this.temperature >= 35) {
			if (this.temperature >= 35 && this.temperature <37) {
				this.warningLevel = "黄色";
			}else if (this.temperature >= 37 && this.temperature <40) {
				this.warningLevel = "橙色";
			}else if (this.temperature >= 40 ) {
				this.warningLevel = "红色";
			}

			//通知所有观察者温度状况
			this.notifyAllObserver();
		}
	}

	/*
	 * @Author zrq
	 * @Description 设置温度值
	 * @Date 23:40 2019/3/31
	 * @Param [temperature]
	 * @return void
	 **/
	@Override
	public void setTemperature(float temperature) {
		this.temperature = temperature;
		this.invoke();
	}

	/*
	 * @Author zrq
	 * @Description 获得温度预警
	 * @Date 23:41 2019/3/31
	 * @Param []
	 * @return String
	 **/
	@Override
	public String temperatureReport() {
		return " 温度：" + this.temperature;
	}
}

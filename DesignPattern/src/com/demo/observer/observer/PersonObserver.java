package com.demo.observer.observer;

import com.demo.observer.subject.ISubject;

/*
 * @Author zrq
 * @Description 个人用户观察者
 * @Date 23:43 2019/3/31
 * @Param
 * @return
 **/
public class PersonObserver implements IObserver {

	@Override
	public void update(ISubject subject) {
		System.out.println("个人收到高温预警：" + subject.temperatureReport());
	}
}

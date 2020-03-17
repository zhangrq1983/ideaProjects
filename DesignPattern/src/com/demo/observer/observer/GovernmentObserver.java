package com.demo.observer.observer;

import com.demo.observer.subject.ISubject;

/*
 * @Author zrq
 * @Description 政府用户观察者
 * @Date 23:43 2019/3/31
 * @Param
 * @return
 **/
public class GovernmentObserver implements IObserver {

	@Override
	public void update(ISubject subject) {
		System.out.println("政府部门收到高温预警：" + subject.temperatureReport());
	}
}

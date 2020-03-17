package com.demo.observer.observer;

import com.demo.observer.subject.ISubject;

/*
 * @Author zrq
 * @Description 观察者接口
 * @Date 23:18 2019/3/31
 * @Param
 * @return
 **/
public interface IObserver {

	//更新方法
	public void update(ISubject subject);
}

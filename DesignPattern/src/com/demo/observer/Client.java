package com.demo.observer;

import com.demo.observer.observer.CompanyObserver;
import com.demo.observer.observer.GovernmentObserver;
import com.demo.observer.observer.PersonObserver;
import com.demo.observer.subject.ISubject;
import com.demo.observer.subject.Subject;

import java.util.Random;

/*
 * @Author zrq
 * @Description 客户端应用
 * @Date 23:47 2019/3/31
 * @Param
 * @return
 **/
public class Client {

	public static void main(String[] args){

		//创建主题对象
		ISubject subject = new Subject();

		//增加企事业单位观察者
		subject.add(new CompanyObserver());
		//增加政府用户观察者
		subject.add(new GovernmentObserver());
		//增加个人用户观察者
		subject.add(new PersonObserver());

		Random random = new Random();
		int i = 0;
		while (++i < 10){
			//设置随机温度
			subject.setTemperature(random.nextInt(45));
		}
	}
}

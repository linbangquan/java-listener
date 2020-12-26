package com.lbq.observer.pull;

public class Main {

	public static void main(String[] args) {
		// 创建目标
		ConcreteSubject subject = new ConcreteSubject();
		// 创建观察者
		ConcreteObserver observerGirl = new ConcreteObserver();
		observerGirl.setObserverName("黄明女友");
		observerGirl.setRemindThing("约会");
		
		ConcreteObserver observerMum = new ConcreteObserver();
		observerMum.setObserverName("黄明老妈");
		observerMum.setRemindThing("扫货");
		// 注册观察者
		subject.attach(observerGirl);
		subject.attach(observerMum);
		// 目标发布天气
		subject.setSubjectState("明天天气晴朗，蓝天白云，气温28度");
	}

}

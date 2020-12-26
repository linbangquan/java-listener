package com.lbq.observer.java;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {

	private String observerName;
	private String remindThing;
	
	@Override
	public void update(Observable obj, Object arg) {
		//推的方式
		System.out.println(observerName+"收到了消息，目标推送过来的是"+arg+","+remindThing);
		//拉的方式
		System.out.println(observerName+"收到了消息，主动到目标对象中去拉，"+((ConcreteSubject)obj).getSubjectState()+","+remindThing);
	}
	public String getObserverName() {
		return observerName;
	}
	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	public String getRemindThing() {
		return remindThing;
	}
	public void setRemindThing(String remindThing) {
		this.remindThing = remindThing;
	}
}

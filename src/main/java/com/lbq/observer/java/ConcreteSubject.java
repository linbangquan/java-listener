package com.lbq.observer.java;

import java.util.Observable;
/**
 * 天气目标的具体实现类
 * @author 14378
 *
 */
public class ConcreteSubject extends Observable {

	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
		//通知所有观察者
		this.setChanged();
		//推的方式
		this.notifyObservers(subjectState);
		//拉的方式
		//this.notifyObservers();
	}
	
}

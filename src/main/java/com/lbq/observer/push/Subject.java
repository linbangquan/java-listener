package com.lbq.observer.push;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，它知道观察它的观察者，并提供注册（添加）和删除观察者的接口
 * @author 14378
 *
 */
public class Subject {

	//用来保存注册的观察者对象
	private List<Observer> observers = new ArrayList<>();
	/**
	 * 添加
	 * @param observer
	 */
	public void attach(Observer observer) {
		observers.add(observer);
	}
	/**
	 * 删除
	 * @param observer
	 */
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	/**
	 * 通知所有注册的观察者对象
	 */
	protected void notifyObservers(String subjectState) {
		for(Observer observer: observers) {
			observer.update(subjectState);
		}
	}
}

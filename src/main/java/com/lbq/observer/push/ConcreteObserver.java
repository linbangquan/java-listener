package com.lbq.observer.push;
/**
 * 具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保存一致
 * @author 14378
 *
 */
public class ConcreteObserver implements Observer {
	
	private String observerName;
	private String remindThing;
	protected String observerState;
	
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
//	public String getObserverState() {
//		return observerState;
//	}
//	public void setObserverState(String observerState) {
//		this.observerState = observerState;
//	}
	
	@Override
	public void update(String observerState) {
		this.observerState = observerState;
		System.out.println(observerName + "收到了" + observerState + ","+remindThing);
	}

}

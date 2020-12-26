package com.lbq.listener.java;

import java.util.ArrayList;
import java.util.List;

public class Kid {

	private String name;
	
	private List<EatListener> eatListeners;

	public Kid(String name) {
		this.name = name;
		eatListeners = new ArrayList<>();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public List<EatListener> getEatListeners() {
//		return eatListeners;
//	}
//
	public void addEatListeners(EatListener eatListener) {
		eatListeners.add(eatListener);
	}
	
	public void eat() {
		for(EatListener eatListener:eatListeners) {
			eatListener.fireAfterEventInvoked(new WashingHandsEvent(this,"洗手"));
		}
		System.out.println("eat...");
	}
	
}

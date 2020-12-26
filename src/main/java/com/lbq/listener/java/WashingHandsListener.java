package com.lbq.listener.java;

import java.util.EventObject;

public class WashingHandsListener implements EatListener {

	@Override
	public void fireAfterEventInvoked(EventObject event) {
		if(event instanceof WashingHandsEvent) {
			WashingHandsEvent washingHands =(WashingHandsEvent) event;
			Object obj = washingHands.getSource();
			if(obj instanceof Kid) {
				Kid kid = (Kid) obj;
				System.out.println(kid.getName() + "饭前准备：" +washingHands.getEventName());
			}			
		}
	}

}

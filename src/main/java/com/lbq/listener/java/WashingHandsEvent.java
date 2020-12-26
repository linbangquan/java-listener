package com.lbq.listener.java;

import java.util.EventObject;

public class WashingHandsEvent extends EventObject {

	private static final long serialVersionUID = -2193193199585462007L;
	private String eventName;
	public WashingHandsEvent(Object source) {
		super(source);
	}

	public WashingHandsEvent(Object source,String eventName) {
		this(source);
		this.eventName = eventName;		
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
}

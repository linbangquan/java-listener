package com.lbq.listener.robot;

import java.util.ArrayList;
import java.util.List;

public class Robot {

	private String name;
	
	private List<RobotListener> robotListeners = new ArrayList<>();
	
	public Robot(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void registerListener(RobotListener robotListener) {
		//this.robotListener = robotListener;
		robotListeners.add(robotListener);
	}
	
	public void work() {
//		if(robotListener != null) {
//			Event event = new Event(this);
//			robotListener.work(event);
//		}
		for(RobotListener robotListener :robotListeners) {
			Event event = new Event(this);
			robotListener.work(event);
		}
		System.out.println(name+":我正在工作...");
	}
	
	public void dancing() {
//		if(robotListener != null) {
//			Event event = new Event(this);
//			robotListener.dancing(event);
//		}
		for(RobotListener robotListener :robotListeners) {
			Event event = new Event(this);
			robotListener.work(event);
		}
		System.out.println(name+":我正在跳舞...");
	}
}

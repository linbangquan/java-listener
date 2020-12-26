package com.lbq.listener.robot;

public class Event {

	private Robot robot;
	
	public Event(Robot robot) {
		this.robot = robot;
	}
	
	public Robot getRobot() {
		return robot;
	}
	
	public void setRobot(Robot robot) {
		this.robot = robot;
	}
}

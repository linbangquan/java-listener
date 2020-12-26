package com.lbq.listener.robot;

public class Main {

	public static void main(String[] args) {
		Robot robot = new Robot("tom");
		robot.registerListener(new RobotListenerImpl());
		robot.work();
		robot.dancing();
	}

}

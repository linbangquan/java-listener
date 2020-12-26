package com.lbq.listener.robot;

public class RobotListenerImpl implements RobotListener {

	public void work(Event event) {
		System.out.println("欢迎"+event.getRobot().getName()+",请努力工作");

	}

	public void dancing(Event event) {
		System.out.println("欢迎"+event.getRobot().getName()+",请尽情跳舞");

	}

}

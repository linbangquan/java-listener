package com.lbq.listener.java;

public class Main {

	public static void main(String[] args) {
		Kid kid = new Kid("小明");
		kid.addEatListeners(new WashingHandsListener());
		kid.eat();
	}

}

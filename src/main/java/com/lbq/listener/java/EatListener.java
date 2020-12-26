package com.lbq.listener.java;

import java.util.EventListener;
import java.util.EventObject;

public interface EatListener extends EventListener {

	public void fireAfterEventInvoked(EventObject event);
}

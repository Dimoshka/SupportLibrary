package com.syject.support.android.async;

public abstract class EventWaitHandle implements WaitHandle {
	public abstract boolean set();
	public abstract boolean reset();
}

package com.syject.support.android.async;

public interface WaitHandle {
	boolean waitOne() throws InterruptedException;
	boolean waitOne(int millisecondsTimeout) throws InterruptedException;
}

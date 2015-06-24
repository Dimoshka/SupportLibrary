package com.syject.support.android.helpers.others;

public class ErrorGenerator {
	public static void ThrowErrorIfNull(Object obj)
	{
		if(obj == null) throw new NullPointerException();
	}
	public static void ThrowErrorIfNotNull(Object obj)
	{
		if(obj != null) throw new RuntimeException("Object must be null");
	}

}

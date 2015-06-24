package com.syject.support.android.helpers;

import java.util.List;

public class StringHelpers {
	public static boolean IsNullOrEmptySpace(String str) {
		if(str == null)
			return true;
		if(str.trim().length() < 1)
			return true;
		return false;
	}
	public static boolean IsNullOrEmpty(String str) {
		if(str == null)
			return true;
		if(str.length() < 1)
			return true;
		return false;
	}
	public static boolean isEquals(String s1, String s2) {
		if(s1 == s2)
			return true;
		if(s1 == null)
			return false;
		return s1.equals(s2);
	}
	
	public static String longArrayToString(long[] arr,String separator)
	{
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<arr.length;i++)
		{
			sb.append(arr[i]);
			if(i<arr.length-1)
				sb.append(separator);
		}
		return sb.toString();
	}
	public static String joinStrings(Object[] arr, String separator)
	{
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<arr.length;i++)
		{
			sb.append(arr[i]);
			if(i<arr.length-1)
				sb.append(separator);
		}
		return sb.toString();
	}
    public static String joinStrings(List<?> collection, String separator) {
        Object[] arr = new Object[collection.size()];
        collection.toArray(arr);
        return  joinStrings(arr, separator);
    }
}

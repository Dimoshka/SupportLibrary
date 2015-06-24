package com.syject.support.android.utils;

/**
 * Created by Максим on 29.11.2014.
 */
public class Random extends java.util.Random {
//
    public int nextInt(int min, int max) {
        int count = max - min + 1;
        return nextInt(count) + min;
    }

}

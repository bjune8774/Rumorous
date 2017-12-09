package com.olivepanda.rumorous.util;

import android.util.Log;

/**
 * Created by JeongByungJune on 2017-12-09.
 */

public class RLog{
    private static final String PROJECT_NAME = "[Rumorous]";

    public static void v(String TAG, String log) {
        Log.v(PROJECT_NAME + " " + TAG, log);
    }

    public static void i(String TAG, String log) {
        Log.i(PROJECT_NAME + " " + TAG, log);
    }

    public static void d(String TAG, String log) {
        Log.d(PROJECT_NAME + " " + TAG, log);
    }

    public static void w(String TAG, String log) {
        Log.w(PROJECT_NAME + " " + TAG, log);
    }

    public static void e(String TAG, String log) {
        Log.e(PROJECT_NAME + " " + TAG, log);
    }
}

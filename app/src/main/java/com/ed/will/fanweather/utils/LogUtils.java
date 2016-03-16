package com.ed.will.fanweather.utils;

import android.util.Log;

/**
 * Log日志工具类
 * Created by Administrator on 2016/3/1.
 */
public class LogUtils {
    private LogUtils() {
    }

    ;

    /**
     * 打印information日志
     *
     * @param tag
     * @param msg
     */
    public static void i(String tag, String msg) {
        Log.i(tag, msg);
    }


    /**
     * 打印information日志
     *
     * @param tag
     * @param msg
     * @param throwable
     */
    public static void i(String tag, String msg, Throwable throwable) {
        Log.i(tag, msg, throwable);
    }


    /**
     * 打印verbose日志
     *
     * @param tag
     * @param msg
     */
    public static void v(String tag, String msg) {
        Log.v(tag, msg);
    }


    /**
     * 打印verbose日志
     *
     * @param tag
     * @param msg
     * @param throwable
     */
    public static void v(String tag, String msg, Throwable throwable) {
        Log.v(tag, msg, throwable);
    }


    /**
     * 打印debug日志
     *
     * @param tag
     * @param msg
     */
    public static void d(String tag, String msg) {
        Log.d(tag, msg);
    }


    /**
     * 打印debug日志
     *
     * @param tag
     * @param msg
     * @param throwable
     */
    public static void d(String tag, String msg, Throwable throwable) {
        Log.d(tag, msg, throwable);
    }

    /**
     * 打印warn日志
     *
     * @param tag
     * @param msg
     */
    public static void w(String tag, String msg) {
        Log.w(tag, msg);
    }


    /**
     * 打印warn日志
     *
     * @param tag
     * @param msg
     * @param throwable
     */
    public static void w(String tag, String msg, Throwable throwable) {
        Log.w(tag, msg, throwable);
    }


    /**
     * 打印error日志
     *
     * @param tag
     * @param msg
     */
    public static void e(String tag, String msg) {
        Log.e(tag, msg);
    }


    /**
     * 打印error日志
     *
     * @param tag
     * @param msg
     * @param throwable
     */
    public static void e(String tag, String msg, Throwable throwable) {
        Log.d(tag, msg, throwable);
    }

}

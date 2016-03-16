package com.ed.will.fanweather.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Toast 工具类
 * Created by Administrator on 2016/3/1.
 */
public class ToastUtils {
    private ToastUtils() {};


    /**
     * 长时Toast
     *
     * @param context
     * @param msg
     */
    public static void showLongToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }


    /**
     * 短时Toast
     *
     * @param context
     * @param msg
     */
    public static void showShortToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }


}

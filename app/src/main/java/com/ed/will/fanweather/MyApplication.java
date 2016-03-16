package com.ed.will.fanweather;

import android.app.Application;
import android.graphics.Bitmap;

/**
 * Created by Win10 on 2016/3/2.
 */
public class MyApplication extends Application {
    private static MyApplication myApplication;


    public static MyApplication getInstance() {
        return myApplication;
    }



    @Override
    public void onCreate() {
        super.onCreate();
        //由于Application类本身已经单例，所以直接按以下处理即可。
        myApplication = this;
    }



}

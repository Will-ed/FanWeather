package com.ed.will.fanweather.view.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ed.will.fanweather.MyApplication;
import com.ed.will.fanweather.adapter.WeatherOneDay;
import com.ed.will.fanweather.model.Weather;

import java.util.List;

/**
 * Created by Win10 on 2016/3/2.
 */
public class BaseActivity extends AppCompatActivity{
    protected MyApplication mMyApplication;
    protected Resources mResources;
    protected Context mContext;

    private List<WeatherOneDay> list;

    public List<WeatherOneDay> getList() {
        return list;
    }

    public void setList(List<WeatherOneDay> list) {
        this.list = list;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initConfigure();
    }

    private void initConfigure() {
        mContext = this;
        if (null == mMyApplication) {
            mMyApplication = MyApplication.getInstance();
        }
        mResources = getResources();
    }

    /**
     * Activity跳转
     *
     * @param context
     * @param targetActivity
     * @param bundle
     */
    public void jumpToActivity(Context context, Class<?> targetActivity, Bundle bundle) {
        Intent intent = new Intent(context, targetActivity);
        if (null != bundle) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }

    /**
     * startActivityForResult
     *
     * @param context
     * @param targetActivity
     * @param requestCode
     * @param bundle
     */
    public void jumpToActivityForResult(Context context, Class<?> targetActivity, int requestCode, Bundle bundle) {
        Intent intent = new Intent(context, targetActivity);
        if (null != bundle) {
            intent.putExtras(bundle);
        }
        startActivityForResult(intent, requestCode);
    }



}

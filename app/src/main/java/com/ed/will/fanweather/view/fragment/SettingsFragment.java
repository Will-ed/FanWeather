package com.ed.will.fanweather.view.fragment;

import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.ed.will.fanweather.R;
import com.ed.will.fanweather.utils.SPUtils;
import com.ed.will.fanweather.utils.ToastUtils;
import com.ed.will.fanweather.view.activity.BaseActivity;

/**
 * Created by Win10 on 2016/3/2.
 */
public class SettingsFragment extends BaseFragment {
    EditText set_city;
    Button set_ok;

    @Override
    public View onViewInit(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_setting,container,false);
        return rootView;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        findViews(view);
        setDefaultCity();
    }

    private void setDefaultCity() {
        set_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (set_city.length() == 0) {
                    ToastUtils.showShortToast(getActivity(), "输入的城市不能为空");
                } else {
                    SPUtils.put(getActivity(), "cityname", set_city.getText().toString());
                    ToastUtils.showShortToast(getActivity(), "默认城市已修改为：" + set_city.getText().toString());
                    reStart();
                }
            }
        });

    }

    public void reStart() {
        Intent i = getActivity().getBaseContext().getPackageManager()
                .getLaunchIntentForPackage(getActivity().getBaseContext().getPackageName());
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }



    private void findViews(View view) {
        set_city= (EditText) view.findViewById(R.id.set_city);
        set_ok= (Button) view.findViewById(R.id.set_ok);
        set_city.setText(SPUtils.get(getActivity(),"cityname","郑州").toString());
    }
}

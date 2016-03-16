package com.ed.will.fanweather.view.fragment;


import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.ed.will.fanweather.R;
import com.ed.will.fanweather.adapter.WeatherOneDay;
import com.ed.will.fanweather.model.Weather;
import com.ed.will.fanweather.retrofit.APIService;
import com.ed.will.fanweather.utils.LogUtils;
import com.ed.will.fanweather.utils.SPUtils;
import com.ed.will.fanweather.view.activity.MainActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * Created by Win10 on 2016/3/2.
 */
public class IndexFragment extends BaseFragment {

    private static String baseUrl="http://apis.baidu.com/apistore/weatherservice/";
    private static String apikey="ea81851c827df0f3d0fb0e690cae3f27";

    TextView city,cond,tmp,maxmin,date,wind
            ,uv,sport,trav,drsg,suggestion;
    ProgressBar prgbar;

    private String cityname="郑州";

    @Override
    public View onViewInit(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView= inflater.inflate(R.layout.frament_index, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        findViews(view);
        getListener();
        getWeatherDate();
    }

    private void getListener() {
        city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getWeatherDate();
            }
        });
    }


    private void findViews(View view) {
        city= (TextView) view.findViewById(R.id.city);
        cond= (TextView) view.findViewById(R.id.cond);
        tmp= (TextView) view.findViewById(R.id.tmp);
        maxmin= (TextView) view.findViewById(R.id.maxmin);
        date= (TextView) view.findViewById(R.id.date);
        wind= (TextView) view.findViewById(R.id.wind);
        uv= (TextView) view.findViewById(R.id.uv);
        sport= (TextView) view.findViewById(R.id.sport);
        trav= (TextView) view.findViewById(R.id.trav);
        drsg= (TextView) view.findViewById(R.id.drsg);
        suggestion= (TextView) view.findViewById(R.id.suggestion);

        prgbar= (ProgressBar) view.findViewById(R.id.prgbar);
        prgbar.setVisibility(View.GONE);
    }

    private void getWeatherDate() {
        cityname= SPUtils.get(getActivity(),"cityname","郑州").toString();

        prgbar.setVisibility(View.VISIBLE);
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        APIService service=retrofit.create(APIService.class);
        Observable<Weather> observable=service.getWeather(apikey,cityname);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Weather>() {
                    @Override
                    public void onCompleted() {
                        Log.i("Tag", "onCompleted:index");
                        prgbar.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        Log.e("Tag", "onError:" + throwable);
                    }

                    @Override
                    public void onNext(Weather weather) {

                        Weather.RetDataEntity retDataEntity=weather.getRetData();

                        city.setText(retDataEntity.getCity());
                        cond.setText(retDataEntity.getToday().getType());
                        date.setText(retDataEntity.getToday().getDate());
                        tmp.setText(retDataEntity.getToday().getCurTemp().substring(0,retDataEntity.getToday().getCurTemp().length()-1)+"°");
                        maxmin.setText(retDataEntity.getToday().getLowtemp().substring(0,retDataEntity.getToday().getLowtemp().length()-1)+"/"
                                +retDataEntity.getToday().getHightemp().substring(0,retDataEntity.getToday().getHightemp().length()-1)
                                +"°");
                        wind.setText("风力指数："+retDataEntity.getToday().getFengli());
                        uv.setText("紫外指数："+retDataEntity.getToday().getIndex().get(1).getIndex());
                        sport.setText("运动指数："+retDataEntity.getToday().getIndex().get(3).getIndex());
                        trav.setText("晾晒指数："+retDataEntity.getToday().getIndex().get(5).getIndex());
                        drsg.setText("穿衣指数：" + retDataEntity.getToday().getIndex().get(2).getIndex());
                        suggestion.setText("穿衣建议：" + retDataEntity.getToday().getIndex().get(2).getDetails());

                        List<WeatherOneDay> list=new ArrayList<WeatherOneDay>();
                        for(int i=0;i<retDataEntity.getForecast().size();i++){
                            WeatherOneDay weatherOneDay=new WeatherOneDay(
                                    retDataEntity.getForecast().get(i).getLowtemp().substring(0,retDataEntity.getForecast().get(i).getLowtemp().length()-1)
                                            +"-"+retDataEntity.getForecast().get(i).getHightemp().substring(0,retDataEntity.getForecast().get(i).getHightemp().length()-1)
                                            +"°",
                                    retDataEntity.getForecast().get(i).getType(),
                                    retDataEntity.getForecast().get(i).getFengli(),
                                    retDataEntity.getForecast().get(i).getDate(),
                                    retDataEntity.getForecast().get(i).getWeek()
                            );

                            list.add(weatherOneDay);
                        }
                        ((MainActivity) getActivity()).setList(list);

                    }
                });
    }


}

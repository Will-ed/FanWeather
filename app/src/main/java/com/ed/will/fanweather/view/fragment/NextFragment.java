package com.ed.will.fanweather.view.fragment;

import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ed.will.fanweather.R;
import com.ed.will.fanweather.adapter.NextWeatherAdapter;
import com.ed.will.fanweather.adapter.WeatherOneDay;
import com.ed.will.fanweather.model.Weather;
import com.ed.will.fanweather.retrofit.APIService;
import com.ed.will.fanweather.utils.ToastUtils;
import com.ed.will.fanweather.view.activity.MainActivity;

import java.util.ArrayList;
import java.util.List;

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
public class NextFragment extends BaseFragment {

    List<WeatherOneDay> list=new ArrayList<>();

    @Override
    public View onViewInit(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.fragment_next,container,false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        setRecyclerAdapter(view);
    }

    private void setRecyclerAdapter(View view) {
        RecyclerView recyclerView= (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        initData();
        NextWeatherAdapter adapter=new NextWeatherAdapter(list);
        adapter.setOnRecyclerViewListener(new NextWeatherAdapter.OnRecyclerViewListener() {
            @Override
            public void onItemClick(int position) {
                ToastUtils.showShortToast(getActivity(),position+"");
            }

            @Override
            public boolean onItemLongClick(int position) {
                return false;
            }
        });
        recyclerView.setAdapter(adapter);
    }

    private void initData() {
        list=((MainActivity)getActivity()).getList();
    }

}

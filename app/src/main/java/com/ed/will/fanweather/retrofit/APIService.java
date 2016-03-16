package com.ed.will.fanweather.retrofit;

import com.ed.will.fanweather.model.Weather;


import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016/2/26.
 */
public interface APIService {
    /**
     * 获取天气信息
     * @param apikey
     * @param cityname
     * @return
     */
    @GET("recentweathers")
    Observable<Weather> getWeather(@Header("apikey")String apikey,@Query("cityname")String cityname);


}

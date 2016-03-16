package com.ed.will.fanweather.adapter;

/**
 * Created by Win10 on 2016/3/7.
 */
public class WeatherOneDay {
    private String temp;
    private String type;
    private String wind;
    private String date;
    private String week;

    public WeatherOneDay(String temp, String type, String wind, String date, String week) {
        this.temp = temp;
        this.type = type;
        this.wind = wind;
        this.date = date;
        this.week = week;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }
}

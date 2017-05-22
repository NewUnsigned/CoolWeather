package com.example.zhaopeng.coolweather.gson;

/**
 * Created by zhaopeng on 2017/5/22.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}

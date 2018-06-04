package com.coolweather.android.gson;

/**
 * @author Lnima 梁京雁
 * @time 2018/5/31 08:14
 */
public class AQI {

    public AQICity city;

    public class AQICity{

        public String aqi;

        public String pm25;
    }
}

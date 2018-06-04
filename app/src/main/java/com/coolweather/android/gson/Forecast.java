package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Lnima 梁京雁
 * @time 2018/5/31 08:40
 */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;//温度

    @SerializedName("cond")
    public More more;//更多

    public class Temperature{

        public String max;

        public String min;
    }

    public class More{

        @SerializedName("txt_d")
        public String info;

    }
}

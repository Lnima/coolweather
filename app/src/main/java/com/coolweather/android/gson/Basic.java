package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Lnima 梁京雁
 * @time 2018/5/31 08:09
 */
public class Basic {

    //使用注解的方式来让JSON字段和Java字段之间建立映射关系

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}

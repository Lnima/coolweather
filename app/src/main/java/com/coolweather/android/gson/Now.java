package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Lnima 梁京雁
 * @time 2018/5/31 08:17
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}

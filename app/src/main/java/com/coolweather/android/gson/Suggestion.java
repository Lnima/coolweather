package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Lnima 梁京雁
 * @time 2018/5/31 08:33
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{

        @SerializedName("text")
        public String info;
    }
    public class  CarWash{

        @SerializedName("text")
        public String info;

    }

    public class Sport{

        @SerializedName("text")
        public String info;
    }
}

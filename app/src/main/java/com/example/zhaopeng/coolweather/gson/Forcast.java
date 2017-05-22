package com.example.zhaopeng.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhaopeng on 2017/5/22.
 */

public class Forcast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("text_d")
        public String info;
    }

}

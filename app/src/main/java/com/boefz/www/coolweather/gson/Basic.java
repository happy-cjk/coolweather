package com.boefz.www.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by CJK on 2018/8/18.
 */

public class Basic {
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

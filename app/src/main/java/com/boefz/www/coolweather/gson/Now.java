package com.boefz.www.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by CJK on 2018/8/18.
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

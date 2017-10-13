package com.ml.picturedeal.a123.PicDeal.util;

import android.os.Environment;

/**
 * Created by Administrator on 2017/10/13.
 */

public class Config {
    public static final String dataString = Environment.getDataDirectory() + "";
    public static final String bmpCache = dataString + "cache";
    public static final String StrangPath = Environment.getExternalStorageState();

}

package com.lightproject;

import java.io.File;

/**
 * Created by hanjiaqi on 2017/6/29.
 */

public class AppConstant {
    //DATA STORE
    public static final String DATA_PATH = AppContext.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";
    public static final String NET_DATA_PATH = DATA_PATH + File.separator + "net_cache";

    public static final String TAG = "tests";
    public static final String PREF_NAME = "app.pref";

}

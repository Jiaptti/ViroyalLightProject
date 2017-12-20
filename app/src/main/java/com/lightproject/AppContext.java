package com.lightproject;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.lightproject.util.NetWorkUtils;

/**
 * Created by hanjiaqi on 2017/6/27.
 */

public class AppContext extends Application{
    private static AppContext mApp;
    private static long sLastToastTime;
    private static String sLastToast = "";

    private static boolean sIsAtLeastGB;

    static {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
            sIsAtLeastGB = true;
        }
    }

    public static AppContext getInstance() {
        return mApp;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
        checkNet();
    }

    public static SharedPreferences getPersistPreferences() {
        return mApp.getSharedPreferences(AppConstant.PREF_NAME, Context.MODE_PRIVATE);
    }



    public static Context getAppContext(){
        return mApp;
    }


    public static boolean checkNet(){
        if(!NetWorkUtils.hasNet()){
            AppContext.toastShort(R.string.no_net);
            return false;
        }
        return true;
    }

    public static Resources getAppResources(){
        return mApp.getResources();
    }

    public static void toastShort(int message){
        toastShort(message, Toast.LENGTH_SHORT, 0);
    }

    public static void toastShort(String message){
        toast(message, Toast.LENGTH_SHORT, 0,
                Gravity.FILL_HORIZONTAL | Gravity.TOP);
    }

    public static void toastShort(int message,int duration , int icon){
        toast(getAppContext().getResources().getString(message),duration , icon , Gravity.FILL_HORIZONTAL | Gravity.TOP);
    }


    public static void toast(String message) {
        toast(message, Toast.LENGTH_LONG, 0, Gravity.FILL_HORIZONTAL
                | Gravity.TOP);
    }

    public static void toast(String message,int duration , int icon , int gravity){
        if (message != null && !message.equalsIgnoreCase("")) {
            long time = System.currentTimeMillis();
            if (!message.equalsIgnoreCase(sLastToast)
                    || Math.abs(time - sLastToastTime) > 2000) {

                View view = LayoutInflater.from(getAppContext()).inflate(
                        R.layout.view_toast, null);
                ((TextView) view.findViewById(R.id.title_tv)).setText(message);
                if (icon != 0) {
                    ((ImageView) view.findViewById(R.id.icon_iv))
                            .setImageResource(icon);
                    view.findViewById(R.id.icon_iv)
                            .setVisibility(View.VISIBLE);
                }
                Toast toast = new Toast(getAppContext());
                toast.setView(view);
                toast.setDuration(duration);
                toast.show();

                sLastToast = message;
                sLastToastTime = System.currentTimeMillis();
            }
        }
    }
}

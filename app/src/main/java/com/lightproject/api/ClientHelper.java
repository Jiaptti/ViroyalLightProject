package com.lightproject.api;


import android.util.Log;

import com.lightproject.AppConstant;
import com.lightproject.util.NetWorkUtils;

import java.io.IOException;
import java.util.List;

import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by hanjiaqi on 2017/6/29.
 */

public class ClientHelper {
    private String session;
    //应用拦截器：主要用于设置公共参数，头信息，日志拦截等,有点类似Retrofit的Converter
    public Interceptor appIntercepter() {
        return new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = processRequest(chain.request());
                Response response = processResponse(chain.proceed(request));
                return response;
            }
        };
    }

    //访问网络之前，处理Request(这里统一添加了Cookie)
    private Request processRequest(Request request) {
        Log.i(AppConstant.TAG, "request session = " + session);
        if(session!= null && !session.equals("")){
            return request.newBuilder()
                    .addHeader("cookie", session)
                    .build();
        } else {
            return request;
        }
    }

    private Response processResponse(Response response) throws IOException  {
        if(NetWorkUtils.hasNet()){
            Headers headers = response.headers();
            List<String> cookies = headers.values("Set-Cookie");
            if(cookies.size() > 1)
                session = cookies.get(0) + cookies.get(1);
            Log.i(AppConstant.TAG, "session is  :" + session);
            return response;
        } else {
            return response.newBuilder().header("Cache-Control", "public, only-if-cached, max-stale=3600000")
                    .removeHeader("Pragma")
                    .build();
        }
    }

    public Interceptor getAutoCacheInterceptor(){
        return new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                if(!NetWorkUtils.hasNet()){
                    request = request.newBuilder().cacheControl(CacheControl.FORCE_CACHE).build();
                }
                Response response = chain.proceed(request);
                if(NetWorkUtils.hasNet()){//有网络情况下，根据请求接口的设置
                    String cacheControl = request.cacheControl().toString();
                    if(cacheControl != null){//服务端设置了缓存策略，则使用服务端缓存策略
                        return response.newBuilder().header("Cache-Control", cacheControl)
                                .removeHeader("Pragma")
                                .build();
                    } else {//服务端未设置缓存策略，则客户端自行设置
                        return response.newBuilder().header("Cache-Control" , "public, max-age=36000")
                                .removeHeader("Pragma")
                                .build();
                    }
                } else {//无网络
                    return response.newBuilder().header("Cache-Control", "public, only-if-cached, max-stale=3600000")
                            .removeHeader("Pragma")
                            .build();
                }
            }
        };
    }
}

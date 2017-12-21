package com.lightproject.api;

import com.lightproject.entity.Data;
import com.lightproject.entity.SysUser;
import com.lightproject.entity.Test;

import java.util.List;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by hanjiaqi on 2017/12/20.
 */

public interface ApiService {
    @FormUrlEncoded
    @POST("login")
    Observable<Data<SysUser>> login(@Field("username")String username, @Field("password")String password);

    @GET("user/list")
    Observable<Data<List<SysUser>>> getUserList();
}

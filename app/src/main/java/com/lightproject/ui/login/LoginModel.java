package com.lightproject.ui.login;


import com.lightproject.api.Api;
import com.lightproject.entity.Data;
import com.lightproject.entity.SysUser;

import rx.Observable;

/**
 * Created by hanjiaqi on 2017/12/20.
 */

public class LoginModel implements LoginContract.Model{
    @Override
    public Observable<Data<SysUser>> Login(String username, String password) {
        return Api.getInstance().getApiService().login(username, password);
    }
}

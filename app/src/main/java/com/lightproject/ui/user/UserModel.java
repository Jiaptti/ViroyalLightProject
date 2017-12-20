package com.lightproject.ui.user;

import com.lightproject.api.Api;
import com.lightproject.entity.Data;
import com.lightproject.entity.SysUser;

import java.util.List;

import rx.Observable;

/**
 * Created by hanjiaqi on 2017/12/20.
 */

public class UserModel implements UserContract.Model {
    @Override
    public Observable<Data<List<SysUser>>> getUserList() {
        return Api.getInstance().getApiService().getUserList();
    }
}

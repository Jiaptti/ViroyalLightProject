package com.lightproject.ui.login;

import android.util.Log;

import com.lightproject.AppConstant;
import com.lightproject.base.RxSchedulers;
import com.lightproject.entity.Data;
import com.lightproject.entity.SysUser;
import com.lightproject.entity.Test;

import java.util.List;

import rx.Subscriber;

/**
 * Created by hanjiaqi on 2017/12/20.
 */

public class LoginPresenter extends LoginContract.Presenter{
    @Override
    public void Login(String username, String password) {
        manager.add(model.Login(username, password).compose(RxSchedulers.<Data<SysUser>>io_main())
            .subscribe(new Subscriber<Data<SysUser>>() {
                @Override
                public void onCompleted() {
                    Log.i(AppConstant.TAG, "onCompleted");
                }

                @Override
                public void onError(Throwable e) {
                    Log.i(AppConstant.TAG, "error = " + e.getMessage());
                }

                @Override
                public void onNext(Data<SysUser> sysUserData) {
                    Log.i(AppConstant.TAG, "sysUserData = " + sysUserData);
                }
            }));
    }
}

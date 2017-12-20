package com.lightproject.ui.user;

import android.util.Log;

import com.lightproject.AppConstant;
import com.lightproject.base.RxSchedulers;
import com.lightproject.entity.Data;
import com.lightproject.entity.SysUser;

import java.util.List;

import rx.Subscriber;

/**
 * Created by hanjiaqi on 2017/12/20.
 */

public class UserPresenter extends UserContract.Presenter{
    @Override
    public void getUserList() {
        manager.add(model.getUserList().compose(RxSchedulers.<Data<List<SysUser>>>io_main())
                .subscribe(new Subscriber<Data<List<SysUser>>>() {
                    @Override
                    public void onCompleted() {
                        Log.i(AppConstant.TAG, "onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i(AppConstant.TAG, "UserPresenter error = " + e.getMessage());
                    }

                    @Override
                    public void onNext(Data<List<SysUser>> listData) {
                        Log.i(AppConstant.TAG, "data = " + listData.getData());
                    }
                }));
    }
}

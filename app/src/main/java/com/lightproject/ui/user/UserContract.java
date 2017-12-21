package com.lightproject.ui.user;

import com.lightproject.base.BaseModel;
import com.lightproject.base.BasePresenter;
import com.lightproject.base.BaseView;
import com.lightproject.entity.Data;
import com.lightproject.entity.SysUser;
import com.lightproject.entity.Test;

import java.util.List;

import rx.Observable;

/**
 * Created by hanjiaqi on 2017/12/20.
 */

public interface UserContract {
    interface Model extends BaseModel {
        Observable<Data<List<SysUser>>> getUserList();
    }

    interface View extends BaseView {
    }

    abstract class Presenter extends BasePresenter<View, Model> {
        public abstract void getUserList();

        @Override
        protected void onStart() {}
    }
}

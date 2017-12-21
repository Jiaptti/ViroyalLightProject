package com.lightproject.ui.login;

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

public interface LoginContract {
    interface Model extends BaseModel {
        Observable<Data<SysUser>> Login(String username, String password);
    }

    interface View extends BaseView {
    }

    abstract class Presenter extends BasePresenter<View, Model> {
        public abstract void Login(String username,String password);
        @Override
        protected void onStart() {}
    }
}

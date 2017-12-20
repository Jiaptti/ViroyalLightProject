package com.lightproject;


import android.content.Intent;

import com.lightproject.base.BaseActivity;
import com.lightproject.ui.login.LoginContract;
import com.lightproject.ui.login.LoginModel;
import com.lightproject.ui.login.LoginPresenter;
import com.lightproject.ui.user.UserActivity;

public class LightMain extends BaseActivity<LoginPresenter, LoginModel> implements LoginContract.View{

    @Override
    protected int layoutResID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        presenter.Login("admin","123456");
        startActivity(new Intent(this, UserActivity.class));
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }
}

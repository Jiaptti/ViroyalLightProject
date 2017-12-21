package com.lightproject;


import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.lightproject.base.BaseActivity;
import com.lightproject.ui.login.LoginContract;
import com.lightproject.ui.login.LoginModel;
import com.lightproject.ui.login.LoginPresenter;
import com.lightproject.ui.user.UserActivity;

import butterknife.Bind;

public class LightMain extends BaseActivity<LoginPresenter, LoginModel> implements LoginContract.View{
    @Bind(R.id.user_btn)
    Button button;

    @Override
    protected int layoutResID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        presenter.Login("admin","123456");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LightMain.this, UserActivity.class));
            }
        });
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }
}

package com.lightproject.ui.user;

import com.lightproject.R;
import com.lightproject.base.BaseActivity;

/**
 * Created by hanjiaqi on 2017/12/20.
 */

public class UserActivity extends BaseActivity<UserPresenter, UserModel> implements UserContract.View{
    @Override
    protected int layoutResID() {
        return R.layout.user_layout;
    }

    @Override
    protected void initView() {
        presenter.getUserList();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }
}

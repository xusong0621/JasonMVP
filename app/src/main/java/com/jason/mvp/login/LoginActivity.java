package com.jason.mvp.login;


import com.alibaba.android.arouter.facade.annotation.Route;
import com.audaque.mvp.persenter.MVPPresenter;
import com.audaque.mvp.view.AudaqueMVPActivity;

/**
 * Created by xusong on 17/9/29.
 */

@Route(path = "/mine/login")
public class LoginActivity extends AudaqueMVPActivity<LoginFragment> {


    @Override
    protected LoginFragment createFragment() {
        return LoginFragment.newInstance();
    }


    @Override
    protected MVPPresenter createPresenter() {
        return new LoginPresenter(fragment, this);
    }


}

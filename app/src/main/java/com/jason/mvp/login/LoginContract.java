package com.jason.mvp.login;

import com.audaque.mvp.persenter.MVPPresenter;
import com.audaque.mvp.view.MVPView;

/**
 * Created by xusong on 17/9/29.
 */

public interface LoginContract {

    public interface View extends MVPView<Presenter> {
        String getUserName();
        String getPassword();
    }

    public interface Presenter extends MVPPresenter {
        void login();
    }
}

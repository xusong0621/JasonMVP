package com.jason.mvp;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by xusong on 17/8/3.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //ARouter
        ARouter.init(this);

    }
}

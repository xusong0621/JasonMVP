package com.jason.mvp.mine;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.jason.mvp.ActivityNameConstant;
import com.jason.mvp.R;

/**
 * Created by xusong on 17/8/15.
 */

@Route(path = ActivityNameConstant.MINE_ACTIVITY)
public class WelActivity extends FragmentActivity {
    @Autowired
    String name;
    @Autowired
    boolean isFirstTime;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mine_activity);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ARouter.getInstance().build("/mine/login").navigation();
            }
        },2000);
    }
}

package com.jason.mvp.login;

import android.content.Context;
import android.os.Handler;


/**
 * Created by xusong on 17/9/29.
 */

public interface LoginModel {

    public void login(Context context, String userName, String password, Handler handler);
}

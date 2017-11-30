package com.jason.mvp.login;

import android.content.Context;
import android.os.Handler;
import android.os.Message;


/**
 * Created by xusong on 17/9/29.
 */

public class LoginModelImpl implements LoginModel{

    @Override
    public void login(Context context, String userName, String password, Handler handler) {
        //用户名密码一致登录成功 (这里可以做网络请求)
        if (userName.equals(password)) {
            //成功后返回数据
            Message message = handler.obtainMessage();
            message.obj = true;
            handler.sendMessage(message);
        } else {
            Message message = handler.obtainMessage();
            message.obj = false;
            handler.sendMessage(message);
        }

    }
}

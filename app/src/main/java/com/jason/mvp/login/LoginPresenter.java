package com.jason.mvp.login;


import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;

import com.jason.mvp.R;


/**
 * Created by xusong on 17/9/29.
 */

public class LoginPresenter implements LoginContract.Presenter  {

    private LoginModel loginModel = new LoginModelImpl();

    private LoginContract.View loginView;

    private Context context;

    public LoginPresenter(LoginContract.View view, Context context) {
        loginView = view;
        this.context = context;
        view.setPresenter(this);

    }

    @Override
    public void login() {
        if (loginModel != null) {
            loginModel.login(context, loginView.getUserName(), loginView.getPassword(), new Handler(){
                @Override
                public void handleMessage(Message msg) {
                    super.handleMessage(msg);
                    boolean result = (Boolean) msg.obj;
                    if (result) {
                        //登录成功的操作
                        Toast.makeText(context, context.getString(R.string.login_success), Toast.LENGTH_SHORT).show();

                    }else {
                        //登录失败的操作
                        Toast.makeText(context, context.getString(R.string.login_fail), Toast.LENGTH_SHORT).show();

                    }
                }
            });
        }

    }

    @Override
    public void start() {

        Log.d("LoginPresenter","start()====");

    }
}

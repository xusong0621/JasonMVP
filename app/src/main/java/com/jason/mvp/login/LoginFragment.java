package com.jason.mvp.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.audaque.mvp.view.BaseMVPV4Fragment;
import com.jason.mvp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


/**
 * Created by xusong on 17/9/29.
 *
 */

public class LoginFragment extends BaseMVPV4Fragment<LoginContract.Presenter> implements LoginContract.View {

    @BindView(R.id.userNameEditText)
    EditText userNameEditText;
    @BindView(R.id.passwordEditText)
    EditText passwordEditText;
    @BindView(R.id.button)
    Button button;
    Unbinder unbinder;

    public LoginFragment() {

    }

    public static LoginFragment newInstance() {
        return new LoginFragment();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_login, null);
        unbinder = ButterKnife.bind(this, root);
        return root;
    }

    @OnClick({R.id.passwordEditText, R.id.button})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.passwordEditText:
                break;
            case R.id.button:
                presenter.login();
                break;
        }
    }

    @Override
    public String getUserName() {
        return userNameEditText.getText().toString().trim();
    }

    @Override
    public String getPassword() {
        return passwordEditText.getText().toString().trim();
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}

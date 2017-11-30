package com.audaque.mvp.view;

/**
 * Created by xusong on 17/9/21.
 */



import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.audaque.mvp.persenter.MVPPresenter;




/**
 * Created by xusong on 17/9/21.
 */

public abstract class BaseMVPV4Fragment<T extends MVPPresenter> extends Fragment implements MVPView<T>{

    protected T presenter;

    public void showMessage(String messgae, int duration) {
        Toast.makeText(getActivity(), messgae, duration).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (presenter != null) {
            presenter.start();
        }

    }

    @Override
    public void setPresenter(T presenter) {
        this.presenter = presenter;
    }



}


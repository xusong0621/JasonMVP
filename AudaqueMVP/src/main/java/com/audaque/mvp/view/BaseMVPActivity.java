package com.audaque.mvp.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import com.audaque.mvp.persenter.MVPPresenter;
import com.audaque.mvp.utils.ActivityUtils;

/**
 * Created by xusong on 17/9/21.
 */

public abstract class BaseMVPActivity<T extends BaseMVPV4Fragment> extends FragmentActivity {

    protected MVPPresenter presenter;

    protected T fragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        fragment = createFragmentFindbyId();
        if (fragment == null) {
            fragment = createFragment();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    fragment, getContentId());
        }
        presenter = createPresenter();
    }



    protected abstract T createFragment();

    protected abstract T createFragmentFindbyId();

    /**
     * 获取资源装载Fragment对应布局id
     * @return
     */
    protected abstract int getContentId();

    /**
     * 获取
     * @return 获取布局的id
     */
    protected abstract int getLayoutId();

    /**
     * 创建一个与些界面关联的Presenter
     * @return
     */
    protected abstract MVPPresenter createPresenter();






}

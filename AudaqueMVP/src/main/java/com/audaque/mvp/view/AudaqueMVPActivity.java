package com.audaque.mvp.view;


import com.audaque.mvp.utils.ResourceIdUtils;

/**
 * Created by xusong on 17/9/28.
 */

public abstract class AudaqueMVPActivity<T extends BaseMVPV4Fragment> extends BaseMVPActivity<T> {

    private static final String CONTENT_ID = "audaque_mvp_content";

    private static final String LAYOUT_ID = "audaque_mvp_activity";


    @Override
    protected T createFragmentFindbyId() {
        return (T)getSupportFragmentManager().findFragmentById(getContentId());
    }

    @Override
    protected T createFragment() {
        return null;
    }

    @Override
    protected int getContentId() {
        return ResourceIdUtils.getIdId(this, CONTENT_ID);
    }

    @Override
    protected int getLayoutId() {
        return ResourceIdUtils.getLayoutId(this, LAYOUT_ID);
    }


}

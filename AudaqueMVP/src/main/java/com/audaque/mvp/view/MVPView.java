package com.audaque.mvp.view;

/**
 * Created by xusong on 17/9/21.
 * MVPView 常用操作
 */

public interface MVPView<T> {

    /**
     * 与Veiw关联的prenter
     * @param presenter
     */
    void setPresenter(T presenter);

}

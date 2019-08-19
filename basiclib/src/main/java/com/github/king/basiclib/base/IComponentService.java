package com.github.king.basiclib.base;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * Created by jinxianlun
 * on 2019-08-19
 */
public interface IComponentService extends IProvider {
    //组件注册
    void onCreate();

    //组件卸载
    void onStop();
}

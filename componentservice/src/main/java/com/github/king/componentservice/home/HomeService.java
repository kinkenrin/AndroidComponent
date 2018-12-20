package com.github.king.componentservice.home;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * @author Created by jinxl on 2018/12/20.
 */
// 声明接口,其他组件通过接口来调用服务
public interface HomeService extends IProvider{
    void sayHello(String name);
}

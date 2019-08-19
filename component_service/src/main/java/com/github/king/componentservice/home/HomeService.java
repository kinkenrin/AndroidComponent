package com.github.king.componentservice.home;

import android.content.Context;

import com.github.king.basiclib.base.IComponentService;

/**
 * @author Created by jinxl on 201812/20.
 */
// 声明接口,其他组件通过接口来调用服务
public interface HomeService extends IComponentService {
    void sayHello(Context context,String name);
}

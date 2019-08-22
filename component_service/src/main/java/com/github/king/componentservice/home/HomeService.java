package com.github.king.componentservice.home;

import android.content.Context;

import com.github.king.basiclib.base.IComponentService;

/**
 * compenent_home 对外提供服务的接口
 * 声明接口,其他组件通过接口来调用服务
 *
 * @author Created by jinxl on 2018/12/20.
 */
public interface HomeService extends IComponentService {
    //访问路径
    String PATH_SHAREBOOK = "/home/shareBook";
    //方法调用路径
    String PATH_METHOD_HELLO = "/home/hello";
    String PATH_METHOD_NAME_HELLO = "测试服务";

    void sayHello(Context context, String name);
}

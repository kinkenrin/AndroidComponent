package com.github.king.home;

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
    String PATH_SERVICE = "/home/service";
    String PATH_SERVICE_NAME = "组件Home Service";

    void sayHello(Context context, String name);
}

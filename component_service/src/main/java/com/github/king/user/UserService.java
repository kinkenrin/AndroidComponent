package com.github.king.user;

import android.content.Context;

import com.github.king.basiclib.base.IComponentService;

/**
 * compenent_user 对外提供服务的接口
 * 声明接口,其他组件通过接口来调用服务
 *
 * @author Created by jinxl on 2018/12/20.
 */
public interface UserService extends IComponentService {

    //方法调用路径
    String PATH_SERVICE = "/user/service";
    String PATH_SERVICE_NAME = "组件User Service";
    //登录页面
    String PATH_LOGIN = "/user/login";

    void login(Context context, String name);
}

package com.github.king.home.serviceImpl;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.github.king.componentservice.home.HomeService;
import com.github.king.home.HomeUtils;

/**
 * @author Created by jinxl on 2018/12/20.
 */
@Route(path = "/home/hello", name = "测试服务")
public class HomeServiceImpl implements HomeService {
    @Override
    public void sayHello(String name) {
        HomeUtils.show(name);
    }

    @Override
    public void init(Context context) {

    }
}

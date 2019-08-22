package com.github.king.home.serviceImpl;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.github.king.componentservice.home.HomeService;

/**
 * @author Created by jinxl on 2018/12/20.
 */
@Route(path = HomeService.PATH_METHOD_HELLO, name = HomeService.PATH_METHOD_NAME_HELLO)
public class HomeServiceImpl implements HomeService {
    public static final String TAG = HomeServiceImpl.class.getSimpleName();

    @Override
    public void init(Context context) {

    }

    @Override
    public void sayHello(Context context, String name) {
        Toast.makeText(context, name, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onCreate() {
        Log.i(TAG, "组件注册");
    }

    @Override
    public void onStop() {

    }
}

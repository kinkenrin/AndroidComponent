package com.github.king.user.serviceImpl;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.github.king.user.UserService;

/**
 * @author Created by jinxl on 2018/12/20.
 */
@Route(path = UserService.PATH_SERVICE, name = UserService.PATH_SERVICE_NAME)
public class UserServiceImpl implements UserService {
    public static final String TAG = UserServiceImpl.class.getSimpleName();

    @Override
    public void init(Context context) {

    }

    @Override
    public void onCreate() {
        Log.i(TAG, "user 组件注册");
    }

    @Override
    public void onStop() {

    }

    @Override
    public void login(Context context, String name) {
        Toast.makeText(context, name, Toast.LENGTH_LONG).show();
    }
}

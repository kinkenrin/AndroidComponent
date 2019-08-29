package com.github.king.androidcomponent;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.github.king.basiclib.base.IComponentService;
import com.github.king.home.HomeService;
import com.github.king.user.UserService;

import java.util.ArrayList;

/**
 * @author Created by jinxl on 2018/12/20.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {   // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this);

        //组件初始化
        final ArrayList<Class<? extends IComponentService>> inits = new ArrayList<>();
        inits.add(HomeService.class);
        inits.add(UserService.class);

        for (Class<? extends IComponentService> serviceClz : inits) {
            IComponentService service = ARouter.getInstance().navigation(serviceClz);
            if (service != null) {
                service.onCreate();
            }
        }
    }
}

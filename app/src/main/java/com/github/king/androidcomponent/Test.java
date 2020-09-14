package com.github.king.androidcomponent;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.launcher.ARouter;
import com.github.king.home.HomeService;
import com.github.king.user.UserService;

/**
 * Created by jinxianlun
 * on 2020/9/10
 */
public class Test {
    @Autowired
    HomeService helloService;

    @Autowired(name = UserService.PATH_SERVICE)
    UserService helloService2;

    public Test() {
        ARouter.getInstance().inject(this);
    }


    public void testService(Context context) {
        // 1. (推荐)使用依赖注入的方式发现服务,通过注解标注字段,即可使用，无需主动获取
        // Autowired注解中标注name之后，将会使用byName的方式注入对应的字段，不设置name属性，会默认使用byType的方式发现服务(当同一接口有多个实现的时候，必须使用byName的方式发现服务)
        helloService.sayHello(context, "Vergil");
        helloService2.login(context, "Vergil");

        // 2. 使用依赖查找的方式发现服务，主动去发现服务并使用，下面两种方式分别是byName和byType
//        helloService3 = ARouter.getInstance().navigation(HelloService.class);
//        helloService4 = (HelloService) ARouter.getInstance().build("/yourservicegroupname/hello").navigation();
//        helloService3.sayHello("Vergil");
//        helloService4.sayHello("Vergil");
    }
}

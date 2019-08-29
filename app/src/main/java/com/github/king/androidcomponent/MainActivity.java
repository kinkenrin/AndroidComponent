package com.github.king.androidcomponent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.launcher.ARouter;
import com.github.king.home.HomeService;
import com.github.king.home.bean.Author;
import com.github.king.user.UserService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * 跨组件跳转
     *
     * @param view
     */
    public void navigation2Home(View view) {
        Author author = new Author("Jack", 18, "China");
        ARouter.getInstance().build(HomeService.PATH_SHAREBOOK)
                .withString("bookName", "月亮与六便士")
                .withString("key3", "888")
                .withParcelable("author", author)
                .navigation();
    }

    public void perform2Home(View view) {
        HomeService homeService = ARouter.getInstance().navigation(HomeService.class);
        if (homeService != null) {
            homeService.sayHello(getApplicationContext(), "你好啊！");
        } else {
            Toast.makeText(getApplicationContext(), "组件服务未加载", Toast.LENGTH_LONG).show();
        }
    }


    public void navigation2User(View view) {
        Author author = new Author("allen", 16, "China");
        ARouter.getInstance().build(UserService.PATH_LOGIN)
                .withParcelable("user", author)
                .navigation();
    }

    public void perform2User(View view) {
        UserService userService = ARouter.getInstance().navigation(UserService.class);
        if (userService != null) {
            userService.login(getApplicationContext(), "请登录！");
        } else {
            Toast.makeText(getApplicationContext(), "组件服务未加载", Toast.LENGTH_LONG).show();
        }
    }
}

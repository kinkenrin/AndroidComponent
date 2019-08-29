package com.github.king.user;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.github.king.home.bean.Author;

/**
 * @author Created by jinxl on 2018/12/20.
 */
@Route(path = UserService.PATH_LOGIN)
public class LoginActivity extends AppCompatActivity {

    @Autowired(name = "user")
    Author mUser;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_activity_page);
        ARouter.getInstance().inject(this);
//        mAuthor = getIntent().getParcelableExtra("user");

        if (mUser != null) {
            Log.i("aaaa", "mUser:" + mUser.toString());
        }
    }

    public void onClickTv(View view) {
        Toast.makeText(getApplicationContext(), "点击了登录", Toast.LENGTH_LONG).show();
    }
}

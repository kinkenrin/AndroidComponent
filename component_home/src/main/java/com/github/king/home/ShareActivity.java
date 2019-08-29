package com.github.king.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.github.king.componentservice.home.HomeService;
import com.github.king.componentservice.home.bean.Author;

/**
 * @author Created by jinxl on 2018/12/20.
 */
@Route(path = HomeService.PATH_SHAREBOOK)
public class ShareActivity extends AppCompatActivity {

    @Autowired(name = "bookName")
    String mBookName;
    @Autowired(name = "key3")
    String key3;
    @Autowired(name = "author")
    Author mAuthor;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity_page);
        ARouter.getInstance().inject(this);
//        mBookName = getIntent().getStringExtra("bookName");
//        key3 = getIntent().getStringExtra("key3");
//        mAuthor = getIntent().getParcelableExtra("author");

        Log.i("aaaa", "mBookName:" + mBookName);
        Log.i("aaaa", "key3:" + key3);
        if (mAuthor != null) {
            Log.i("aaaa", "mAuthor:" + mAuthor.toString());
        }
    }
}

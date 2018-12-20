package com.github.king.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.github.king.componentservice.home.bean.Author;

/**
 * @author Created by jinxl on 2018/12/20.
 */
@Route(path = "/home/shareBook")
public class ShareActivity extends AppCompatActivity {

    @Autowired(name = "bookName")
    String mBookName;
//    @Autowired
//    Long key1;
    @Autowired
    String key3;
    @Autowired(name = "author")
    Author mAuthor;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouter.getInstance().inject(this);
        String author = getIntent().getStringExtra("author");


        Log.i("aaaa", "mBookName:" + mBookName);
//        Log.i("aaaa", "key1:" + key1);
        Log.i("aaaa", "key3:" + key3);
        Log.i("aaaa", "mAuthor:" + (mAuthor != null ? mAuthor.toString() : ""));
    }
}

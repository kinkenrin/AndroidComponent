package com.github.king.androidcomponent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.github.king.componentservice.home.bean.Author;

import junit.framework.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void viewClick(View view) {
        Author author = new Author("Jack", 18, "China");
        ARouter.getInstance().build("/home/shareBook")
                .withString("bookName", "月亮与六便士")
                .withString("key3", "888")
                .withObject("author", author)
                .navigation();
    }
}

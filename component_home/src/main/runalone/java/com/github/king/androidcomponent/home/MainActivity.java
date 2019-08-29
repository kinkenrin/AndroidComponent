package com.github.king.androidcomponent.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.king.home.R;
import com.github.king.home.ShareActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity_main);
    }

    public void openPage(View view) {
        startActivity(new Intent(this, ShareActivity.class));
    }
}

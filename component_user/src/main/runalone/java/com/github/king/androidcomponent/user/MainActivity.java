package com.github.king.androidcomponent.user;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.king.user.R;
import com.github.king.user.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_activity_main);
    }

    public void openPage(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }
}

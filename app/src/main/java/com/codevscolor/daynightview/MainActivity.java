package com.codevscolor.daynightview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button dayButton;
    private Button nightButton;
    private Button autoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dayButton = (Button)findViewById(R.id.buttonDay);
        nightButton = (Button)findViewById(R.id.buttonNight);
        autoButton = (Button)findViewById(R.id.buttonAuto);

        dayButton.setOnClickListener(this);
        nightButton.setOnClickListener(this);
        autoButton.setOnClickListener(this);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonAuto:
                //change theme to auto mode
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
                break;
            case R.id.buttonDay:
                //Change theme to day mode
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                break;
            case R.id.buttonNight:
                //change theme to night mode
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                break;
        }

        Intent intent = new Intent(MainActivity.this, DayNightActivity.class);
        startActivity(intent);
    }
}

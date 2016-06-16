package com.codevscolor.daynightview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.widget.TextView;

public class DayNightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_night);

        TextView title = (TextView) findViewById(R.id.textviewMain);

        int themeMode = AppCompatDelegate.getDefaultNightMode();

        if (themeMode == AppCompatDelegate.MODE_NIGHT_AUTO) {
            title.setText("Current Theme : Auto");
        } else if (themeMode == AppCompatDelegate.MODE_NIGHT_NO) {
            title.setText("Current Theme : Day");
        } else if (themeMode == AppCompatDelegate.MODE_NIGHT_YES) {
            title.setText("Current Theme : Night");
        }
    }
}

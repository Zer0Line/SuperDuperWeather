package com.sinichkin.timofey.superduperweather;

import android.os.Bundle;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class WheatherInMoscow  extends AppCompatActivity {
    private static final String CITY_NAME = "CITY_NAME";


    private static final String tag = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(@Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tag,"Начинаем менять сет контент");
        setContentView(R.layout.wheatherinmoscow);
        Intent intent = getIntent();
        String cityName = intent.getStringExtra(CITY_NAME);
        TextView textView = findViewById(R.id.textViewWeathet);
        textView.setText(cityName);
    }
}

package com.sinichkin.timofey.superduperweather;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private static final String tag = MainActivity.class.getSimpleName();
    private static final String CITY_NAME = "CITY_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            String cityName = savedInstanceState.getString(CITY_NAME,"");
            TextView cityTextView = findViewById(R.id.city_text_input);
            cityTextView.setText(cityName);
        }

        Log.d(tag, "Прошли запуск активити");
        Button myOneButton = findViewById(R.id.buttonMoscow);
        myOneButton.setOnClickListener(onClickListener);
    }

    private final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.d(tag, "Переходим к запусу нового");
            startAnotherActive();
        }
    };

    public void startAnotherActive() {

        Intent intent = new Intent(this, WheatherInMoscow.class);
        TextView cityTextView = findViewById(R.id.city_text_input);
        String cityName = cityTextView.getText().toString();
        intent.putExtra(CITY_NAME, cityName);
        startActivity(intent);
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        TextView cityTextView = findViewById(R.id.city_text_input);
        String cityName = cityTextView.getText().toString();
        outState.putString(CITY_NAME,cityName);
        super.onSaveInstanceState(outState);
    }
}

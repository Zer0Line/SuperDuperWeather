package com.sinichkin.timofey.superduperweather;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private static final String tag = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag,"Прошли запуск активити");
        Button myOneButton = findViewById(R.id.buttonMoscow);
        myOneButton.setOnClickListener(onClickListener);
    }

    private final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.d(tag,"Переходим к запусу нового");
            startAnotherActiv();
        }
    };

    public void startAnotherActiv(){



        Intent intent = new Intent(this,WheatherInMoscow.class);
        String cytiName = "Москве";
        intent.putExtra("CITY_NAME", cytiName);

        startActivity(intent);
    }


}

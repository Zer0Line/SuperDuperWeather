package com.sinichkin.timofey.superduperweather;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        addFragment(1, fragmentManager, fragmentTransaction, savedInstanceState, "mainFragments", R.id.fragment1, false);
        if (findViewById(R.id.fragment2) != null) {
            addFragment(2, fragmentManager, fragmentTransaction, savedInstanceState, "secondFragments", R.id.fragment2, false);
        } //else {
//            addFragment(2, fragmentManager, fragmentTransaction, savedInstanceState, "secondFragments", 0, true);
//        }
        fragmentTransaction.commit();
    }

    private void addFragment(int numberClass, FragmentManager fragmentManager, FragmentTransaction fragmentTransaction, Bundle savedInstanceState, String tag, int idGroupe, boolean del) {
        Fragment fragments = fragmentManager.findFragmentByTag(tag);
//        if (del ) {
//            if (fragments != null) {fragmentTransaction.remove(fragments);
//            return;
//        }
        if (fragments == null) {
            if (numberClass == 1) {
                fragments = MainFrafments.init(savedInstanceState);
            } else if (numberClass == 2) {
                fragments = SecondFragments.init(savedInstanceState);
            }
        }
        fragmentTransaction.replace(idGroupe, fragments, tag);
    }
}


//    private static final String tag = MainActivity.class.getSimpleName();
//    private static final String CITY_NAME = "CITY_NAME";
//    private static final String CHECK_BOX = "CHECK_BOX";
//     CheckBox CheckTemp;
//     CheckBox CheckPresur;
//     CheckBox CheckRainfall;
//     CheckBox CheckMagnit;
//        initCheckBoxs();
//        if (savedInstanceState != null) {
//            String cityName = savedInstanceState.getString(CITY_NAME,"");
//            TextView cityTextView = findViewById(R.id.inputCity);
//            cityTextView.setText(cityName);
//
//            boolean[] checkBoxArray = savedInstanceState.getBooleanArray(CHECK_BOX);
//            if (checkBoxArray != null) {
//                CheckTemp.setActivated(checkBoxArray[0]);
//                CheckPresur.setActivated(checkBoxArray[1]);
//                CheckRainfall.setActivated(checkBoxArray[2]);
//                CheckMagnit.setActivated(checkBoxArray[3]);
//            }
//        }
//        Log.d(tag, "Прошли запуск активити");
//        Button myOneButton = findViewById(R.id.buttonMoscow);
//        myOneButton.setOnClickListener(onClickListener);
//    }
//
//
//    private void initCheckBoxs(){
//        CheckTemp = findViewById(R.id.checkboxTemp);
//        CheckPresur = findViewById(R.id.checkboxPresur);
//        CheckRainfall = findViewById(R.id.checkBoxRainfall);
//        CheckMagnit = findViewById(R.id.checkBoxMagnit);
//    }
//
//    private final View.OnClickListener onClickListener = new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            Log.d(tag, "Переходим к запусу нового");
//            startAnotherActive();
//        }
//    };
//
//    public void startAnotherActive() {
//        setContentView(R.layout.activity_main);
//
//        Intent intent = new Intent(this, WheatherInMoscow.class);
//        TextView cityTextView = findViewById(R.id.inputCity);
//        String cityName = cityTextView.getText().toString();
//        intent.putExtra(CITY_NAME, cityName);
//        boolean[] checkBoxArray = makeBolArrayFromChecks();
//        intent.putExtra(CHECK_BOX,checkBoxArray);
//        startActivity(intent);
//    }
//
//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        TextView cityTextView = findViewById(R.id.inputCity);
//        String cityName = cityTextView.getText().toString();
//        outState.putString(CITY_NAME,cityName);
//        boolean[] checkBoxArray = makeBolArrayFromChecks();
//        outState.putBooleanArray(CHECK_BOX,checkBoxArray);
//        super.onSaveInstanceState(outState);
//    }
//
//
//    private boolean[] makeBolArrayFromChecks(){
//        boolean[] checkBoxArray = new boolean[4];
//        checkBoxArray[0]=CheckTemp.isActivated();
//        checkBoxArray[1]=CheckPresur.isActivated();
//        checkBoxArray[2]=CheckRainfall.isActivated();
//        checkBoxArray[3]=CheckMagnit.isActivated();
//        return checkBoxArray;

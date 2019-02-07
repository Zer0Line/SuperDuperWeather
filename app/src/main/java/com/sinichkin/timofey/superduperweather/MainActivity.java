package com.sinichkin.timofey.superduperweather;


import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);
        initView(savedInstanceState);
    }

    private void initView(Bundle savedInstanceState) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Fragment mainFragment = fragmentManager.findFragmentByTag("mainFragments");
        mainFragment = (mainFragment == null)
                ? MainFrafments.init(savedInstanceState)
                : mainFragment;
        fragmentTransaction.replace(R.id.fragment1, mainFragment, "mainFragments");

        if (this.getResources().getConfiguration().orientation
                == Configuration.ORIENTATION_LANDSCAPE) {
            Fragment secondFragment = fragmentManager.findFragmentByTag("secondFragments");
            secondFragment = (secondFragment == null)
                    ? SecondFragments.init(savedInstanceState)
                    : secondFragment;

            fragmentTransaction.replace(R.id.fragment2, secondFragment, "secondFragments");
        }

        fragmentTransaction.commit();
    }
}
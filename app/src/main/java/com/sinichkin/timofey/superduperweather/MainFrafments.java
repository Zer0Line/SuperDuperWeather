package com.sinichkin.timofey.superduperweather;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFrafments extends Fragment {


    public static MainFrafments init(Bundle savedInstanceState) {

        MainFrafments f = new MainFrafments();
        f.setArguments(savedInstanceState);
        f.setRetainInstance(true);
        return f;
    }


    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragments, container, false);
        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}

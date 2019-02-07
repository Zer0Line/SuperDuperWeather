package com.sinichkin.timofey.superduperweather;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecondFragments extends Fragment {
    public static SecondFragments init(Bundle savedInstanceState) {
        SecondFragments f = new SecondFragments();
        f.setArguments(savedInstanceState);
        f.setRetainInstance(true);
        return f;
    }


    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_fragment, container, false);
        return view;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}

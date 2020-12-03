package com.oracto.jitsi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

/**
 * Created by Jfp on 2/3/2017.
 */

//Our class extending fragment
public  class Tab1 extends Fragment {



    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {








        //Returning the layout file after inflating
        //Change R.layout.tab in you classes
        return inflater.inflate(R.layout.tab1, container, false);
    }
}
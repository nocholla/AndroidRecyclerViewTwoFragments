package com.nocholla.recyclerviewtwofragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.graphics.Color;

public class FragmentRight extends Fragment {

    public FragmentRight() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View retView = inflater.inflate(R.layout.fragment_right, container);

//        if(retView != null) {
//            View rightFragmentBackgroundBlack = retView.findViewById(R.id.background_black);
//            rightFragmentBackgroundBlack.setBackgroundColor(Color.BLACK);
//        }

        return retView;
    }

}

package com.nocholla.recyclerviewtwofragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.util.Log;

public class FragmentRight extends Fragment {

    public FragmentRight() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View retView = inflater.inflate(R.layout.fragment_right, container);

//        Bundle bundle = this.getArguments();
//        String name = bundle.get("name").toString();
//        Log.d("DEBUG FRGMT COLOR NAME", name);

//        if(retView != null) {
//            View fragmentRightView = retView.findViewById(R.id.background_color);
//            fragmentRightView.setBackgroundColor(Integer.parseInt(name));
//        }

        return retView;
    }

}

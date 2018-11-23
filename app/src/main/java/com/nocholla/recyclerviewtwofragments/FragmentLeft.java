package com.nocholla.recyclerviewtwofragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;

public class FragmentLeft extends Fragment {

    private OnColorChooseListener mOnColorChooseListener;
    private Button blackButton;
    private Button redButton;
    private Button greenButton;
    private Button blueButton;
    private Button greyButton;

//    public static FragmentLeft newInstance() {
//        FragmentLeft fragment = new FragmentLeft();
//        return fragment;
//    }
//
//    public FragmentLeft() {
//        // Required empty public constructor
//    }
//
//    @Override
//    public void onAttach(Activity activity) {
//        super.onAttach(activity);
//        mOnColorChooseListener = (OnColorChooseListener) activity;
//    }

    // This method will be invoked when the Fragment view object is created.
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View retView = inflater.inflate(R.layout.fragment_left, container);

        // Get Fragment Belong Activity
        final FragmentActivity fragmentBelongActivity = getActivity();

        if(retView != null) {

            // Click this button will show the text in right fragment.
            Button androidButton = retView.findViewById(R.id.fragmentLeftButtonAndroid);
            androidButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    FragmentManager fragmentManager = fragmentBelongActivity.getSupportFragmentManager();

                    // Get right Fragment object.
                    Fragment rightFragment = fragmentManager.findFragmentById(R.id.fragment_right);

                    // Get the TextView object in right Fragment.
                    final TextView rightFragmentTextView = rightFragment.getView().findViewById(R.id.fragmentRightTextView);

                    // Set text in right Fragment TextView.
                    rightFragmentTextView.setText("You click Android button.");
                }
            });

//            // Black Button
//            blackButton = retView.findViewById(R.id.btn_black);
//            blackButton.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                }
//            });
//
//            // Red Button
//            redButton = retView.findViewById(R.id.btn_red);
//            redButton.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                }
//            });
//
//
//            // Green Button
//            greenButton = retView.findViewById(R.id.btn_green);
//            greenButton.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                }
//            });
//
//            // Blue Button
//            blueButton = retView.findViewById(R.id.btn_blue);
//            blueButton.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                }
//            });
//
//            // Grey Button
//            greyButton = retView.findViewById(R.id.btn_grey);
//            greyButton.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                }
//            });


        }

        return retView;
    }

    @Override
    public void onDestroy() {
        mOnColorChooseListener = null;
        super.onDestroy();
    }

    private void updateDisplay(int color) {
        if (mOnColorChooseListener != null) {
            mOnColorChooseListener.onColorChosen(color);
        }
    }

    public interface OnColorChooseListener {
        void onColorChosen(int color);
    }

}

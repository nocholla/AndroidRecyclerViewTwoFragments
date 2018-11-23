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
import android.graphics.Color;

public class FragmentLeft extends Fragment {

    private OnColorChooseListener mOnColorChooseListener;
    private Button blackButton;
    private Button redButton;
    private Button greenButton;
    private Button blueButton;
    private Button grayButton;

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

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View retView = inflater.inflate(R.layout.fragment_left, container);

        // Get Fragment Belong Activity
        final FragmentActivity fragmentBelongActivity = getActivity();

        if(retView != null) {

            // Black Button
            blackButton = retView.findViewById(R.id.btn_black);
            blackButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fragmentManager = fragmentBelongActivity.getSupportFragmentManager();

                    // Get right Fragment Object.
                    Fragment rightFragment = fragmentManager.findFragmentById(R.id.fragment_right);

                    // Get the View Object in right Fragment.
                    final View rightFragmentBackgroundBlack = rightFragment.getView().findViewById(R.id.background_black);
                    rightFragmentBackgroundBlack.setBackgroundColor(Color.BLACK);
                    rightFragmentBackgroundBlack.setVisibility(View.VISIBLE);

                }
            });

            // Red Button
            redButton = retView.findViewById(R.id.btn_red);
            redButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fragmentManager = fragmentBelongActivity.getSupportFragmentManager();

                    // Get right Fragment Object.
                    Fragment rightFragment = fragmentManager.findFragmentById(R.id.fragment_right);

                    // Get the View Object in right Fragment.
                    final View rightFragmentBackgroundRed = rightFragment.getView().findViewById(R.id.background_red);
                    rightFragmentBackgroundRed.setBackgroundColor(Color.RED);
                    rightFragmentBackgroundRed.setVisibility(View.VISIBLE);

                }
            });


            // Green Button
            greenButton = retView.findViewById(R.id.btn_green);
            greenButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fragmentManager = fragmentBelongActivity.getSupportFragmentManager();

                    // Get right Fragment Object.
                    Fragment rightFragment = fragmentManager.findFragmentById(R.id.fragment_right);

                    // Get the View Object in right Fragment.
                    final View rightFragmentBackgroundGreen = rightFragment.getView().findViewById(R.id.background_green);
                    rightFragmentBackgroundGreen.setBackgroundColor(Color.GREEN);
                    rightFragmentBackgroundGreen.setVisibility(View.VISIBLE);

                }
            });

            // Blue Button
            blueButton = retView.findViewById(R.id.btn_blue);
            blueButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fragmentManager = fragmentBelongActivity.getSupportFragmentManager();

                    // Get right Fragment Object.
                    Fragment rightFragment = fragmentManager.findFragmentById(R.id.fragment_right);

                    // Get the View Object in right Fragment.
                    final View rightFragmentBackgroundBlue = rightFragment.getView().findViewById(R.id.background_blue);
                    rightFragmentBackgroundBlue.setBackgroundColor(Color.BLUE);
                    rightFragmentBackgroundBlue.setVisibility(View.VISIBLE);

                }
            });

            // Grey Button
            grayButton = retView.findViewById(R.id.btn_gray);
            grayButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fragmentManager = fragmentBelongActivity.getSupportFragmentManager();

                    // Get right Fragment Object.
                    Fragment rightFragment = fragmentManager.findFragmentById(R.id.fragment_right);

                    // Get the View Object in right Fragment.
                    final View rightFragmentBackgroundGrey = rightFragment.getView().findViewById(R.id.background_gray);
                    rightFragmentBackgroundGrey.setBackgroundColor(Color.GRAY);
                    rightFragmentBackgroundGrey.setVisibility(View.VISIBLE);

                }
            });


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

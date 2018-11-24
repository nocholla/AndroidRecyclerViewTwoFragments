package com.nocholla.recyclerviewtwofragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.graphics.Color;

public class FragmentLeft extends Fragment {

    private Button blackButton;
    private Button redButton;
    private Button greenButton;
    private Button blueButton;
    private Button grayButton;

    public FragmentLeft() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

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
                    final View rightFragmentBackgroundRed = rightFragment.getView().findViewById(R.id.background_red);
                    final View rightFragmentBackgroundGreen = rightFragment.getView().findViewById(R.id.background_green);
                    final View rightFragmentBackgroundBlue = rightFragment.getView().findViewById(R.id.background_blue);
                    final View rightFragmentBackgroundGray = rightFragment.getView().findViewById(R.id.background_gray);

                    // Set Background Color
                    rightFragmentBackgroundBlack.setBackgroundColor(Color.BLACK);

                    // Set Visibility
                    rightFragmentBackgroundBlack.setVisibility(View.VISIBLE);
                    rightFragmentBackgroundRed.setVisibility(View.INVISIBLE);
                    rightFragmentBackgroundGreen.setVisibility(View.INVISIBLE);
                    rightFragmentBackgroundBlue.setVisibility(View.INVISIBLE);
                    rightFragmentBackgroundGray.setVisibility(View.INVISIBLE);

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
                    final View rightFragmentBackgroundBlack = rightFragment.getView().findViewById(R.id.background_black);
                    final View rightFragmentBackgroundRed = rightFragment.getView().findViewById(R.id.background_red);
                    final View rightFragmentBackgroundGreen = rightFragment.getView().findViewById(R.id.background_green);
                    final View rightFragmentBackgroundBlue = rightFragment.getView().findViewById(R.id.background_blue);
                    final View rightFragmentBackgroundGray = rightFragment.getView().findViewById(R.id.background_gray);

                    // Set Background Color
                    rightFragmentBackgroundRed.setBackgroundColor(Color.RED);

                    // Set Visibility
                    rightFragmentBackgroundBlack.setVisibility(View.INVISIBLE);
                    rightFragmentBackgroundRed.setVisibility(View.VISIBLE);
                    rightFragmentBackgroundGreen.setVisibility(View.INVISIBLE);
                    rightFragmentBackgroundBlue.setVisibility(View.INVISIBLE);
                    rightFragmentBackgroundGray.setVisibility(View.INVISIBLE);

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
                    final View rightFragmentBackgroundBlack = rightFragment.getView().findViewById(R.id.background_black);
                    final View rightFragmentBackgroundRed = rightFragment.getView().findViewById(R.id.background_red);
                    final View rightFragmentBackgroundGreen = rightFragment.getView().findViewById(R.id.background_green);
                    final View rightFragmentBackgroundBlue = rightFragment.getView().findViewById(R.id.background_blue);
                    final View rightFragmentBackgroundGray = rightFragment.getView().findViewById(R.id.background_gray);

                    // Set Background Color
                    rightFragmentBackgroundGreen.setBackgroundColor(Color.GREEN);

                    // Set Visibility
                    rightFragmentBackgroundBlack.setVisibility(View.INVISIBLE);
                    rightFragmentBackgroundRed.setVisibility(View.INVISIBLE);
                    rightFragmentBackgroundGreen.setVisibility(View.VISIBLE);
                    rightFragmentBackgroundBlue.setVisibility(View.INVISIBLE);
                    rightFragmentBackgroundGray.setVisibility(View.INVISIBLE);

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
                    final View rightFragmentBackgroundBlack = rightFragment.getView().findViewById(R.id.background_black);
                    final View rightFragmentBackgroundRed = rightFragment.getView().findViewById(R.id.background_red);
                    final View rightFragmentBackgroundGreen = rightFragment.getView().findViewById(R.id.background_green);
                    final View rightFragmentBackgroundBlue = rightFragment.getView().findViewById(R.id.background_blue);
                    final View rightFragmentBackgroundGray = rightFragment.getView().findViewById(R.id.background_gray);

                    // Set Background Color
                    rightFragmentBackgroundBlue.setBackgroundColor(Color.BLUE);

                    // Set Visibility
                    rightFragmentBackgroundBlack.setVisibility(View.INVISIBLE);
                    rightFragmentBackgroundRed.setVisibility(View.INVISIBLE);
                    rightFragmentBackgroundGreen.setVisibility(View.INVISIBLE);
                    rightFragmentBackgroundBlue.setVisibility(View.VISIBLE);
                    rightFragmentBackgroundGray.setVisibility(View.INVISIBLE);

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
                    final View rightFragmentBackgroundBlack = rightFragment.getView().findViewById(R.id.background_black);
                    final View rightFragmentBackgroundRed = rightFragment.getView().findViewById(R.id.background_red);
                    final View rightFragmentBackgroundGreen = rightFragment.getView().findViewById(R.id.background_green);
                    final View rightFragmentBackgroundBlue = rightFragment.getView().findViewById(R.id.background_blue);
                    final View rightFragmentBackgroundGray = rightFragment.getView().findViewById(R.id.background_gray);

                    // Set Background Color
                    rightFragmentBackgroundGray.setBackgroundColor(Color.GRAY);

                    // Set Visibility
                    rightFragmentBackgroundBlack.setVisibility(View.INVISIBLE);
                    rightFragmentBackgroundRed.setVisibility(View.INVISIBLE);
                    rightFragmentBackgroundGreen.setVisibility(View.INVISIBLE);
                    rightFragmentBackgroundBlue.setVisibility(View.INVISIBLE);
                    rightFragmentBackgroundGray.setVisibility(View.VISIBLE);

                }
            });


        }

        return retView;
    }

}

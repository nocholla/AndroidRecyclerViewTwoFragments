package com.nocholla.recyclerviewtwofragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentLeft extends Fragment {
    private RecyclerView recyclerView;
    private ColoursAdapter adapter;
    private List<Colour> coloursList;

    public FragmentLeft() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View retView = inflater.inflate(R.layout.fragment_left, container);

        // Get Fragment Belong Activity
        final FragmentActivity fragmentBelongActivity = getActivity();

        if(retView != null) {

            // RecyclerView
            recyclerView = retView.findViewById(R.id.recycler_view);
            coloursList = new ArrayList<>();
            adapter = new ColoursAdapter(getContext(), coloursList);
            adapter.notifyDataSetChanged();

            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
            recyclerView.setLayoutManager(mLayoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(adapter);

            // Color Data
            colourData();
        }

        return retView;
    }

    private void colourData() {
        Colour colour = new Colour("Black");
        coloursList.add(colour);

        colour = new Colour("Red");
        coloursList.add(colour);

        colour = new Colour("Green");
        coloursList.add(colour);

        colour = new Colour("Blue");
        coloursList.add(colour);

        colour = new Colour("Gray");
        coloursList.add(colour);

        adapter.notifyDataSetChanged();
    }

}

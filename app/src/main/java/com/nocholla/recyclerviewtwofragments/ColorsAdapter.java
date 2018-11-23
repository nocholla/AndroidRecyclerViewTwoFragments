package com.nocholla.recyclerviewtwofragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class ColorsAdapter extends RecyclerView.Adapter<ColorsAdapter.MyViewHolder> {

    private List<Color> colorsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name;

        public MyViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.name);
        }
    }

    public ColorsAdapter(List<Color> colorsList) {
        this.colorsList = colorsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.color_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Color color = colorsList.get(position);
        holder.name.setText(color.getName());
    }

    @Override
    public int getItemCount() {
        return colorsList.size();
    }

}

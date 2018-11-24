package com.nocholla.recyclerviewtwofragments;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class ColoursAdapter extends RecyclerView.Adapter<ColoursAdapter.ViewHolder>  {
    private Context context;
    private List<Colour> coloursList;

    public ColoursAdapter(Context context, List<Colour> coloursList) {
        this.context = context;
        this.coloursList = coloursList;
    }

    @Override
    public ColoursAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.color_list_row, parent, false);

        return new ViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(final ColoursAdapter.ViewHolder holder, int position) {
        Colour colour = coloursList.get(position);

        holder.colourName.setText(colour.getName());
    }

    @Override
    public int getItemCount() {
        return coloursList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView colourName;

        public ViewHolder(View itemView, final Context ctx) {
            super(itemView);
            context = ctx;

            colourName = itemView.findViewById(R.id.name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Colour colour = coloursList.get(getAdapterPosition());

                    String cName = colour.getName();
                    Log.d("DEBUG COLOUR NAME", cName);

                    //Intent intent = new Intent(context, ColoursDetailsLipMatteKenyaActivity.class);
                    //intent.putExtra("EXTRA_COLOUR_NAME", pName);

                    //ctx.startActivity(intent);

                }
            });

        }

        @Override
        public void onClick(View v) {

        }
    }

}



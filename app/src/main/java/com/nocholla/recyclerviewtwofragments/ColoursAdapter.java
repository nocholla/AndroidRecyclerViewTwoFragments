package com.nocholla.recyclerviewtwofragments;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import android.widget.Toast;

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
    public void onBindViewHolder(final ColoursAdapter.ViewHolder holder, final int position) {
        final Colour colour = coloursList.get(position);

        final String colourName = colour.getName();
        Log.d("DEBUG COLOR NAME", colourName);

        // Text View
        holder.colourName.setText(colourName);

        // Card View
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, colourName, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return coloursList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView colourName;
        CardView cardView;

        public ViewHolder(View itemView, final Context ctx) {
            super(itemView);
            context = ctx;

            colourName = itemView.findViewById(R.id.name);
            cardView = itemView.findViewById(R.id.cview_color);
        }

    }

//    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
//        TextView colourName;
//
//        public ViewHolder(View itemView, final Context ctx) {
//            super(itemView);
//            context = ctx;
//
//            colourName = itemView.findViewById(R.id.name);
//
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Colour colour = coloursList.get(getAdapterPosition());
//
//                    String name = colour.getName();
//                    Log.d("DEBUG COLOUR NAME", name);
//
////                    Bundle bundle = new Bundle();
////                    bundle.putString("name", name);
////
////                    FragmentRight fragmentRight = new FragmentRight();
////                    fragmentRight.setArguments(bundle);
//
//                    //Intent intent = new Intent(context, FragmentRight.class);
//                    //intent.putExtra("EXTRA_COLOUR_NAME", cName);
//
//                    //ctx.startActivity(intent);
//
//                }
//            });
//
//        }
//
//        @Override
//        public void onClick(View v) {
//
//        }
//    }

}



package com.example.toolbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.CollationElementIterator;
import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.Viewholder>{
    private final Context context;
    private final ArrayList<recycler_model> recyclerModelArrayList;

    public RecyclerAdapter(Context context, ArrayList<recycler_model> recyclerModelArrayList) {
        this.context = context;
        this.recyclerModelArrayList = recyclerModelArrayList;
    }

    @NonNull
    @Override
    public RecyclerAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.Viewholder holder, int position) {
        // to set data to textview and imageview of each card layout
        recycler_model model = recyclerModelArrayList.get(position);
        holder.courseNameTV.setText(model.getGrp_name());
        holder.courseRatingTV.setText("" + model.getGrp_cont());
        holder.courseIV.setImageResource(model.getGrp_image());
    }

    @Override
    public int getItemCount() {
        return recyclerModelArrayList.size();
    }

    public static class Viewholder extends RecyclerView.ViewHolder {
        private final ImageView courseIV;
        private final TextView courseNameTV;
        private final TextView courseRatingTV;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            courseIV = itemView.findViewById(R.id.recycler_img);
            courseNameTV = itemView.findViewById(R.id.recycler_grp);
            courseRatingTV = itemView.findViewById(R.id.recycler_cont);
        }
    }
}




//package com.example.toolbar;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//
//public class recycler_adapter extends RecyclerView.Adapter<recycler_adapter.Viewholder>
//{
//    private final Context context;
//    private final ArrayList<recycler_model>recycler_modelArrayList;
//
//    public recycler_adapter(Context context,ArrayList<recycler_model>recycler_modelArrayList)
//    {
//        this.context = context;
//        this.recycler_modelArrayList = recycler_modelArrayList;
//    }
//    @NonNull
//    @Override
//    public recycler_adapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
//    {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent,false);
//        return new Viewholder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull recycler_adapter.Viewholder holder, int position) {
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return 0;
//    }
//
//
//    public ViewHolder(@NonNull View itemView) {
//        super(itemView);
//    }
//}
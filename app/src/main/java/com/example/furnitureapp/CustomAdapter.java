package com.example.furnitureapp;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    //1. Remove the constructor
    //2. Variables
    private ArrayList<DataModel> dataSet;
    private Context mContext;


    //3. Constructor:
    public CustomAdapter(ArrayList<DataModel> dataSet, Context mContext){
        this.dataSet = dataSet;
        this.mContext = mContext;
    }


    //4. Create onBind ViewHolder, onCreate viewHolder, and get item count
    @NonNull
    @Override
    //Delete CustomAdapter from this function
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //Step 6
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_cardview, parent, false);  //We will create the Item cardview layout

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        //Step 7
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        //Adding the data for text
        textViewName.setText(dataSet.get(position).getName());
        textViewVersion.setText(dataSet.get(position).getVersion());

        //Adding the data for ImageView
        //Adding Glide Library

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }


    //5. Let's Create a ViewHolder Class
    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        //ItemClickListener ItemClickListener;      let's save it for later use

        public MyViewHolder(View itemView){
            super(itemView);
            this.textViewName = itemView.findViewById(R.id.textViewName);
            this.textViewVersion = itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = itemView.findViewById(R.id.imageView);
            //itemView.setOnClickListener((View.OnClickListener)this);
        }

        @Override
        public void onClick(View view) {

        }
    }

}

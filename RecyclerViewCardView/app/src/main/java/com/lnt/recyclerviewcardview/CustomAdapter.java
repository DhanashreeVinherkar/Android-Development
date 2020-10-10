package com.lnt.recyclerviewcardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    ArrayList<String> names;
    ArrayList<String> version;
    Integer[] drawableArray;
    public CustomAdapter(ArrayList<String> name, ArrayList<String> version, Integer[] drawableArray) {
        this.names = name;
        this.version= version;
        this.drawableArray = drawableArray;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards_layout, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;
        textViewName.setText(names.get(position));
        textViewVersion.setText(version.get(position));
        imageView.setImageResource(drawableArray[position]);
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewName;
        public TextView textViewVersion;
        public ImageView imageViewIcon;

        public MyViewHolder(View itemView){
            super (itemView);
            this.textViewName = (TextView) itemView.findViewById(R.id.text1);
            this.textViewVersion = (TextView) itemView.findViewById(R.id.text2);
            this.imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}


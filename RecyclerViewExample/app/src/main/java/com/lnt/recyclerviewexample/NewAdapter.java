package com.lnt.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NewAdapter extends RecyclerView.Adapter<NewAdapter.MyViewHolder> { //step 5

    ArrayList<String> personNames;
    Context context;    //gives reference to this class (context means reference to class or activity or application)

    public NewAdapter(Context context, ArrayList<String> personNames)
    {
        this.context = context;
        this.personNames = personNames;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {   //actually creating the viewHolder
        //inflate the item layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false); //set view size, margins, padding, layout parameters
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {      //where exactly the record is printed in recycler view
        holder.name.setText(personNames.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, personNames.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return personNames.size();
    }


    //this inner class hold that view which we have created in row layout xml file
    public class MyViewHolder extends RecyclerView.ViewHolder {     //step 4
        TextView name;
        public MyViewHolder(View itemView){
            super (itemView);
            name = (TextView) itemView.findViewById(R.id.name);     //getting reference of item view
        }

    }
}

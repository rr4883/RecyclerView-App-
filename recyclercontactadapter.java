package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclercontactadapter extends RecyclerView.Adapter<recyclercontactadapter.ViewHolder> {
    Context context;
    ArrayList<contactmodel>arrcontacts;
    recyclercontactadapter(Context context, ArrayList<contactmodel>arrcontacts){
        this.context=context;
        this.arrcontacts=arrcontacts;
    }
    @NonNull
    @Override
    public recyclercontactadapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(context).inflate(R.layout.contact,parent,false);
        ViewHolder ViewHolder= new ViewHolder(view);
        return ViewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull recyclercontactadapter.ViewHolder holder, int position) {
        holder.Contactimage.setImageResource(arrcontacts.get(position).img);
        holder.Contactname.setText(arrcontacts.get(position).name);
        holder.Contactnumber.setText(arrcontacts.get(position).number);
    }

    @Override
    public int getItemCount() {
        return arrcontacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {   TextView Contactname,Contactnumber;
        ImageView Contactimage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Contactname = itemView.findViewById(R.id.contactname);
            Contactnumber = itemView.findViewById(R.id.contactnumber);
            Contactimage = itemView.findViewById(R.id.imgcontact);
        }
    }
}

package com.base.blackcofferassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class My_User_Adapter extends RecyclerView.Adapter<My_User_Adapter.ViewHolder> {

    My_user_data[] myUserData;
    Context context;


    public My_User_Adapter(My_user_data[] myUserData, Personal_Tab activity) {

        this.myUserData = myUserData;
        this.context= activity.getActivity();



    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_view_row,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return myUserData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageview;
        TextView id_invite,id_userName,id_Profession,id_distance,id_Bio,Filters;
        ProgressBar progressBar;
        public ViewHolder(@Nullable View itemView){
            super(itemView);
            imageview = itemView.findViewById(R.id.imageview);
            id_invite = itemView.findViewById(R.id.id_invite);
            id_userName = itemView.findViewById(R.id.id_userName);
            id_Profession = itemView.findViewById(R.id.id_Profession);
            id_distance = itemView.findViewById(R.id.id_distance);
            id_Bio = itemView.findViewById(R.id.id_Bio);
            Filters = itemView.findViewById(R.id.Filters);
            progressBar = itemView.findViewById(R.id.progressBar);

        }
    }
}

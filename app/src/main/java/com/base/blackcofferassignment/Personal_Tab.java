package com.base.blackcofferassignment;

import static java.nio.file.Files.find;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.core.widget.ImageViewCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Personal_Tab extends Fragment implements View.OnClickListener {


    ImageView filter_personal_img;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_personalfrag, container, false);
        filter_personal_img =(ImageView)view.findViewById(R.id.Filter_P_image);

        filter_personal_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), filterViewActivity.class);
                startActivity(intent);
            }
        });

        RecyclerView recycler_Personal;
        recycler_Personal = view.findViewById(R.id.recycler_Personal);
        recycler_Personal.setLayoutManager(new LinearLayoutManager(getContext()));




        return view;


    }

    @Override
    public void onClick(View view) {


    }
}
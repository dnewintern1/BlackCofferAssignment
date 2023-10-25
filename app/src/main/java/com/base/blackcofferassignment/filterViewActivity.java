package com.base.blackcofferassignment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.chip.Chip;
import com.google.android.material.slider.RangeSlider;

public class filterViewActivity extends AppCompatActivity {

    Chip chip_Coffee_ftlr;
    Chip chip_Business_ftlr;
    Chip chip_Hobbies_ftlr;
    Chip chip_Friendship_ftlr;
    Chip chip_Movies_ftlr;
    Chip chip_Dinning_ftlr;

    ImageView cross_id;

    int  ClickCount=0;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.filter_view_layout);



        chip_Coffee_ftlr = findViewById(R.id.chip_Coffee_ftlr);
        chip_Business_ftlr = findViewById(R.id.chip_Business_ftlr);
        chip_Hobbies_ftlr = findViewById(R.id.chip_Hobbies_ftlr);
        chip_Friendship_ftlr = findViewById(R.id.chip_Friendship_ftlr);
        chip_Movies_ftlr = findViewById(R.id.chip_Movies_ftlr);
        chip_Dinning_ftlr = findViewById(R.id.chip_Dinning_ftlr);

        setChipsColour(chip_Coffee_ftlr);
        setChipsColour(chip_Business_ftlr);
        setChipsColour(chip_Hobbies_ftlr);
        setChipsColour(chip_Friendship_ftlr);
        setChipsColour(chip_Movies_ftlr);
        setChipsColour(chip_Dinning_ftlr);


        setChipsColour(chip_Coffee_ftlr);
        setChipsColour(chip_Business_ftlr);
        setChipsColour(chip_Hobbies_ftlr);
        setChipsColour(chip_Friendship_ftlr);
        setChipsColour(chip_Movies_ftlr);
        setChipsColour(chip_Dinning_ftlr);

        RangeSlider slider_multiple_thumbs = findViewById(R.id.slider_multiple_thumbs);
        TextView id_slider_values = findViewById(R.id.id_slider_values);

        slider_multiple_thumbs.addOnChangeListener(new RangeSlider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull RangeSlider slider, float value, boolean fromUser) {
                float startValue = slider.getValues().get(0);
                float endValue = slider.getValues().get(1);

                id_slider_values.setText(startValue + "-" + endValue);
            }
        });

        cross_id = findViewById(R.id.cross_id);
        cross_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Tab_Layout_activity.class);
                startActivity(intent);
            }
        });

    }

        public  void setChipsColour(Chip chip) {

            chip.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    // Increment the click count
                    ClickCount++;

                    // Check if the click count is even (double-click)
                    if (ClickCount % 2 == 0) {
                        // Set the Chip background color to white
                        chip.setChipBackgroundColor(ColorStateList.valueOf(Color.WHITE));
                        chip.setTextColor(R.color.blue);
                    } else {
                        // Set the Chip background color to blue (or any other color)
                        chip.setChipBackgroundColorResource(R.color.blue);
                        chip.setTextColor(Color.WHITE);
                    }
                }
            });
        }
    }

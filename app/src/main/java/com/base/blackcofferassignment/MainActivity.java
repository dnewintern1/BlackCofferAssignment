package com.base.blackcofferassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;

import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.chip.Chip;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;


public class MainActivity extends AppCompatActivity  {
    String[] item ={"Available | Hey Let Us Connect", "Away|Stay Discrete And Watch", "Busy|Do Not Disturb|Will Catch Up Later", "SOS|Emergency Need Assistance! HELP"};
    AutoCompleteTextView autoComplete_text;
    ArrayAdapter<String> adapterItems;
    EditText edi_text;

    TextInputLayout textInputLayout;

   Chip chip_Coffee;
    Chip chip_Business;
    Chip chip_Hobbies;
    Chip chip_Friendship;
    Chip chip_Movies;
    Chip chip_Dinning;
    Chip chip_Dating;
    Chip chip_Matrimony;

    int ClickCount=0;

    Button btn_SaveNdExplore;



    private TextView characterLimitLabel;
    private final int maxCharacterLimit =250;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textInputLayout= findViewById(R.id.txt_view1);


        autoComplete_text = findViewById(R.id.autoComplete_text);
        adapterItems = new ArrayAdapter<>(this, R.layout.list_item, R.id.id_of_dropDown,item);
        autoComplete_text.setAdapter(adapterItems);
        autoComplete_text.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            String item = adapterView.getItemAtPosition(i).toString();

            }
        });

        characterLimitLabel = findViewById(R.id.characterLimitLabel);
        edi_text = findViewById(R.id.edi_text);

         edi_text.addTextChangedListener(new TextWatcher() {
             @Override
             public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

             }

             @Override
             public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

             }

             @Override
             public void afterTextChanged(Editable editable) {

                 int currentCharacterCount = editable.length();
                 characterLimitLabel.setText(currentCharacterCount + "/" + maxCharacterLimit);



                 if (currentCharacterCount > maxCharacterLimit) {
                     // Calculate the excess characters
                     int excessCharacters = currentCharacterCount - maxCharacterLimit;

                     // Remove the excess characters from the end of the text
                     editable.delete(currentCharacterCount - excessCharacters, currentCharacterCount);

                     // Update the cursor position to the end
                     edi_text.setSelection(editable.length());
                 }

             }

         });


        chip_Coffee = findViewById(R.id.chip_Coffee);
        chip_Business = findViewById(R.id.chip_Business);
        chip_Hobbies = findViewById(R.id.chip_Hobbies);
        chip_Friendship = findViewById(R.id.chip_Friendship);
        chip_Matrimony = findViewById(R.id.chip_Matrimony);
        chip_Dating = findViewById(R.id.chip_Dating);
        chip_Movies = findViewById(R.id.chip_Movies);
        chip_Dinning = findViewById(R.id.chip_Dinning);

        setChipsColour(chip_Coffee);
        setChipsColour(chip_Business);
        setChipsColour(chip_Hobbies);
        setChipsColour(chip_Friendship);
        setChipsColour(chip_Matrimony);
        setChipsColour(chip_Movies);
        setChipsColour(chip_Dinning);
        setChipsColour(chip_Dating);

        btn_SaveNdExplore = findViewById(R.id.btn_SaveNdExplore);

        btn_SaveNdExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Tab_Layout_activity.class);
                startActivity(myIntent);
            }
        });



    }

    public  void setChipsColour(Chip chip){

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
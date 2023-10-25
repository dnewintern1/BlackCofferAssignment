package com.base.blackcofferassignment;

import static android.app.PendingIntent.getActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TableLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ImageViewCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.tabs.TabLayout;

public class Tab_Layout_activity extends AppCompatActivity {

    TabLayout tab_layout;
    ViewPager2 viewPager2;

    VPadapter vpadapter;

    BottomNavigationView bottom_Navigation_View;

    FrameLayout frameLayout;





    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.explorer_pg);

        tab_layout = findViewById(R.id.tab_layout);
        viewPager2= findViewById(R.id.view_Pager2);
        vpadapter = new VPadapter(this);
        viewPager2.setAdapter(vpadapter);
        bottom_Navigation_View=findViewById(R.id.bottom_Navigation_View);
        frameLayout = findViewById(R.id.frame_layout);

        tab_layout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setVisibility(View.VISIBLE);
                frameLayout.setVisibility(View.GONE);
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                viewPager2.setVisibility(View.VISIBLE);
                frameLayout.setVisibility(View.GONE);
            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0 :
                    case 1 :
                    case 2 :
                        tab_layout.getTabAt(position).select();
                }
                super.onPageSelected(position);
            }
        });





        bottom_Navigation_View.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                frameLayout.setVisibility(View.VISIBLE);
                viewPager2.setVisibility(View.GONE);
                switch (item.getItemId()) {
                    case R.id.bottom_Explore:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new Frag_explore()).commit();
                        return true;

                    case R.id.bottom_Network:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new Frag_network()).commit();
                        return true;

                    case R.id.bottom_Chat:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new Frag_chat()).commit();
                        return true;

                    case R.id.bottom_Contacts:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new Frag_Contacts()).commit();
                        return true;

                    case R.id.bottom_Groups:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new Frag_groups()).commit();
                        return true;
                }
                return false;
            }
        });




    }
}

package com.base.blackcofferassignment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class VPadapter extends FragmentStateAdapter {
    public VPadapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new Personal_Tab();
            case 1: return new Bussiness_Tab();
            case 3: return new Merchant_Tab();
            default:return new Personal_Tab();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }

}


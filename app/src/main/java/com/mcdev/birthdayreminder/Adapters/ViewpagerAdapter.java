package com.mcdev.birthdayreminder.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewpagerAdapter extends FragmentPagerAdapter {
    public ViewpagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new BelatedFragment();      //creating instance of Belated Fragment
            case 1:
                return new DdayFragment();     //creating instance of Dday Fragment
            case 2:
                return new UpcomingFragment();       //creating instance of Upcoming Fragment
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}

package com.example.mixnavigation;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerViewAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public PagerViewAdapter(Context myContext, @NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.myContext=myContext;
        this.totalTabs=tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment= null;
        switch (position){
            case 0:
                fragment = new Fragment_Camera();
                break;
            case 1:
                fragment= new Fragment_Chat();
                break;

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}

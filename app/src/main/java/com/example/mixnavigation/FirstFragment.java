package com.example.mixnavigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class FirstFragment extends Fragment {

    TextView camera,chat;
    ViewPager viewPager;
    PagerViewAdapter pagerViewAdapter;
    TabLayout tabLayout;


@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_first,container,false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tabLayout=(TabLayout)view.findViewById(R.id.tabLayout);
        viewPager =(ViewPager)view.findViewById(R.id.fragment_container);

        tabLayout.addTab(tabLayout.newTab().setText("Fruits"));
        tabLayout.addTab(tabLayout.newTab().setText("vegetables"));


        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        pagerViewAdapter =new PagerViewAdapter(requireContext(),getChildFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerViewAdapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }





}


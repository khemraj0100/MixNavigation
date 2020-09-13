package com.example.mixnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    String id;
    DrawerLayout drawerLayout;

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id=getIntent().getStringExtra("id");


        drawerLayout=(DrawerLayout) findViewById(R.id.drawer_Layout);
        NavigationView navigationView=(NavigationView) findViewById(R.id.navigation);

        loadFragment(new FirstFragment());
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment frag=null;
                int itemid= item.getItemId();
                if (itemid==R.id.first){
                    frag =new FirstFragment();
                }
                 if (itemid==R.id.second) {
                     frag = new SecondFragment();
                 } else
                 if (itemid==R.id.thrid)
                    frag=new ThirdFragment();


                if (frag != null){
                    loadFragment(frag);
                    drawerLayout.closeDrawers();
                    return true;

                }
                return false;
            }
        });
    }

    private void loadFragment(Fragment frag) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,frag);
        transaction.commit();
    }
}
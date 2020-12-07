package com.example.southnews;

import android.content.Intent;
import android.os.Bundle;

import com.example.southnews.EnglishNewsWebsites.EnglishNewsFragment;
import com.example.southnews.TaluguNewsWebsites.TeluguNewsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.provider.MediaStore;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomView;
    FrameLayout frameLayout;
   /* final Fragment englishNews = new EnglishNewsFragment();*/
    final Fragment teluguNews = new TeluguNewsFragment();
    final FragmentManager fm = getSupportFragmentManager();
    Fragment active = teluguNews;
    Integer itemId = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("");

        frameLayout = findViewById(R.id.frame_layout_id);
        ImageView share = findViewById(R.id.share_img);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_SUBJECT,"south news");
                i.putExtra(Intent.EXTRA_TEXT,"E:/Android Programs Zip files/SouthNews/app/build/outputs/apk/debug/app-debug.apk");
                startActivity(Intent.createChooser(i,"share via"));

            }
        });

       /* fm.beginTransaction().add(R.id.frame_layout_id, englishNews, "2").hide(englishNews).commit();*/
        fm.beginTransaction().add(R.id.frame_layout_id,teluguNews,"1").commit();

        bottomView = findViewById(R.id.bottom_navigation_view);
        bottomView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

         getSupportActionBar().setHomeButtonEnabled(true);
         getSupportActionBar().setDisplayHomeAsUpEnabled(true); //if u want to change navigation icon use this 3 lines
         getSupportActionBar().setHomeAsUpIndicator(R.drawable.hamburger_icon);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
            fm.beginTransaction().hide(active).show(teluguNews).commit();
            active = teluguNews;
            bottomView.setSelectedItemId(R.id.nav_home);

        } else if (id == R.id.nav_gallery) {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_SUBJECT,"south news");
            i.putExtra(Intent.EXTRA_TEXT,"Chitti Kalyani");
            startActivity(Intent.createChooser(i,"share via"));

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            if (itemId != item.getItemId()) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        fm.beginTransaction().hide(active).show(teluguNews).commit();
                        active = teluguNews;
                        break;
                  /*  case R.id.navigation_dashboard:
                        fm.beginTransaction().hide(active).show(englishNews).commit();
                        active = englishNews;
                        break;*/
                }
                itemId = item.getItemId();
            }
            return false;
        }
    };


}

package com.geektech.todoapp.ui.onboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.geektech.todoapp.MainActivity;
import com.geektech.todoapp.Prefs;
import com.geektech.todoapp.R;
import com.google.android.material.tabs.TabLayout;

public class  OnBoardActivity extends AppCompatActivity {

    Button button;

Prefs prefs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board);
        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager, true);


        button = findViewById(R.id.btnSkip);
    }


    public void onClick(View view) {
        Prefs.getInstance(this).saveShown();
        startActivity(new Intent(this, MainActivity.class));
        finish();

    }
}

package com.tech.world.activities.main;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.widget.TextView;


import com.tech.world.R;


public class MeetingActivity extends AppCompatActivity {
    TextView hmeet,jmeet;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meeting);
        hmeet=findViewById(R.id.hostmeet);
        jmeet=findViewById(R.id.joinmeet);


        Tools.setSystemBarLight(this);
        Tools.setSystemBarColor(this, R.color.colorPrimaryDark);


        loadFragments(new HostFragment());

        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.ctoolbar);
        setSupportActionBar(toolbar);

//        getSupportActionBar().setTitle("Meetings");
        hmeet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HostFragment hoostFragment=new HostFragment();
            loadFragments(hoostFragment);
            }
        });

        jmeet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               JoinFragment joinFragment=new JoinFragment();
            loadFragments(joinFragment);


            }
        });

        
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.history,menu);
      return  true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.history) {


            startActivity(new Intent(MeetingActivity.this,MeetingHistoryActivity.class));
        }
        return true;
    }

        private void loadFragments(Fragment fragment) {
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.flayout,fragment);
            fragmentTransaction.commit();


        }
    }

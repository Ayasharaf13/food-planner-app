package com.example.foodplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Initially add FragmentOne
        getSupportFragmentManager().beginTransaction()
                .add(R.id.containerSplash, new SplashFragment())
                .commit();


    }
}

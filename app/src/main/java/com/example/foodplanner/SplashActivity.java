package com.example.foodplanner;

import androidx.appcompat.app.AppCompatActivity;
<<<<<<< HEAD
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;

public class SplashActivity extends AppCompatActivity {

    NavController navController;
    FirebaseAuth mAuth;

=======

import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

>>>>>>> 0addf75370e7c58045e03d29d4f1ba2dc50defe8
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

<<<<<<< HEAD


        // Find the NavController
        NavHostFragment navHostFragment =
                (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment_activity_splash);
        navController = navHostFragment.getNavController();




    }


=======
        // Initially add FragmentOne
        getSupportFragmentManager().beginTransaction()
                .add(R.id.containerSplash, new SplashFragment())
                .commit();


    }
>>>>>>> 0addf75370e7c58045e03d29d4f1ba2dc50defe8
}

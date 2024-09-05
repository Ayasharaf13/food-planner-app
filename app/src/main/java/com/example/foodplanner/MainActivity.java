package com.example.foodplanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.database.Observable;
import android.os.Bundle;
import android.util.Log;

import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.network.NetworkDelegate;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.bottomNavigationView);

        // Find the NavController
        NavHostFragment navHostFragment =
                (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment_activity_main);
        navController = navHostFragment.getNavController();


        // Set up the ActionBar with NavController
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.homeFragment, R.id.searchFragment, R.id.plannerFragment, R.id.searchFragment
        ).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        // Set up Bottom Navigation Bar with NavController
        NavigationUI.setupWithNavController(navView, navController);

        // Enhance user experience by clearing the back stack
        bottomNavItemChangeListener(navView);

    }

    private void bottomNavItemChangeListener(BottomNavigationView navView) {
        navView.setOnItemSelectedListener(item -> {
            if (item.getItemId() != navView.getSelectedItemId()) {
                navController.popBackStack(item.getItemId(), false, false);
                navController.navigate(item.getItemId());
            }
            return true;
        });


    }
}
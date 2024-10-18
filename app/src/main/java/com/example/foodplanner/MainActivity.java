package com.example.foodplanner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;


public class MainActivity extends AppCompatActivity {

    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

       */
        BottomNavigationView navView = findViewById(R.id.bottomNavigationView);

        navView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if(item.getItemId() == R.id.searchFragment){
                    Toast.makeText(MainActivity.this,"Search",Toast.LENGTH_LONG).show();
                  //  navController.navigate(item.getItemId());
                }
                return false;
            }
        });

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
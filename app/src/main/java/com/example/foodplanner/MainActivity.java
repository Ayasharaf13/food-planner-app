package com.example.foodplanner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.foodplanner.detailsmeals.view.DetailsMealFragment;
import com.example.foodplanner.search.view.MealCategoryFragmentDirections;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    private NavController navController;
    private Uri uri;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // getting the data from our intent in our uri.
        uri = getIntent().getData();





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
                R.id.homeFragment, R.id.searchFragment, R.id.plannerFragment, R.id.saveFragment
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

/*
the Activity as in onCreate Activity is just inflating the View and haven't set the NavHostController.
So if you setup onClickListener in onStart of activity is will work as expected.
 */

    @Override
    protected void onStart() {
        super.onStart();

        // checking if the uri is null or not.
        if (uri != null) {
            // if the uri is not null then we are getting
            // the path segments and storing it in list.
            List<String> parameters = uri.getPathSegments();

            // after that we are extracting string
            // from that parameters.
            String param = parameters.get(parameters.size() - 1);

            // Create a bundle to hold the argument
            Bundle bundle = new Bundle();
            bundle.putString("myArg", param);

            // Find the NavController and navigate to the Fragment
            NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.detailsMealFragment, bundle);

            //   NavDirections action = MealCategoryFragmentDirections.actionMealCategoryFragmentToDetailsMealFragment(param);
            //  Navigation.findNavController(view).navigate(action);

        }
    }
}
package com.example.foodplanner.detailsmeals.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodplanner.R;

import java.util.Objects;

public class DetailsMealFragment extends Fragment {

    private ImageView mealImageView;
    private TextView titleTextView, caloriesTextView, ratingTextView, instructionsTextView;


    public DetailsMealFragment() {
        // Required empty public constructor
    }


    public static DetailsMealFragment newInstance(String param1, String param2) {
        DetailsMealFragment fragment = new DetailsMealFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_details_meal, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        // Bind views
        mealImageView = view.findViewById(R.id.meal_image);
        titleTextView = view.findViewById(R.id.meal_title);
        caloriesTextView =view. findViewById(R.id.meal_calories);
        ratingTextView = view.findViewById(R.id.meal_rating);
        instructionsTextView = view.findViewById(R.id.meal_instructions);

        // Toolbar setup
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        setHasOptionsMenu(true);
        toolbar.setTitle("MyToolBar");
        // calling the action bar
        ActionBar actionBar = ((AppCompatActivity) Objects.requireNonNull(getActivity())).getSupportActionBar();

        // Customize the back button
        assert actionBar != null;
        actionBar.setHomeAsUpIndicator(R.drawable.backicon);


        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);
        //setSupportActionBar(toolbar);
       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);



    }
}
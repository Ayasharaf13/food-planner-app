package com.example.foodplanner.search.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodplanner.R;
import com.example.foodplanner.db.ConcreteLocalSource;
import com.example.foodplanner.home.view.HomeAdapter;
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.Repository;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.search.presenter.MealCountryInterface;
import com.example.foodplanner.search.presenter.MealCountryPresenter;

import java.util.List;

public class MealCountryFragment extends Fragment  implements CountryMealView{

  RecyclerView recyclerMealCountry;
 HomeAdapter  adapterCountryMeal;
  String nameCountry;
  MealCountryInterface mealCountryPresenter;


    public MealCountryFragment() {
        // Required empty public constructor
    }


    public static MealCountryFragment newInstance(String param1, String param2) {
        MealCountryFragment fragment = new MealCountryFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       mealCountryPresenter = new MealCountryPresenter(Repository.getInstance(FoodClient.getInstance(),
               ConcreteLocalSource.getInstance(requireContext())),this);
        adapterCountryMeal = new HomeAdapter("mealCountry");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_meal_country, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerMealCountry = view.findViewById(R.id.recyclerMealCountry);

        GridLayoutManager layoutManager=new GridLayoutManager(requireContext(),2);

        recyclerMealCountry.setLayoutManager(layoutManager);

        // Retrieve the argument using Safe Args
        if (getArguments() != null) {
          MealCountryFragmentArgs args = MealCountryFragmentArgs.fromBundle(getArguments());
          nameCountry =  args.getCountryName();

          mealCountryPresenter.getCountryMeal(nameCountry);

        }
    }

    @Override
    public void showCountryMeal(List<RandomMeal> meals) {

        adapterCountryMeal.submitList(meals);
        recyclerMealCountry.setAdapter(adapterCountryMeal);


    }


}
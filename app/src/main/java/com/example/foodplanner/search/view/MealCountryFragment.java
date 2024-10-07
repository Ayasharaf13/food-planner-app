package com.example.foodplanner.search.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

<<<<<<< HEAD
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
=======
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e

import com.example.foodplanner.R;
import com.example.foodplanner.db.ConcreteLocalSource;
import com.example.foodplanner.home.view.HomeAdapter;
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.Repository;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.search.presenter.MealCountryInterface;
import com.example.foodplanner.search.presenter.MealCountryPresenter;
<<<<<<< HEAD
import com.example.foodplanner.search.presenter.SearchResultPresenter;

import java.util.List;

public class MealCountryFragment extends Fragment  implements CountryMealView,SearchResultView{
=======

import java.util.List;

public class MealCountryFragment extends Fragment  implements CountryMealView{
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e

  RecyclerView recyclerMealCountry;
 HomeAdapter  adapterCountryMeal;
  String nameCountry;
  MealCountryInterface mealCountryPresenter;
<<<<<<< HEAD
  EditText searchViewCountry;
  SearchResultPresenter searchResultPresenter;
=======
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e


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
<<<<<<< HEAD


        searchResultPresenter = new SearchResultPresenter(Repository.getInstance(FoodClient.getInstance(),
                ConcreteLocalSource.getInstance(requireContext())),this);
=======
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
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

<<<<<<< HEAD
          searchViewCountry = view.findViewById(R.id.searchTextCountry);

          searchViewCountry.addTextChangedListener(new TextWatcher() {
              @Override
              public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

              }

              @Override
              public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                  searchResultPresenter.getMealsBySearch(charSequence.toString());
              }

              @Override
              public void afterTextChanged(Editable editable) {

                  searchResultPresenter.getMealsBySearch(editable.toString());

              }
          });

=======
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
        }
    }

    @Override
    public void showCountryMeal(List<RandomMeal> meals) {

        adapterCountryMeal.submitList(meals);
        recyclerMealCountry.setAdapter(adapterCountryMeal);


    }


<<<<<<< HEAD
    @Override
    public void showMealsBySearch(List<RandomMeal> meals) {


        adapterCountryMeal.submitList(meals);
        recyclerMealCountry.setAdapter(adapterCountryMeal);
    }
=======
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
}
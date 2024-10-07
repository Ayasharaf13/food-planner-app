package com.example.foodplanner.search.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.RecoverySystem;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.foodplanner.R;
import com.example.foodplanner.db.ConcreteLocalSource;
import com.example.foodplanner.detailsmeals.view.DetailsMealFragmentArgs;
import com.example.foodplanner.home.view.HomeAdapter;
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.Repository;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.search.presenter.IngredientsMealPresenter;
import com.example.foodplanner.search.presenter.IngredientsPresenterInterface;
import com.example.foodplanner.search.presenter.SearchResultPresenter;

import java.util.List;

//mealIngred
public class IngredientsMealsFragment extends Fragment  implements IngredientsMealInterface,SearchResultView{

    RecyclerView recyclerIngredMeal;
    HomeAdapter adapterIngredMeal;
    IngredientsPresenterInterface ingredientsPresenter;
    String nameIngred;
    EditText searchAreaIngred;
    SearchResultPresenter searchResultPresenter;



    public IngredientsMealsFragment() {
        // Required empty public constructor
    }


    public static IngredientsMealsFragment newInstance(String param1, String param2) {
        IngredientsMealsFragment fragment = new IngredientsMealsFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

                ingredientsPresenter = new IngredientsMealPresenter(Repository.getInstance(FoodClient.getInstance(),
                ConcreteLocalSource.getInstance(requireContext())),this);
                adapterIngredMeal = new HomeAdapter("mealIngred");


        searchResultPresenter = new SearchResultPresenter(Repository.getInstance(FoodClient.getInstance(),
                ConcreteLocalSource.getInstance(requireContext())),this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ingredients_meals, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerIngredMeal=view.findViewById(R.id.recyclerFilterByIngred);
        GridLayoutManager layoutManager=new GridLayoutManager(requireContext(),2);
         searchAreaIngred=view.findViewById(R.id.searchTextIngred);
        recyclerIngredMeal.setLayoutManager(layoutManager);

        searchAreaIngred.addTextChangedListener(new TextWatcher() {
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

// Retrieve the argument using Safe Args
        if (getArguments() != null) {
            IngredientsMealsFragmentArgs args = IngredientsMealsFragmentArgs.fromBundle(getArguments());
            nameIngred = args.getNameIngredients();
            ingredientsPresenter.getMealsByIngredients(nameIngred);

        }
    }


    @Override
    public void showIngredientsMeal(List<RandomMeal> meals) {

          adapterIngredMeal.submitList(meals);
          recyclerIngredMeal.setAdapter(adapterIngredMeal);


    }

    @Override
    public void showMealsBySearch(List<RandomMeal> meals) {

        adapterIngredMeal.submitList(meals);
        recyclerIngredMeal.setAdapter(adapterIngredMeal);


    }
}
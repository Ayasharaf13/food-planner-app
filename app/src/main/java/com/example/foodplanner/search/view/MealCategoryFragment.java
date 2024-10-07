package com.example.foodplanner.search.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
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
import com.example.foodplanner.search.presenter.MealCategoryPresenter;
import com.example.foodplanner.search.presenter.MealCategoryPresenterInterface;
import com.example.foodplanner.search.presenter.SearchResultPresenter;

import java.util.List;

public class MealCategoryFragment extends Fragment  implements MealCategoryView ,SearchResultView{

 String idMealCategory;
 RecyclerView recyclerViewMealCategory;
 MealCategoryPresenterInterface mealCategoryPresenter;
 HomeAdapter mealCategoryAdapter;
 EditText searchViewCategory;

 SearchResultPresenter searchResultPresenter;


    public MealCategoryFragment() {
        // Required empty public constructor
    }


    public static MealCategoryFragment newInstance(String param1, String param2) {
        MealCategoryFragment fragment = new MealCategoryFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mealCategoryPresenter = new MealCategoryPresenter(Repository.getInstance(FoodClient.getInstance(),
                ConcreteLocalSource.getInstance(requireContext())),this);
           mealCategoryAdapter = new HomeAdapter("category");

        searchResultPresenter = new SearchResultPresenter(Repository.getInstance(FoodClient.getInstance(),
                ConcreteLocalSource.getInstance(requireContext())),this);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_meal_category, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Retrieve the argument using Safe Args
           if (getArguments() != null) {

             MealCategoryFragmentArgs args = MealCategoryFragmentArgs.fromBundle(getArguments());
             idMealCategory = args.getIdCategory();
             mealCategoryPresenter.getMealCategory(idMealCategory);
               Log.i("mealcategory",idMealCategory);

        }

        recyclerViewMealCategory = view.findViewById(R.id.recyclerMealCategory);
        GridLayoutManager layoutManager=new GridLayoutManager(requireContext(),2);

        recyclerViewMealCategory.setLayoutManager(layoutManager);

        searchViewCategory=view.findViewById(R.id.searchTextCategory);

        searchViewCategory.addTextChangedListener(new TextWatcher() {
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


    }

    @Override
    public void showMealCategory(List<RandomMeal> meals) {

        mealCategoryAdapter.submitList(meals);
        recyclerViewMealCategory.setAdapter(mealCategoryAdapter);

    }

    @Override
    public void showMealsBySearch(List<RandomMeal> meals) {

        mealCategoryAdapter.submitList(meals);
        recyclerViewMealCategory.setAdapter(mealCategoryAdapter);

    }
}
package com.example.foodplanner.search.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodplanner.R;
import com.example.foodplanner.db.ConcreteLocalSource;
import com.example.foodplanner.detailsmeals.view.DetailsMealFragmentArgs;
import com.example.foodplanner.home.view.HomeAdapter;
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.Repository;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.search.presenter.MealCategoryPresenter;
import com.example.foodplanner.search.presenter.MealCategoryPresenterInterface;

import java.util.List;

public class MealCategoryFragment extends Fragment  implements MealCategoryView{

 String idMealCategory;
 RecyclerView recyclerViewMealCategory;
 MealCategoryPresenterInterface mealCategoryPresenter;
 HomeAdapter mealCategoryAdapter;


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
           mealCategoryAdapter = new HomeAdapter(false);


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



    }

    @Override
    public void showMealCategory(List<RandomMeal> meals) {

        mealCategoryAdapter.submitList(meals);
        recyclerViewMealCategory.setAdapter(mealCategoryAdapter);

    }
}
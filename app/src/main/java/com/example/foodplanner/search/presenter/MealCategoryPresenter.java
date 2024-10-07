package com.example.foodplanner.search.presenter;


import android.util.Log;

import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.RepositoryInterface;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.network.NetworkDelegate;
import com.example.foodplanner.search.view.MealCategoryView;

import java.util.List;

public class MealCategoryPresenter implements MealCategoryPresenterInterface, NetworkDelegate {

    RepositoryInterface repo ;
    MealCategoryView mealCategoryView;

    public MealCategoryPresenter (RepositoryInterface repo , MealCategoryView mealCategoryInterface){
        this.repo =repo;
        this.mealCategoryView =mealCategoryInterface;

    }


    @Override
    public void getMealCategory(String id) {

        repo.getMealByCategory(FoodClient.getInstance().getApiService().getMealsByCategory(id),this);

    }


    @Override
    public void OnSuccessResult(List<RandomMeal> listOfMeals) {

        mealCategoryView.showMealCategory(listOfMeals);

    }

    @Override
    public void OnFailureResult(String errorMass) {

        Log.i("mealCategory",errorMass);

    }
}

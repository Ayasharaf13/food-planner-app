package com.example.foodplanner.search.presenter;


import android.util.Log;

import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.RepositoryInterface;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.network.NetworkDelegate;
import com.example.foodplanner.search.view.IngredientsMealInterface;

import java.util.List;

public class IngredientsMealPresenter implements IngredientsPresenterInterface , NetworkDelegate {

    RepositoryInterface repo ;
    IngredientsMealInterface ingredientsMealView;

    public IngredientsMealPresenter (RepositoryInterface repo , IngredientsMealInterface ingredientsMealInterfaceView){
        this.repo =repo;
        this.ingredientsMealView=ingredientsMealInterfaceView;

    }

    @Override
    public void OnSuccessResult(List<RandomMeal> listOfMeals) {

        ingredientsMealView.showIngredientsMeal(listOfMeals);

    }

    @Override
    public void OnFailureResult(String errorMass) {

        Log.i("filterByIngre",errorMass);
    }

    @Override
    public void getMealsByIngredients(String  nameIngredients) {

        repo.getMealByIngredients(FoodClient.getInstance().getApiService().getMealsByIngredients(nameIngredients),this);

    }


}

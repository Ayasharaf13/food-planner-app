package com.example.foodplanner.home.presenter;

import android.util.Log;

import com.example.foodplanner.home.view.HomeViewInterface;
import com.example.foodplanner.models.Category;
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.RepositoryInterface;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.network.NetworkDelegate;

import java.util.List;
import java.util.Random;


public class HomePresenter implements HomePresenterInterface , NetworkDelegate {

    RepositoryInterface repo ;
    HomeViewInterface homeViewRandomMeal;


    public HomePresenter (RepositoryInterface repo , HomeViewInterface homeViewRandomMeal){

        this.repo =repo;
        this. homeViewRandomMeal =homeViewRandomMeal;

    }
   // makeApiCall(getApiService().getRandomMeals(), networkDelegate);

    @Override
    public void OnSuccessResult(List<RandomMeal> listOfMeals) {
         homeViewRandomMeal.showData(listOfMeals);
         homeViewRandomMeal.showSuggestionMeals(listOfMeals);

    }

    @Override
    public void OnFailureResult(String errorMass) {
         Log.i("OnFailuer",errorMass);
    }


    @Override
    public void getRandomMeals() {

   //      repo.getProductsNetwork(this);
        repo.getProductsNetwork(FoodClient.getInstance().getApiService().getRandomMeals(),this);

    }

    @Override
    public void getSuggestionMeals() {
        Random random = new Random();
        Character c = (char) (random.nextInt(26) + 'A');
        Log.i("charr",c.toString());
        repo.getSuggestMealsNetwork(FoodClient.getInstance().getApiService().getSuggestionMeals(c.toString()), this);

    }


}

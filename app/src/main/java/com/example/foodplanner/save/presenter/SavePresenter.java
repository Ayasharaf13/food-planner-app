package com.example.foodplanner.save.presenter;

/*
 RepositoryInterface repo ;
    HomeViewInterface homeViewRandomMeal;


    public HomePresenter (RepositoryInterface repo , HomeViewInterface homeViewRandomMeal){

        this.repo =repo;
        this. homeViewRandomMeal =homeViewRandomMeal;

    }
 */

import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.network.NetworkDelegate;

import java.util.List;

public class SavePresenter implements NetworkDelegate ,SavePresenterInterface {


    @Override
    public void OnSuccessResult(List<RandomMeal> listOfMeals) {

    }

    @Override
    public void OnFailureResult(String errorMass) {

    }

    @Override
    public void showMealSaved() {
      //  repo.getMealByIdNetwork(FoodClient.getInstance().getApiService().getMealsById(id),this);

    }

    @Override
    public void saveMeal(String id) {

    }

    @Override
    public void deleteMeal(String id) {

    }


}

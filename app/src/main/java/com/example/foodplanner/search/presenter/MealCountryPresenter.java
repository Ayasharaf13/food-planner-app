package com.example.foodplanner.search.presenter;



import android.util.Log;

import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.RepositoryInterface;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.network.NetworkDelegate;
import com.example.foodplanner.search.view.CountryMealView;

import java.util.List;

public class MealCountryPresenter  implements MealCountryInterface, NetworkDelegate {


    RepositoryInterface repo ;
     CountryMealView countryMealDetailsView;

    public MealCountryPresenter (RepositoryInterface repo , CountryMealView mealCategoryInterface){
        this.repo =repo;
        this.countryMealDetailsView =mealCategoryInterface;

    }


    @Override
    public void OnSuccessResult(List<RandomMeal> listOfMeals) {
        countryMealDetailsView.showCountryMeal(listOfMeals);
    }

    @Override
    public void OnFailureResult(String errorMass) {

        Log.i("detailsMealByCountry",errorMass);

    }

    @Override
    public void getCountryMeal(String nameCountry) {

        repo.getMealByCountry(FoodClient.getInstance().getApiService().getMealsByCountry(nameCountry),this);

    }


}

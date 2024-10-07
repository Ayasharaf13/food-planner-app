package com.example.foodplanner.search.presenter;


/*
 implements MealCountryInterface, NetworkDelegate {


    RepositoryInterface repo ;
     CountryMealView countryMealDetailsView;

    public MealCountryPresenter (RepositoryInterface repo , CountryMealView mealCategoryInterface){
        this.repo =repo;
        this.countryMealDetailsView =mealCategoryInterface;

    }

 */

import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.RepositoryInterface;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.network.NetworkDelegate;
import com.example.foodplanner.search.view.SearchResultView;

import java.util.List;

public class SearchResultPresenter implements SearchResultPresenterInterface, NetworkDelegate {

    RepositoryInterface repo;
    SearchResultView searchResultView;


    public SearchResultPresenter (RepositoryInterface repo , SearchResultView view){
        this.repo=repo;
        this.searchResultView=view;

    }


    @Override
    public void OnSuccessResult(List<RandomMeal> listOfMeals) {
        searchResultView.showMealsBySearch(listOfMeals);
    }

    @Override
    public void OnFailureResult(String errorMass) {

    }

    @Override
    public void getMealsBySearch(String mealName) {

        repo.searchByName(FoodClient.getInstance().getApiService().getMealsBySearch(mealName),this);


    }
}

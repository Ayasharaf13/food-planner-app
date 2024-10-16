package com.example.foodplanner.search.presenter;

import android.util.Log;

import com.example.foodplanner.models.Category;
import com.example.foodplanner.models.CountryNames;
import com.example.foodplanner.models.Ingredients;
import com.example.foodplanner.models.RepositoryInterface;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.network.NetworkDelegateCategory;
import com.example.foodplanner.network.NetworkDelegateCountry;
import com.example.foodplanner.network.NetworkIngredients;
import com.example.foodplanner.search.view.SearchViewInterface;

import java.util.List;

public class SearchPresenter  implements NetworkDelegateCategory,SearchPresenterInterface , NetworkIngredients , NetworkDelegateCountry {

    RepositoryInterface repo ;
    SearchViewInterface searchViewInterface;

    public SearchPresenter (RepositoryInterface repo , SearchViewInterface searchViewInterface){
        this.repo =repo;
        this.searchViewInterface =searchViewInterface;

    }

    @Override
    public void OnSuccessResultIngredients(List<Ingredients> listOfMeals) {

        searchViewInterface.showIngredients(listOfMeals);

    }


    @Override
    public void OnSuccessResultCountries(List<CountryNames> listOfCountryNames) {

        searchViewInterface.showCountries(listOfCountryNames);
        Log.i("countryyy",">>>>listtttttt");

    }



    @Override
    public void OnFailureResult(String errorMass) {
        Log.i("error Category",errorMass);
    }

    @Override
    public void OnSuccessResultCategory(List<Category> categoryList) {

        searchViewInterface.showCategory(categoryList);


    }


    @Override
    public void getCategories() {

        repo.getCategories(FoodClient.getInstance().getApiService().getCategory(),this);

    }

    @Override
    public void getIngredients() {

        repo.getMealByIngredients(FoodClient.getInstance().getApiService().getMealsByIngredients(),this);

    }

    @Override
    public void getCountries() {

        repo.getCountriesName(FoodClient.getInstance().getApiService().getCountries(),this);

    }




}

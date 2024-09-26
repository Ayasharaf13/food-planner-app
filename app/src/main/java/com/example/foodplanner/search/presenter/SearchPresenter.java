package com.example.foodplanner.search.presenter;

import android.util.Log;

import com.example.foodplanner.models.Category;
<<<<<<< HEAD
import com.example.foodplanner.models.Ingredients;
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.RepositoryInterface;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.network.NetworkDelegate;
import com.example.foodplanner.network.NetworkDelegateCategory;
import com.example.foodplanner.network.NetworkIngredients;
=======
import com.example.foodplanner.models.RepositoryInterface;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.network.NetworkDelegateCategory;
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
import com.example.foodplanner.search.view.SearchViewInterface;

import java.util.List;

<<<<<<< HEAD
public class SearchPresenter  implements NetworkDelegateCategory,SearchPresenterInterface , NetworkIngredients {
=======
public class SearchPresenter  implements NetworkDelegateCategory,SearchPresenterInterface  {
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61

    RepositoryInterface repo ;
    SearchViewInterface searchViewInterface;

    public SearchPresenter (RepositoryInterface repo , SearchViewInterface searchViewInterface){
        this.repo =repo;
        this.searchViewInterface =searchViewInterface;

    }

<<<<<<< HEAD
    @Override
    public void OnSuccessResult(List<Ingredients> listOfMeals) {

        searchViewInterface.showIngredients(listOfMeals);

    }
=======
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61

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

<<<<<<< HEAD
    @Override
    public void getIngredients() {

        repo.getMealByIngredients(FoodClient.getInstance().getApiService().getMealsByIngredients(),this);

    }

=======
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61

}

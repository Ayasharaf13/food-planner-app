package com.example.foodplanner.detailsmeals.presenter;

import android.util.Log;

import com.example.foodplanner.detailsmeals.view.DetailsViewInterface;
import com.example.foodplanner.home.view.HomeViewInterface;
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.RepositoryInterface;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.network.NetworkDelegate;

import java.util.List;

public class DetailsPresenter  implements DetailsPresenterInterface , NetworkDelegate {

RepositoryInterface repo;
DetailsViewInterface view;

 public  DetailsPresenter(RepositoryInterface repo,DetailsViewInterface detailsView){
     this.repo=repo;
     this.view=detailsView;

 }

    @Override
    public void getMealsByID(String id) {
        repo.getMealByIdNetwork(FoodClient.getInstance().getApiService().getMealsById(id),this);

    }


    @Override
    public void OnSuccessResult(List<RandomMeal> listOfMeals) {
       view.showMealsById(listOfMeals);

    }

    @Override
    public void OnFailureResult(String errorMass) {
        Log.i("errorMealsById",errorMass);
    }
}

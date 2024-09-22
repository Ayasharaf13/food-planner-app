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
<<<<<<< HEAD

=======
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9
    @Override
    public void getMealsByID(String id) {
        repo.getMealByIdNetwork(FoodClient.getInstance().getApiService().getMealsById(id),this);

    }

<<<<<<< HEAD

=======
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9
    @Override
    public void OnSuccessResult(List<RandomMeal> listOfMeals) {
       view.showMealsById(listOfMeals);

    }

    @Override
    public void OnFailureResult(String errorMass) {
        Log.i("errorMealsById",errorMass);
    }
}

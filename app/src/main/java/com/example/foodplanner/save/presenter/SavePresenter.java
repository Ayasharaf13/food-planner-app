package com.example.foodplanner.save.presenter;

/*
 RepositoryInterface repo ;
    HomeViewInterface homeViewRandomMeal;


    public HomePresenter (RepositoryInterface repo , HomeViewInterface homeViewRandomMeal){

        this.repo =repo;
        this. homeViewRandomMeal =homeViewRandomMeal;

    }
 */

import android.util.Log;

import androidx.lifecycle.LiveData;

import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.RepositoryInterface;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.network.NetworkDelegate;
import com.example.foodplanner.save.view.SaveViewInterface;

import java.util.List;

public class SavePresenter implements NetworkDelegate ,SavePresenterInterface {


      RepositoryInterface repo ;
      SaveViewInterface saveViewInterface;


    public SavePresenter (RepositoryInterface repo , SaveViewInterface saveViewInterface){
        this.repo =repo;
        this.saveViewInterface =saveViewInterface;

    }

        public void getMealsByID(String id) {
        repo.getMealByIdNetwork(FoodClient.getInstance().getApiService().getMealsById(id),this);
    }

    @Override
    public void delete(List<RandomMeal> meal) {

        repo.deleteMeal(meal);

    }

    @Override
    public LiveData<List<RandomMeal>> searchById(String id) {

      return   repo.searchById(id);

    }

    @Override
    public void OnSuccessResult(List<RandomMeal> listOfMeals) {
        repo.saveMeal(listOfMeals);
        Log.i("sucess","done sucess save");
        saveViewInterface.showMealSaved(repo.getAllMealFromStorage());
    }

    @Override
    public void OnFailureResult(String errorMass) {
        Log.i("ErrorSave",errorMass);

    }




}

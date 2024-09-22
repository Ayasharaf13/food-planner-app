package com.example.foodplanner.save.presenter;

/*
 RepositoryInterface repo ;
    HomeViewInterface homeViewRandomMeal;


    public HomePresenter (RepositoryInterface repo , HomeViewInterface homeViewRandomMeal){

        this.repo =repo;
        this. homeViewRandomMeal =homeViewRandomMeal;

    }
 */

<<<<<<< HEAD
import android.util.Log;

import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.RepositoryInterface;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.network.NetworkDelegate;
import com.example.foodplanner.save.view.SaveViewInterface;
=======
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.network.NetworkDelegate;
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9

import java.util.List;

public class SavePresenter implements NetworkDelegate ,SavePresenterInterface {


<<<<<<< HEAD
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
    public void OnSuccessResult(List<RandomMeal> listOfMeals) {
        repo.saveMeal(listOfMeals);
        Log.i("sucess","done sucess save");
        saveViewInterface.showMealSaved(repo.getAllMealFromStorage());
=======
    @Override
    public void OnSuccessResult(List<RandomMeal> listOfMeals) {

>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9
    }

    @Override
    public void OnFailureResult(String errorMass) {
<<<<<<< HEAD
        Log.i("ErrorSave",errorMass);
=======

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
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9

    }


}

package com.example.foodplanner.save.presenter;


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
    public LiveData<List<RandomMeal>> getAllSavePlannerBySelectedDay(int id) {
        return repo.getAllMealsSavedPlannerBySelectDay(id);
    }


    @Override
    public LiveData<List<RandomMeal>> getAllSaveBySelectedDay(int id) {
        return repo.getAllMealFromStorage(id);
    }


    @Override
    public void OnSuccessResult(List<RandomMeal> listOfMeals) {
        listOfMeals.get(0).setSave(true);
        listOfMeals.get(0).setPlanner(false);
        listOfMeals.get(0).setId(36);// field for saved
        repo.saveMeal(listOfMeals);
        Log.i("sucess","done sucess save");
        saveViewInterface.showMealSaved(repo.getAllMealFromStorage(36));
      //  saveViewInterface.showMealSaved(repo.getAllMealsSavedPlannerBySelectDay(36));
    }

    @Override
    public void OnFailureResult(String errorMass) {
        Log.i("ErrorSave",errorMass);

    }


}

package com.example.foodplanner.planner.presenter;


import android.util.Log;

import androidx.lifecycle.LiveData;

import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.RepositoryInterface;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.network.NetworkDelegate;
import com.example.foodplanner.planner.view.PlannerViewInterface;

import java.util.List;

public class PlannerPresenter implements PlannerPresenterInterface ,NetworkDelegate{


    RepositoryInterface repo;
    PlannerViewInterface plannerViewInterface;
    String dat;




    public PlannerPresenter (RepositoryInterface repo, PlannerViewInterface plannerViewInterface){
        this.repo = repo;
        this.plannerViewInterface = plannerViewInterface;
    }


    @Override
    public void OnSuccessResult(List<RandomMeal> listOfMeals) {

        listOfMeals.get(0).date = getDat() ;
        listOfMeals.get(0).setPlanner(true);
        listOfMeals.get(0).setSave(false);

        Log.i("calenderdate: ",getDat());

        repo.saveMeal(listOfMeals);
        plannerViewInterface.showMealsPlanner(repo.getAllMealFromStoragePlanner());


      //  repo.saveMeal(listOfMeals);
       // plannerViewInterface.showMealsPlanner(repo.getAllMealFromStorage());

    }

    @Override
    public void OnFailureResult(String errorMass) {

        Log.i("failPlanner",errorMass);

    }


    @Override
    public String getDat() {
        return dat;
    }

    @Override
    public void setDat(String dat) {
        this.dat=dat;
    }

    @Override
    public void getMealsPlanner(String id) {

        repo.getMealByIdNetwork(FoodClient.getInstance().getApiService().getMealsById(id),this);
    }

    @Override
    public LiveData<List<RandomMeal>> searchByIdDB(String id) {
        return repo.searchByIdPlanner(id);
    }

    @Override
    public void delete(List<RandomMeal> meal) {

         repo.deleteMeal(meal);
    }




}

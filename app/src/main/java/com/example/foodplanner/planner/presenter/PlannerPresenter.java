package com.example.foodplanner.planner.presenter;


import android.util.Log;

import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.RepositoryInterface;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.network.NetworkDelegate;
import com.example.foodplanner.planner.view.PlannerViewInterface;

import java.util.List;

public class PlannerPresenter implements PlannerPresenterInterface , NetworkDelegate {


    RepositoryInterface repo;
    PlannerViewInterface plannerViewInterface;


    public PlannerPresenter (RepositoryInterface repo, PlannerViewInterface plannerViewInterface){
        this.repo = repo;
        this.plannerViewInterface = plannerViewInterface;
    }

    @Override
    public void OnSuccessResult(List<RandomMeal> listOfMeals) {

        repo.saveMeal(listOfMeals);
        plannerViewInterface.showMealsPlanner(repo.getAllMealFromStorage());

    }

    @Override
    public void OnFailureResult(String errorMass) {

        Log.i("failPlanner",errorMass);

    }

    @Override
    public void getMealsPlanner(String id) {

        repo.getMealByIdNetwork(FoodClient.getInstance().getApiService().getMealsById(id),this);
    }
}

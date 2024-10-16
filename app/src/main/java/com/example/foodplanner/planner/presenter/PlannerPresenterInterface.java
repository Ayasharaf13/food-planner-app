package com.example.foodplanner.planner.presenter;


import androidx.lifecycle.LiveData;

import com.example.foodplanner.models.RandomMeal;

import java.util.List;

public interface PlannerPresenterInterface {


    public String getDat() ;


    public void setDat(String dat) ;


     void getMealsPlanner(String id );

     LiveData<List<RandomMeal>> searchByIdDB (String id);
     void delete (List<RandomMeal> meal);

}

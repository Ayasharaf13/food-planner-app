package com.example.foodplanner.planner.view;


import androidx.lifecycle.LiveData;

import com.example.foodplanner.models.RandomMeal;

import java.util.List;

public interface PlannerViewInterface {
    void showMealsPlanner(LiveData<List<RandomMeal>> meals);



}

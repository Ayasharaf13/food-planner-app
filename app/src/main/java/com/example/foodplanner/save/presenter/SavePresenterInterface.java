package com.example.foodplanner.save.presenter;

import com.example.foodplanner.models.RandomMeal;

import java.util.List;

public interface SavePresenterInterface {



       public void getMealsByID(String id);
       void delete (List<RandomMeal> meal);



}

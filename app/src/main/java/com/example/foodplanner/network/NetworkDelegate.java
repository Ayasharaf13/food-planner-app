package com.example.foodplanner.network;

import com.example.foodplanner.models.RandomMeal;

import java.util.List;

public interface NetworkDelegate {

     void OnSuccessResult (List<RandomMeal> listOfMeals );
     void OnFailureResult ( String errorMass);

}

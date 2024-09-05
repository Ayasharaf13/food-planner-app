package com.example.foodplanner.network;

import com.example.foodplanner.models.RandomMeal;

import java.util.List;

public interface NetworkDelegate {

    public void OnSuccessResult (List<RandomMeal> listOfMeals );
    public void OnFailureResult ( String errorMass);
}

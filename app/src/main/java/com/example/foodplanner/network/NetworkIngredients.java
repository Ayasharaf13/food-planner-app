package com.example.foodplanner.network;

import com.example.foodplanner.models.Ingredients;
import com.example.foodplanner.models.RandomMeal;

import java.util.List;

public interface NetworkIngredients {

    void OnSuccessResultIngredients (List<Ingredients> listOfMeals );
    void OnFailureResult ( String errorMass);
}
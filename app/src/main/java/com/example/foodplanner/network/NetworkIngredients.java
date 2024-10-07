package com.example.foodplanner.network;

import com.example.foodplanner.models.Ingredients;
import com.example.foodplanner.models.RandomMeal;

import java.util.List;

public interface NetworkIngredients {

<<<<<<< HEAD
    void OnSuccessResultIngredients (List<Ingredients> listOfMeals );
=======
    void OnSuccessResult (List<Ingredients> listOfMeals );
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
    void OnFailureResult ( String errorMass);
}

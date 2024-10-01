package com.example.foodplanner.search.view;

import com.example.foodplanner.models.MyResponseForRandomMeal;
import com.example.foodplanner.models.RandomMeal;

import java.util.List;

public interface MealCategoryView {

    void showMealCategory(List<RandomMeal> meals);
}

package com.example.foodplanner.save.view;

import androidx.lifecycle.LiveData;

import com.example.foodplanner.models.RandomMeal;

import java.util.List;

public interface SaveViewInterface {



    public void showMealSaved(LiveData<List<RandomMeal>> meals) ;







}

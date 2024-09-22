package com.example.foodplanner.db;

import androidx.lifecycle.LiveData;

import com.example.foodplanner.models.RandomMeal;

import java.util.List;

public interface LocalSource {

    public LiveData<List<RandomMeal>> getAllSavedData();
<<<<<<< HEAD
    public void saveMeal(List<RandomMeal> meal);
    public void deleteMeal (List<RandomMeal> meal );
=======
    public void saveMeal(RandomMeal meal);
    public void deleteMeal (RandomMeal meal );
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9


}

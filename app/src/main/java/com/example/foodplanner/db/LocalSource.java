package com.example.foodplanner.db;

import androidx.lifecycle.LiveData;

import com.example.foodplanner.models.RandomMeal;

import java.util.List;

public interface LocalSource {

    public LiveData<List<RandomMeal>> getAllSavedData();
<<<<<<< HEAD
    public void saveMeal(List<RandomMeal> meal);
    public void deleteMeal (List<RandomMeal> meal );
    LiveData<List<RandomMeal>>  searchById(String id);
=======
<<<<<<< HEAD
    public void saveMeal(List<RandomMeal> meal);
    public void deleteMeal (List<RandomMeal> meal );
    LiveData<List<RandomMeal>>  searchById(String id);
=======
<<<<<<< HEAD
    public void saveMeal(List<RandomMeal> meal);
    public void deleteMeal (List<RandomMeal> meal );
    LiveData<List<RandomMeal>>  searchById(String id);
=======
<<<<<<< HEAD
    public void saveMeal(List<RandomMeal> meal);
    public void deleteMeal (List<RandomMeal> meal );
=======
    public void saveMeal(RandomMeal meal);
    public void deleteMeal (RandomMeal meal );
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6


}

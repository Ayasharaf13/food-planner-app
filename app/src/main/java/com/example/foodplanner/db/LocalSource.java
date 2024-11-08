package com.example.foodplanner.db;

import androidx.lifecycle.LiveData;

import com.example.foodplanner.models.Day;
import com.example.foodplanner.models.RandomMeal;

import java.util.List;

public interface LocalSource {

    public LiveData<List<RandomMeal>> getAllSavedData();
    public void saveMeal(List<RandomMeal> meal);
    public void deleteMeal (List<RandomMeal> meal );
    LiveData<List<RandomMeal>>  searchById(String id);




    public LiveData<List<RandomMeal>> getAllSavedDataPlanner();

    LiveData<List<RandomMeal>>  searchByIdPlanner(String id);

    void saveDays(List<Day> days);

    void deleteRepeatedData ();

    LiveData<List<RandomMeal>> getAllMealsPlannerBySelectedDay(int id);



}

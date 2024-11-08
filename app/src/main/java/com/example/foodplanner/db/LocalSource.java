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
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b48bd45d26781cdb878e9e8b47ee3307893594f3

    void saveDays(List<Day> days);

    void deleteRepeatedData ();

    LiveData<List<RandomMeal>> getAllMealsPlannerBySelectedDay(int id);

<<<<<<< HEAD
=======
=======
>>>>>>> eca1561c37458cd3dcb6567e08125bd49145daf2
>>>>>>> b48bd45d26781cdb878e9e8b47ee3307893594f3


}

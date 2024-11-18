package com.example.foodplanner.save.presenter;

import androidx.lifecycle.LiveData;

import com.example.foodplanner.models.RandomMeal;

import java.util.List;

public interface SavePresenterInterface {



    public void getMealsByID(String id);
    void delete (List<RandomMeal> meal);
    LiveData<List<RandomMeal>> searchById(String id);
<<<<<<< HEAD
    LiveData<List<RandomMeal>> getAllSavePlannerBySelectedDay(int id);
=======
<<<<<<< HEAD
    LiveData<List<RandomMeal>> getAllSavePlannerBySelectedDay(int id);
=======
<<<<<<< HEAD
    LiveData<List<RandomMeal>> getAllSavePlannerBySelectedDay(int id);
=======

>>>>>>> eca1561c37458cd3dcb6567e08125bd49145daf2
>>>>>>> b48bd45d26781cdb878e9e8b47ee3307893594f3

>>>>>>> 0d9ef6d7aa17e8c1afc0e5627dc28cab6e65f3b9

    LiveData<List<RandomMeal>> getAllSaveBySelectedDay(int id);
}

package com.example.foodplanner.db;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.foodplanner.models.RandomMeal;

import org.jetbrains.annotations.NotNull;

import java.util.List;


@Dao
public interface FoodDAO {
//@Query("SELECT * FROM events WHERE id=:id ")

    @Query("SELECT * FROM Meals_table WHERE isSave = 1")
    LiveData<List<RandomMeal>> getAllMealsSaved ();

    @Query("SELECT * FROM Meals_table WHERE idMeal=:id AND isSave =1")
    LiveData<List<RandomMeal>> getAllMealsSavedById (String id);



    @Insert(onConflict = OnConflictStrategy.REPLACE)
    @NotNull
    void  insertMeal(List<RandomMeal> meal);

    @Delete
    void deleteMeal (List<RandomMeal>  meal);




    @Query("SELECT * FROM Meals_table WHERE isPlanner =1")
    LiveData<List<RandomMeal>> getAllMealsSavedPlanner ();

    @Query("SELECT * FROM Meals_table WHERE idMeal=:id AND isPlanner =1")
    LiveData<List<RandomMeal>> getAllMealsSavedByIdPlanner (String id);





}



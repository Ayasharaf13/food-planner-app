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

    @Query("SELECT * FROM Meals_table")
    LiveData<List<RandomMeal>> getAllMealsSaved ();

    @Query("SELECT * FROM Meals_table WHERE idMeal=:id")
    LiveData<List<RandomMeal>> getAllMealsSavedById (String id);



    @Insert(onConflict = OnConflictStrategy.REPLACE)
    @NotNull
    void  insertMeal(List<RandomMeal> meal);

    @Delete
    void deleteMeal (List<RandomMeal>  meal);


}



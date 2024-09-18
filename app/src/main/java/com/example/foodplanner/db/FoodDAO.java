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

    @Query("SELECT * FROM Meals_table")
    LiveData<List<RandomMeal>> getAllMealsSaved ();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    @NotNull
    Long insertMeal(RandomMeal meals);

    @Delete
    void deleteMeal (RandomMeal   meals);


}



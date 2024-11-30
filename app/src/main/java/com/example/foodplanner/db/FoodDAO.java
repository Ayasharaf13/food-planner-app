package com.example.foodplanner.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.foodplanner.models.Day;
import com.example.foodplanner.models.RandomMeal;

import org.jetbrains.annotations.NotNull;

import java.util.List;


@Dao
public interface FoodDAO {
//@Query("SELECT * FROM events WHERE id=:id ")

<<<<<<< HEAD
    @Query("SELECT * FROM Meals_table WHERE isSave = 1 AND day_id=:id ")
    LiveData<List<RandomMeal>> getAllMealsSaved (int id);
=======
<<<<<<< HEAD
    @Query("SELECT * FROM Meals_table WHERE isSave = 1 AND day_id=:id ")
    LiveData<List<RandomMeal>> getAllMealsSaved (int id);
=======
    @Query("SELECT * FROM Meals_table WHERE isSave = 1")
    LiveData<List<RandomMeal>> getAllMealsSaved ();
>>>>>>> 0d9ef6d7aa17e8c1afc0e5627dc28cab6e65f3b9
>>>>>>> 0addf75370e7c58045e03d29d4f1ba2dc50defe8

    @Query("SELECT * FROM Meals_table WHERE idMeal=:id AND isSave =1")
    LiveData<List<RandomMeal>> getAllMealsSavedById (String id);


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    @NotNull
    void  insertMeal(List<RandomMeal> meal);

    @Delete
    void deleteMeal (List<RandomMeal>  meal);
<<<<<<< HEAD


    @Query("SELECT * FROM Meals_table WHERE isPlanner =1")
    LiveData<List<RandomMeal>> getAllMealsSavedPlanner ();


=======

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b48bd45d26781cdb878e9e8b47ee3307893594f3
>>>>>>> 0d9ef6d7aa17e8c1afc0e5627dc28cab6e65f3b9

    @Query("SELECT * FROM Meals_table WHERE isPlanner =1")
    LiveData<List<RandomMeal>> getAllMealsSavedPlanner ();


<<<<<<< HEAD
=======

>>>>>>> 0d9ef6d7aa17e8c1afc0e5627dc28cab6e65f3b9
>>>>>>> 0addf75370e7c58045e03d29d4f1ba2dc50defe8
    @Query("SELECT * FROM Meals_table WHERE idMeal=:id AND isPlanner =1")
    LiveData<List<RandomMeal>> getAllMealsSavedByIdPlanner (String id);

    @Query("SELECT * FROM Meals_table WHERE day_id=:id AND isPlanner =1")
    LiveData<List<RandomMeal>> getAllMealsSavedPlannerBySelectDay (int id);


<<<<<<< HEAD
    @Query("DELETE FROM DAY_TABLE WHERE day_id Not IN (" +
=======
<<<<<<< HEAD
    @Query("DELETE FROM DAY_TABLE WHERE day_id Not IN (" +
=======
 @Query("DELETE FROM DAY_TABLE WHERE day_id Not IN (" +
>>>>>>> 0d9ef6d7aa17e8c1afc0e5627dc28cab6e65f3b9
>>>>>>> 0addf75370e7c58045e03d29d4f1ba2dc50defe8
         "SELECT MIN (day_id) FROM day_table GROUP BY dayName"+
         ")")
       void deleteRepeatedWeeks();


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    @NotNull
    void  insertDays(List<Day> days);
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======



    @Query("SELECT * FROM Meals_table WHERE isPlanner =1")
    LiveData<List<RandomMeal>> getAllMealsSavedPlanner ();

    @Query("SELECT * FROM Meals_table WHERE idMeal=:id AND isPlanner =1")
    LiveData<List<RandomMeal>> getAllMealsSavedByIdPlanner (String id);



>>>>>>> eca1561c37458cd3dcb6567e08125bd49145daf2
>>>>>>> b48bd45d26781cdb878e9e8b47ee3307893594f3
>>>>>>> 0d9ef6d7aa17e8c1afc0e5627dc28cab6e65f3b9
>>>>>>> 0addf75370e7c58045e03d29d4f1ba2dc50defe8


}



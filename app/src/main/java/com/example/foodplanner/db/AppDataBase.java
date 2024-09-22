package com.example.foodplanner.db;

<<<<<<< HEAD
import android.content.Context;
=======

import android.content.Context;

>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

<<<<<<< HEAD

=======
import com.example.foodplanner.models.MealDAO;
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9
import com.example.foodplanner.models.RandomMeal;

@Database(entities = {RandomMeal.class},version = 1)
abstract class AppDataBase extends RoomDatabase {


<<<<<<< HEAD
    abstract FoodDAO getMealDao ();
=======
    abstract MealDAO getMealDao ();
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9

    private static volatile AppDataBase INSTANCE;

    public static AppDataBase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (AppDataBase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    AppDataBase.class, "Meals_table")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }

}

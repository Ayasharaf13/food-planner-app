package com.example.foodplanner.db;

<<<<<<< HEAD
import android.content.Context;
=======
<<<<<<< HEAD
import android.content.Context;
=======
<<<<<<< HEAD
import android.content.Context;
=======
<<<<<<< HEAD
import android.content.Context;
=======

import android.content.Context;

>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
import com.example.foodplanner.models.MealDAO;
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
import com.example.foodplanner.models.RandomMeal;

@Database(entities = {RandomMeal.class},version = 1)
abstract class AppDataBase extends RoomDatabase {


<<<<<<< HEAD
    abstract FoodDAO getMealDao ();
=======
<<<<<<< HEAD
    abstract FoodDAO getMealDao ();
=======
<<<<<<< HEAD
    abstract FoodDAO getMealDao ();
=======
<<<<<<< HEAD
    abstract FoodDAO getMealDao ();
=======
    abstract MealDAO getMealDao ();
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6

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

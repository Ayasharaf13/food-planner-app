package com.example.foodplanner.db;

import android.content.Context;
<<<<<<< HEAD

import androidx.annotation.NonNull;
=======
>>>>>>> eca1561c37458cd3dcb6567e08125bd49145daf2
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

<<<<<<< HEAD
import com.example.foodplanner.models.Day;
import com.example.foodplanner.models.RandomMeal;

// .fallbackToDestructiveMigration()

@Database(entities = {RandomMeal.class, Day.class},version = 7,exportSchema = true)
abstract class AppDataBase extends RoomDatabase {


    abstract FoodDAO getMealDao();
=======
import com.example.foodplanner.models.RandomMeal;

@Database(entities = {RandomMeal.class},version = 5)
abstract class AppDataBase extends RoomDatabase {


    abstract FoodDAO getMealDao ();
>>>>>>> eca1561c37458cd3dcb6567e08125bd49145daf2

    private static volatile AppDataBase INSTANCE;


    public static AppDataBase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (AppDataBase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    AppDataBase.class, "Meals_DB")
<<<<<<< HEAD
                            .addMigrations(MIGRATION_5_6,MIGRATION_6_7)

=======
                            .fallbackToDestructiveMigration()
>>>>>>> eca1561c37458cd3dcb6567e08125bd49145daf2
                            .build();
                }
            }
        }
        return INSTANCE;

    }
    // Migration object to handle schema changes from version 5 to 6

    public static final Migration MIGRATION_5_6 = new Migration(5, 6) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            // Step 1: Create the new day_table
            database.execSQL("CREATE TABLE day_table (day_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, dayName TEXT)");

            // Step 2: Alter Meals_table to add day_id (you can use temporary table strategy if needed)
            database.execSQL("ALTER TABLE Meals_table ADD COLUMN day_id INTEGER");
        }
    };

    public static final Migration MIGRATION_6_7 = new Migration(6, 7) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            // Step 1: Create a new temporary Meals_table with the updated schema (including foreign key)
            database.execSQL("CREATE TABLE new_Meals_table (idMeal TEXT PRIMARY KEY NOT NULL, date TEXT, day_id INTEGER, " +
                    "strMeal TEXT, strMealThumb TEXT, strYoutube TEXT, strInstructions TEXT, " +
                    "strCategory TEXT, strArea TEXT, strTags TEXT, " +
                    "strIngredient1 TEXT, strIngredient2 TEXT, strIngredient3 TEXT, strIngredient4 TEXT, " +
                    "strIngredient5 TEXT, strIngredient6 TEXT, strIngredient7 TEXT, strIngredient8 TEXT, " +
                    "strIngredient9 TEXT, strIngredient10 TEXT, strIngredient11 TEXT, strIngredient12 TEXT, " +
                    "strIngredient13 TEXT, strIngredient14 TEXT, strIngredient15 TEXT, strIngredient16 TEXT, " +
                    "strIngredient17 TEXT, strIngredient18 TEXT, strIngredient19 TEXT, strIngredient20 TEXT, " +
                    "FOREIGN KEY(day_id) REFERENCES day_table(day_id) ON DELETE CASCADE ON UPDATE CASCADE)");

            // Step 2: Migrate data from old Meals_table to new Meals_table
            database.execSQL("INSERT INTO new_Meals_table (idMeal, date, day_id, strMeal, strMealThumb, strYoutube, " +
                    "strInstructions, strCategory, strArea, strTags, " +
                    "strIngredient1, strIngredient2, strIngredient3, strIngredient4, " +
                    "strIngredient5, strIngredient6, strIngredient7, strIngredient8, " +
                    "strIngredient9, strIngredient10, strIngredient11, strIngredient12, " +
                    "strIngredient13, strIngredient14, strIngredient15, strIngredient16, " +
                    "strIngredient17, strIngredient18, strIngredient19, strIngredient20) " +
                    "SELECT idMeal, date, NULL AS day_id, strMeal, strMealThumb, strYoutube, strInstructions, " +
                    "strCategory, strArea, strTags, " +
                    "strIngredient1, strIngredient2, strIngredient3, strIngredient4, " +
                    "strIngredient5, strIngredient6, strIngredient7, strIngredient8, " +
                    "strIngredient9, strIngredient10, strIngredient11, strIngredient12, " +
                    "strIngredient13, strIngredient14, strIngredient15, strIngredient16, " +
                    "strIngredient17, strIngredient18, strIngredient19, strIngredient20 " +
                    "FROM Meals_table;");

            // Step 3: Drop the old Meals_table
            database.execSQL("DROP TABLE Meals_table");

            // Step 4: Rename new_Meals_table to Meals_table
            database.execSQL("ALTER TABLE new_Meals_table RENAME TO Meals_table");
        }
    };



}

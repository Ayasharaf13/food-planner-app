package com.example.foodplanner.save.presenter;
<<<<<<< HEAD

import androidx.lifecycle.LiveData;

=======
import androidx.lifecycle.LiveData;
>>>>>>> 0addf75370e7c58045e03d29d4f1ba2dc50defe8
import com.example.foodplanner.models.RandomMeal;
import java.util.List;

public interface SavePresenterInterface {
<<<<<<< HEAD



=======
>>>>>>> 0addf75370e7c58045e03d29d4f1ba2dc50defe8
    public void getMealsByID(String id);
    void delete (List<RandomMeal> meal);
    LiveData<List<RandomMeal>> searchById(String id);
    LiveData<List<RandomMeal>> getAllSavePlannerBySelectedDay(int id);
<<<<<<< HEAD

=======
    LiveData<List<RandomMeal>> getAllSavePlannerBySelectedDay(int id);
    LiveData<List<RandomMeal>> getAllSavePlannerBySelectedDay(int id);
>>>>>>> 0addf75370e7c58045e03d29d4f1ba2dc50defe8
    LiveData<List<RandomMeal>> getAllSaveBySelectedDay(int id);
}

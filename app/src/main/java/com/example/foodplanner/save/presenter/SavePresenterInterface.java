package com.example.foodplanner.save.presenter;
import androidx.lifecycle.LiveData;
import com.example.foodplanner.models.RandomMeal;
import java.util.List;

public interface SavePresenterInterface {
    public void getMealsByID(String id);
    void delete (List<RandomMeal> meal);
    LiveData<List<RandomMeal>> searchById(String id);
    LiveData<List<RandomMeal>> getAllSavePlannerBySelectedDay(int id);
    LiveData<List<RandomMeal>> getAllSavePlannerBySelectedDay(int id);
    LiveData<List<RandomMeal>> getAllSavePlannerBySelectedDay(int id);
    LiveData<List<RandomMeal>> getAllSaveBySelectedDay(int id);
}

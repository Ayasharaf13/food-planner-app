package com.example.foodplanner.db;

import android.content.Context;

import androidx.lifecycle.LiveData;

import com.example.foodplanner.models.Day;
import com.example.foodplanner.models.RandomMeal;

import java.util.List;

public class ConcreteLocalSource implements LocalSource{

    Context context;
    LiveData<List<RandomMeal>> savelist;
    FoodDAO mealDao;



    private static ConcreteLocalSource localSource = null;



    private ConcreteLocalSource (Context context){

        this.context = context;
        AppDataBase db = AppDataBase.getInstance(context.getApplicationContext());
        mealDao = db.getMealDao();
    }

    public static synchronized  ConcreteLocalSource getInstance(Context context){
        if(localSource == null){
            localSource =  new ConcreteLocalSource(context);
        }
        return localSource;
    }


    @Override
<<<<<<< HEAD
    public LiveData< List<RandomMeal>> getAllSavedData(int id) {
        savelist = mealDao.getAllMealsSaved(id);
=======
<<<<<<< HEAD
    public LiveData< List<RandomMeal>> getAllSavedData(int id) {
        savelist = mealDao.getAllMealsSaved(id);
=======
    public LiveData< List<RandomMeal>> getAllSavedData() {
        savelist = mealDao.getAllMealsSaved();
>>>>>>> 0d9ef6d7aa17e8c1afc0e5627dc28cab6e65f3b9
>>>>>>> 0addf75370e7c58045e03d29d4f1ba2dc50defe8
        return savelist;
    }

    @Override
    public void saveMeal(List<RandomMeal> meal) {

        new Thread(new Runnable() {
            @Override
            public void run() {

                mealDao.insertMeal(meal);
            }
        }).start();

    }

    @Override
    public void deleteMeal(List<RandomMeal> meal) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                mealDao.deleteMeal(meal);
            }
        }).start();

    }

    @Override
    public LiveData<List<RandomMeal>> searchById(String id) {

        return mealDao.getAllMealsSavedById(id);

    }

    @Override
    public LiveData<List<RandomMeal>> getAllSavedDataPlanner() {
       return mealDao.getAllMealsSavedPlanner();
    }


    @Override
    public LiveData<List<RandomMeal>> searchByIdPlanner(String id) {
        return mealDao.getAllMealsSavedByIdPlanner(id);
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b48bd45d26781cdb878e9e8b47ee3307893594f3
>>>>>>> 0d9ef6d7aa17e8c1afc0e5627dc28cab6e65f3b9
>>>>>>> 0addf75370e7c58045e03d29d4f1ba2dc50defe8
    @Override
    public void saveDays(List<Day> days) {
        new Thread(new Runnable() {
            @Override
            public void run() {

                mealDao.insertDays(days);
            }
        }).start();

    }

    @Override
    public void deleteRepeatedData() {

       // mealDao.deleteRepeatedWeeks();
        new Thread(new Runnable() {
            @Override
            public void run() {
                mealDao.deleteRepeatedWeeks();
            }
        }).start();
    }


    @Override
    public LiveData<List<RandomMeal>> getAllMealsPlannerBySelectedDay(int id) {
        return mealDao.getAllMealsSavedPlannerBySelectDay(id);
    }



<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> eca1561c37458cd3dcb6567e08125bd49145daf2
>>>>>>> b48bd45d26781cdb878e9e8b47ee3307893594f3
>>>>>>> 0d9ef6d7aa17e8c1afc0e5627dc28cab6e65f3b9
>>>>>>> 0addf75370e7c58045e03d29d4f1ba2dc50defe8
}

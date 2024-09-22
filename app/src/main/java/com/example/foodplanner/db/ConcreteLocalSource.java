package com.example.foodplanner.db;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.LiveData;

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
    public LiveData< List<RandomMeal>> getAllSavedData() {
    savelist = mealDao.getAllMealsSaved();
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
}

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
<<<<<<< HEAD
    }

    @Override
=======
<<<<<<< HEAD
    }

    @Override
=======
<<<<<<< HEAD
    }

    @Override
=======
<<<<<<< HEAD
    }

    @Override
=======
<<<<<<< HEAD
=======
    }

    @Override
<<<<<<< HEAD
    public void saveMeal(List<RandomMeal> meal) {
=======
    public void saveMeal(RandomMeal meal) {
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9

       new Thread(new Runnable() {
           @Override
           public void run() {

               mealDao.insertMeal(meal);
           }
       }).start();

    }

    @Override
<<<<<<< HEAD
    public void deleteMeal(List<RandomMeal> meal) {
=======
    public void deleteMeal(RandomMeal meal) {
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9

        new Thread(new Runnable() {
            @Override
            public void run() {
                mealDao.deleteMeal(meal);
            }
        }).start();

>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
    }

    @Override
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
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

}

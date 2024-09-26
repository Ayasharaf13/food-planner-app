package com.example.foodplanner.save.presenter;

/*
 RepositoryInterface repo ;
    HomeViewInterface homeViewRandomMeal;


    public HomePresenter (RepositoryInterface repo , HomeViewInterface homeViewRandomMeal){

        this.repo =repo;
        this. homeViewRandomMeal =homeViewRandomMeal;

    }
 */

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
import android.util.Log;

import androidx.lifecycle.LiveData;

<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
import android.util.Log;

>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.RepositoryInterface;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.network.NetworkDelegate;
import com.example.foodplanner.save.view.SaveViewInterface;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.network.NetworkDelegate;
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61

import java.util.List;

public class SavePresenter implements NetworkDelegate ,SavePresenterInterface {


<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
      RepositoryInterface repo ;
      SaveViewInterface saveViewInterface;


    public SavePresenter (RepositoryInterface repo , SaveViewInterface saveViewInterface){
        this.repo =repo;
        this.saveViewInterface =saveViewInterface;

    }

        public void getMealsByID(String id) {
        repo.getMealByIdNetwork(FoodClient.getInstance().getApiService().getMealsById(id),this);
    }

    @Override
    public void delete(List<RandomMeal> meal) {

        repo.deleteMeal(meal);

    }

    @Override
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
    public LiveData<List<RandomMeal>> searchById(String id) {

      return   repo.searchById(id);

    }

    @Override
<<<<<<< HEAD
=======
=======
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
    public void OnSuccessResult(List<RandomMeal> listOfMeals) {
        repo.saveMeal(listOfMeals);
        Log.i("sucess","done sucess save");
        saveViewInterface.showMealSaved(repo.getAllMealFromStorage());
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
    @Override
    public void OnSuccessResult(List<RandomMeal> listOfMeals) {

>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
    }

    @Override
    public void OnFailureResult(String errorMass) {
<<<<<<< HEAD
        Log.i("ErrorSave",errorMass);
=======
<<<<<<< HEAD
        Log.i("ErrorSave",errorMass);
=======
<<<<<<< HEAD
        Log.i("ErrorSave",errorMass);
=======

    }

    @Override
    public void showMealSaved() {
      //  repo.getMealByIdNetwork(FoodClient.getInstance().getApiService().getMealsById(id),this);

    }

    @Override
    public void saveMeal(String id) {

    }

    @Override
    public void deleteMeal(String id) {
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61

    }


<<<<<<< HEAD


=======
<<<<<<< HEAD


=======
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
}

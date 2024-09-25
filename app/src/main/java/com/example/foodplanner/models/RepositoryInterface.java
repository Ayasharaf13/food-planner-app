package com.example.foodplanner.models;

import androidx.lifecycle.LiveData;

import com.example.foodplanner.network.NetworkDelegate;
import com.example.foodplanner.network.NetworkDelegateCategory;

import java.util.List;

import java.util.List;

import retrofit2.Call;


public interface RepositoryInterface {

    void getProductsNetwork(Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate );

     void getSuggestMealsNetwork (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);

    void getMealByIdNetwork (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);

    void getCategories (Call <ResponseCategory> call ,  NetworkDelegateCategory networkDelegate);

    void getMealByCategory (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);

    void saveMeal (List<RandomMeal> meal);


    void deleteMeal(List<RandomMeal> meal);

    LiveData<List<RandomMeal>> getAllMealFromStorage ();

    LiveData<List<RandomMeal>>  searchById(String id);








    void getMealByIdNetwork (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);

<<<<<<< HEAD

    void saveMeal (List<RandomMeal> meal);


    void deleteMeal(List<RandomMeal> meal);

    LiveData<List<RandomMeal>> getAllMealFromStorage ();
=======
<<<<<<< HEAD

    void saveMeal (RandomMeal meal);
    void deleteMeal(RandomMeal meal);
     void getAllMealFromStorage ();
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9




<<<<<<< HEAD
=======
=======
>>>>>>> a9e1adc143fdd02927f2d841ceff456f59aad7bd
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9
}

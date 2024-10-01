package com.example.foodplanner.models;

import androidx.lifecycle.LiveData;

import com.example.foodplanner.network.NetworkDelegate;
import com.example.foodplanner.network.NetworkDelegateCategory;
<<<<<<< HEAD
import com.example.foodplanner.network.NetworkDelegateCountry;
import com.example.foodplanner.network.NetworkIngredients;
=======
<<<<<<< HEAD
import com.example.foodplanner.network.NetworkIngredients;
=======

import java.util.List;
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6

import java.util.List;

import retrofit2.Call;


public interface RepositoryInterface {

    void getProductsNetwork(Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate );
<<<<<<< HEAD

     void getSuggestMealsNetwork (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);

    void getMealByIdNetwork (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);

    void getCategories (Call <ResponseCategory> call ,  NetworkDelegateCategory networkDelegate);

    void getMealByCategory (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);

    void getMealByIngredients (Call<ResponseIngredients> call , NetworkIngredients networkDelegate);

    void getCountriesName (Call<ResponseCountry> call , NetworkDelegateCountry networkDelegate);

    void getMealByCountry (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);

    void  getMealByIngredients (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);

    void saveMeal (List<RandomMeal> meal);

    void deleteMeal(List<RandomMeal> meal);



    LiveData<List<RandomMeal>> getAllMealFromStorage ();

    LiveData<List<RandomMeal>>  searchById(String id);












=======
<<<<<<< HEAD

     void getSuggestMealsNetwork (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6

    void getMealByIdNetwork (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);

    void getCategories (Call <ResponseCategory> call ,  NetworkDelegateCategory networkDelegate);

    void getMealByCategory (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);

    void getMealByIngredients (Call<ResponseIngredients> call , NetworkIngredients networkDelegate);

    void saveMeal (List<RandomMeal> meal);


    void deleteMeal(List<RandomMeal> meal);

    LiveData<List<RandomMeal>> getAllMealFromStorage ();

    LiveData<List<RandomMeal>>  searchById(String id);







=======

     void getSuggestMealsNetwork (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61

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

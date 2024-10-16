package com.example.foodplanner.models;

import androidx.lifecycle.LiveData;

import com.example.foodplanner.network.NetworkDelegate;
import com.example.foodplanner.network.NetworkDelegateCategory;
import com.example.foodplanner.network.NetworkDelegateCountry;
import com.example.foodplanner.network.NetworkIngredients;

import java.util.List;

import retrofit2.Call;


public interface RepositoryInterface {

    void getProductsNetwork(Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate );

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




    void searchByName(Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);

    LiveData<List<RandomMeal>> getAllMealFromStorage ();

    LiveData<List<RandomMeal>>  searchById(String id);



    LiveData<List<RandomMeal>> getAllMealFromStoragePlanner ();

    LiveData<List<RandomMeal>>  searchByIdPlanner(String id);







}

package com.example.foodplanner.models;

import androidx.lifecycle.LiveData;

import com.example.foodplanner.network.NetworkDelegate;

import java.util.List;

import retrofit2.Call;


public interface RepositoryInterface {

    public  void getProductsNetwork(Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate );

    public void getSuggestMealsNetwork (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);

    void getMealByIdNetwork (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);


    void saveMeal (List<RandomMeal> meal);


    void deleteMeal(List<RandomMeal> meal);

    LiveData<List<RandomMeal>> getAllMealFromStorage ();




}

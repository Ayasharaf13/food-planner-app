package com.example.foodplanner.models;

import androidx.lifecycle.LiveData;

import com.example.foodplanner.network.NetworkDelegate;

import java.util.List;

import retrofit2.Call;


public interface RepositoryInterface {

    public  void getProductsNetwork(Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate );

    public void getSuggestMealsNetwork (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);

    void getMealByIdNetwork (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);

<<<<<<< HEAD

    void saveMeal (RandomMeal meal);
    void deleteMeal(RandomMeal meal);
     void getAllMealFromStorage ();




=======
>>>>>>> a9e1adc143fdd02927f2d841ceff456f59aad7bd
}

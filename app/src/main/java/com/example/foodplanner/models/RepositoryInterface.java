package com.example.foodplanner.models;

import com.example.foodplanner.network.NetworkDelegate;

import retrofit2.Call;


public interface RepositoryInterface {

    public  void getProductsNetwork(Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate );

    public void getSuggestMealsNetwork (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);

}

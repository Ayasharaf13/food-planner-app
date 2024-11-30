package com.example.foodplanner.network;

import com.example.foodplanner.models.MyResponseForRandomMeal;
import com.example.foodplanner.models.ResponseCategory;
import com.example.foodplanner.models.ResponseCountry;
import com.example.foodplanner.models.ResponseIngredients;

import retrofit2.Call;


public interface RemoteSource {

// <T> void makeApiCall(Call <T> call  , NetworkDelegate networkDelegate);




    void makeApiCall(Call<MyResponseForRandomMeal> call, NetworkDelegate networkDelegate);
    void makeApiCallCategory(Call<ResponseCategory> call,  NetworkDelegateCategory networkDelegate);
    void makeApiCallIngredients(Call<ResponseIngredients> call, NetworkIngredients networkDelegate);
    void makeApiCallCountry(Call<ResponseCountry> call, NetworkDelegateCountry networkDelegate);





}

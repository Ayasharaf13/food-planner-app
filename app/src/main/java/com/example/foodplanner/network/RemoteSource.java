package com.example.foodplanner.network;

import com.example.foodplanner.models.MyResponseForRandomMeal;
import com.example.foodplanner.models.ResponseCategory;

import retrofit2.Call;


public interface RemoteSource {

// <T> void makeApiCall(Call <T> call  , NetworkDelegate networkDelegate);




   public void makeApiCall(Call<MyResponseForRandomMeal> call, NetworkDelegate networkDelegate);
   public void makeApiCallCategory(Call<ResponseCategory> call,  NetworkDelegateCategory networkDelegate);



}

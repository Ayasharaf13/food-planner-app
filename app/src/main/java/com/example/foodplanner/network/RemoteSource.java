package com.example.foodplanner.network;

import com.example.foodplanner.models.MyResponseForRandomMeal;

import retrofit2.Call;

public interface RemoteSource {

   //public void  enqueueCall(NetworkDelegate networkDelegate );
   public void makeApiCall(Call<MyResponseForRandomMeal> call, NetworkDelegate networkDelegate);


}

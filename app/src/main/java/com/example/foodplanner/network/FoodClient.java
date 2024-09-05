package com.example.foodplanner.network;


import android.util.Log;

import androidx.annotation.NonNull;

import com.example.foodplanner.models.MyResponseForRandomMeal;
import com.example.foodplanner.models.RandomMeal;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FoodClient implements RemoteSource {




    private static RemoteSource remoteSource = null;

    private FoodClient() {
        // Private constructor to prevent instantiation from outside
    }

    public static FoodClient getInstance() {
        if (remoteSource == null) {
            remoteSource = new FoodClient();
        }
        return (FoodClient) remoteSource;
    }

    private  FoodService apiService;

    public synchronized FoodService getApiService () {

        if (apiService == null) {
             apiService = RetrofitClient.getRetrofitInstance().create(FoodService.class);

        }
            return apiService;


    }

    @Override
    public void makeApiCall(Call<MyResponseForRandomMeal> call, NetworkDelegate networkDelegate) {

         call.enqueue(new Callback<MyResponseForRandomMeal>() {
        @Override
        public void onResponse(@NonNull Call<MyResponseForRandomMeal> call, @NonNull Response<MyResponseForRandomMeal> response) {
            MyResponseForRandomMeal responseBody= response.body();
            if (response.isSuccessful() && responseBody != null) {
                ArrayList<RandomMeal> meals = responseBody.meals;
               networkDelegate.OnSuccessResult(meals);
            } else {
                Log.i("FoodPlanner", "Response failed: " + response.message());
            }
        }

        @Override
        public void onFailure(@NonNull Call<MyResponseForRandomMeal> call, @NonNull Throwable t) {
            Log.e("FoodPlanner", "Request failed", t);
        }
    });
        //makeApiCall(getApiService().getRandomMeals(), networkDelegate);
       // makeApiCall(getApiService().getSuggestionMeals("s"), networkDelegate);

    }



  /*  @Override
    public void enqueueCall(NetworkDelegate networkDelegate) {

         Call<MyResponseForRandomMeal > call = getApiService().getRandomMeals();
        Call<MyResponseForRandomMeal > call2= getApiService().getSuggestionMeals("s");

          call.enqueue(new Callback<MyResponseForRandomMeal>() {
              @Override
              public void onResponse(@NonNull Call<MyResponseForRandomMeal> call, @NonNull Response<MyResponseForRandomMeal> response) {
                     MyResponseForRandomMeal responseBody= response.body();
                 if(response.isSuccessful() && (responseBody != null)){
                     Log.i("bodyyyyy", "Response: ${responseBody.toString()}"); // Log the entire response body

                     ArrayList<RandomMeal> listOfRandomMeal = responseBody.meals;

                       networkDelegate.OnSuccessResult(listOfRandomMeal);
                      Log.i("FoodPlanner:", String.valueOf(listOfRandomMeal.size()));

                 }else{
                     Log.i("FoodPlanner", "Response failed: " + response.message());
                 }
              }

              @Override
              public void onFailure(@NonNull Call<MyResponseForRandomMeal> call, Throwable errorMSG) {
                   networkDelegate.OnFailureResult(errorMSG.getMessage());
                 // Log.i("FoodPlanner:",errorMSG.toString());

              }
          });
    }*/

}




package com.example.foodplanner.network;


import android.util.Log;

import androidx.annotation.NonNull;

import com.example.foodplanner.models.Category;
import com.example.foodplanner.models.CountryNames;
import com.example.foodplanner.models.Ingredients;
import com.example.foodplanner.models.MyResponseForRandomMeal;
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.ResponseCategory;
import com.example.foodplanner.models.ResponseCountry;
import com.example.foodplanner.models.ResponseIngredients;

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


    }



    @Override
    public void makeApiCallCategory(Call<ResponseCategory> call,  NetworkDelegateCategory networkDelegate) {

        call.enqueue(new Callback<ResponseCategory>() {
            @Override
            public void onResponse(@NonNull Call<ResponseCategory> call, @NonNull Response<ResponseCategory> response) {
                ResponseCategory   responseBody = response.body();

                if(response.isSuccessful() && responseBody !=null){
                    ArrayList<Category> categories =responseBody.categories;
                    networkDelegate.OnSuccessResultCategory(categories);
                }else {
                    Log.i("FoodPlanner", "Response failed: Category " + response.message());
                }
            }

            @Override
            public void onFailure(Call<ResponseCategory> call, Throwable t) {

                Log.e("FoodPlanner", "Request failed Category", t);
            }
        });


    }

    @Override
    public void makeApiCallIngredients(Call<ResponseIngredients> call, NetworkIngredients networkDelegate) {

        call.enqueue(new Callback<ResponseIngredients>() {
            @Override
            public void onResponse(@NonNull Call<ResponseIngredients> call, @NonNull Response<ResponseIngredients> response) {
                ResponseIngredients responseBody = response.body();

                if(response.isSuccessful() && responseBody !=null){
                    ArrayList<Ingredients> ingredients =responseBody.meals;
                    networkDelegate.OnSuccessResultIngredients(ingredients);
                }else {
                    Log.i("FoodPlanner", "Response failed: Category " + response.message());

                }

            }

            @Override
            public void onFailure(Call<ResponseIngredients> call, Throwable t) {

            }
        });

    }

    @Override
    public void makeApiCallCountry(Call<ResponseCountry> call, NetworkDelegateCountry networkDelegate) {

        call.enqueue(new Callback<ResponseCountry>() {
            @Override
            public void onResponse(@NonNull Call<ResponseCountry> call, @NonNull Response<ResponseCountry> response) {
                ResponseCountry responseBody = response.body();
                if(response.isSuccessful() && responseBody !=null){
                    ArrayList<CountryNames> countriesNames =responseBody.meals;
                    networkDelegate.OnSuccessResultCountries(countriesNames);
                    Log.i("sucesssscountry","sucess");
                }else {
                    Log.i("FoodPlannerCountry", "Response failed: Category " + response.message());

                }
            }

            @Override
            public void onFailure(Call<ResponseCountry> call, Throwable t) {

                Log.i("countryyyyFail",t.getMessage());

            }
        });

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





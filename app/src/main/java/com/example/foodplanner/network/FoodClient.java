package com.example.foodplanner.network;


import android.util.Log;

import androidx.annotation.NonNull;

import com.example.foodplanner.models.Category;
<<<<<<< HEAD
import com.example.foodplanner.models.CountryNames;
=======
<<<<<<< HEAD
import com.example.foodplanner.models.CountryNames;
=======
<<<<<<< HEAD
import com.example.foodplanner.models.CountryNames;
=======
<<<<<<< HEAD
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
import com.example.foodplanner.models.Ingredients;
import com.example.foodplanner.models.MyResponseForRandomMeal;
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.ResponseCategory;
<<<<<<< HEAD
import com.example.foodplanner.models.ResponseCountry;
import com.example.foodplanner.models.ResponseIngredients;
=======
<<<<<<< HEAD
import com.example.foodplanner.models.ResponseCountry;
import com.example.foodplanner.models.ResponseIngredients;
=======
<<<<<<< HEAD
import com.example.foodplanner.models.ResponseCountry;
import com.example.foodplanner.models.ResponseIngredients;
=======
import com.example.foodplanner.models.ResponseIngredients;
=======
import com.example.foodplanner.models.MyResponseForRandomMeal;
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.ResponseCategory;
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e

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

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e

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

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61

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

>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e

    }

    @Override
    public void makeApiCallIngredients(Call<ResponseIngredients> call, NetworkIngredients networkDelegate) {

        call.enqueue(new Callback<ResponseIngredients>() {
            @Override
            public void onResponse(@NonNull Call<ResponseIngredients> call, @NonNull Response<ResponseIngredients> response) {
                ResponseIngredients responseBody = response.body();

                if(response.isSuccessful() && responseBody !=null){
                    ArrayList<Ingredients> ingredients =responseBody.meals;
<<<<<<< HEAD
                    networkDelegate.OnSuccessResultIngredients(ingredients);
=======
                    networkDelegate.OnSuccessResult(ingredients);
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
                }else {
                    Log.i("FoodPlanner", "Response failed: Category " + response.message());

                }

            }

            @Override
            public void onFailure(Call<ResponseIngredients> call, Throwable t) {

            }
        });

    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
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

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e




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





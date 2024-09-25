package com.example.foodplanner.network;

import com.example.foodplanner.models.MyResponseForRandomMeal;
import com.example.foodplanner.models.ResponseCategory;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FoodService {

    @GET("api/json/v1/1/random.php")
     Call<MyResponseForRandomMeal> getRandomMeals ();

    @GET("api/json/v1/1/search.php")
   Call<MyResponseForRandomMeal> getSuggestionMeals(@Query("f") String  letter );
    @GET("api/json/v1/1/lookup.php")
   Call<MyResponseForRandomMeal> getMealsById(@Query("i") String  letter );

     @GET("api/json/v1/1/categories.php")
      Call<ResponseCategory> getCategory();


    @GET("api/json/v1/1/filter.php")
    Call <MyResponseForRandomMeal> getMealsByCategory(@Query("c") String category);

    



}

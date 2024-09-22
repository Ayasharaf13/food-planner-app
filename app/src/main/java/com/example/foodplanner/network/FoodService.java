package com.example.foodplanner.network;

import com.example.foodplanner.models.MyResponseForRandomMeal;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FoodService {

    @GET("api/json/v1/1/random.php")
     public Call<MyResponseForRandomMeal> getRandomMeals ();

    @GET("api/json/v1/1/search.php")
    public Call<MyResponseForRandomMeal> getSuggestionMeals(@Query("f") String  letter );
    @GET("api/json/v1/1/lookup.php")
    public Call<MyResponseForRandomMeal> getMealsById(@Query("i") String  letter );

    



}

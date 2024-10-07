package com.example.foodplanner.network;

import com.example.foodplanner.models.CountryNames;
import com.example.foodplanner.models.MyResponseForRandomMeal;
import com.example.foodplanner.models.ResponseCategory;
import com.example.foodplanner.models.ResponseCountry;
import com.example.foodplanner.models.ResponseIngredients;

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


    @GET("api/json/v1/1/list.php?i=list")
    Call <ResponseIngredients> getMealsByIngredients ();


    @GET ("api/json/v1/1/list.php?a=list")
    Call <ResponseCountry> getCountries ();

    //www.themealdb.com/api/json/v1/1/filter.php?a=Canadian

    @GET("api/json/v1/1/filter.php")
    Call <MyResponseForRandomMeal> getMealsByCountry(@Query("a") String country);

    //www.themealdb.com/api/json/v1/1/filter.php?i=chicken_breast

    @GET ("api/json/v1/1/filter.php")
    Call <MyResponseForRandomMeal> getMealsByIngredients (@Query("i") String mealName);

    //www.themealdb.com/api/json/v1/1/search.php?s=Arrabiata

    @GET("api/json/v1/1/search.php")
    Call <MyResponseForRandomMeal> getMealsBySearch(@Query("s") String mealName);



}

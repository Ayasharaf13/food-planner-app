package com.example.foodplanner.network;

import com.example.foodplanner.models.MyResponseForRandomMeal;
import com.example.foodplanner.models.ResponseCategory;
<<<<<<< HEAD
import com.example.foodplanner.models.ResponseIngredients;
=======
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FoodService {

    @GET("api/json/v1/1/random.php")
     Call<MyResponseForRandomMeal> getRandomMeals ();

    @GET("api/json/v1/1/search.php")
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
   Call<MyResponseForRandomMeal> getSuggestionMeals(@Query("f") String  letter );
    @GET("api/json/v1/1/lookup.php")
   Call<MyResponseForRandomMeal> getMealsById(@Query("i") String  letter );

     @GET("api/json/v1/1/categories.php")
      Call<ResponseCategory> getCategory();


    @GET("api/json/v1/1/filter.php")
    Call <MyResponseForRandomMeal> getMealsByCategory(@Query("c") String category);
<<<<<<< HEAD


    @GET("api/json/v1/1/list.php?i=list")
    Call <ResponseIngredients> getMealsByIngredients ();
=======
=======
    public Call<MyResponseForRandomMeal> getSuggestionMeals(@Query("f") String  letter );
    @GET("api/json/v1/1/lookup.php")
    public Call<MyResponseForRandomMeal> getMealsById(@Query("i") String  letter );
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61

    



}

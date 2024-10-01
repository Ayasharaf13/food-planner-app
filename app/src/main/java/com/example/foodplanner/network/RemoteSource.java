package com.example.foodplanner.network;

import com.example.foodplanner.models.MyResponseForRandomMeal;
import com.example.foodplanner.models.ResponseCategory;
<<<<<<< HEAD
import com.example.foodplanner.models.ResponseCountry;
import com.example.foodplanner.models.ResponseIngredients;
=======
<<<<<<< HEAD
import com.example.foodplanner.models.ResponseIngredients;
=======
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6

import retrofit2.Call;


public interface RemoteSource {

// <T> void makeApiCall(Call <T> call  , NetworkDelegate networkDelegate);




<<<<<<< HEAD
  void makeApiCall(Call<MyResponseForRandomMeal> call, NetworkDelegate networkDelegate);
    void makeApiCallCategory(Call<ResponseCategory> call,  NetworkDelegateCategory networkDelegate);
  void makeApiCallIngredients(Call<ResponseIngredients> call, NetworkIngredients networkDelegate);
    void makeApiCallCountry(Call<ResponseCountry> call, NetworkDelegateCountry networkDelegate);


=======
   public void makeApiCall(Call<MyResponseForRandomMeal> call, NetworkDelegate networkDelegate);
   public void makeApiCallCategory(Call<ResponseCategory> call,  NetworkDelegateCategory networkDelegate);
<<<<<<< HEAD
   public void makeApiCallIngredients(Call<ResponseIngredients> call, NetworkIngredients networkDelegate);

=======
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6



}

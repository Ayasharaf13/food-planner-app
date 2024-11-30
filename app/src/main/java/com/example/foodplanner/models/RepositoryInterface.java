package com.example.foodplanner.models;

import androidx.lifecycle.LiveData;

import com.example.foodplanner.network.NetworkDelegate;
import com.example.foodplanner.network.NetworkDelegateCategory;
import com.example.foodplanner.network.NetworkDelegateCountry;
import com.example.foodplanner.network.NetworkIngredients;

import java.util.List;

import retrofit2.Call;


public interface RepositoryInterface {

    void getProductsNetwork(Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate );

    void getSuggestMealsNetwork (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);

    void getMealByIdNetwork (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);

    void getCategories (Call <ResponseCategory> call ,  NetworkDelegateCategory networkDelegate);

    void getMealByCategory (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);

    void getMealByIngredients (Call<ResponseIngredients> call , NetworkIngredients networkDelegate);

    void getCountriesName (Call<ResponseCountry> call , NetworkDelegateCountry networkDelegate);

    void getMealByCountry (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);

    void  getMealByIngredients (Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);

    void saveMeal (List<RandomMeal> meal);

    void deleteMeal(List<RandomMeal> meal);




    void searchByName(Call<MyResponseForRandomMeal> call , NetworkDelegate networkDelegate);

    LiveData<List<RandomMeal>> getAllMealFromStorage (int id);

    LiveData<List<RandomMeal>>  searchById(String id);



    LiveData<List<RandomMeal>> getAllMealFromStoragePlanner ();

    LiveData<List<RandomMeal>>  searchByIdPlanner(String id);


    void saveDay (List <Day> days);
    void deleteRepeatedData();

    LiveData<List<RandomMeal>>  getAllMealsSavedPlannerBySelectDay(int id);




<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> eca1561c37458cd3dcb6567e08125bd49145daf2
>>>>>>> b48bd45d26781cdb878e9e8b47ee3307893594f3
>>>>>>> 0d9ef6d7aa17e8c1afc0e5627dc28cab6e65f3b9
>>>>>>> 0addf75370e7c58045e03d29d4f1ba2dc50defe8
}

package com.example.foodplanner.models;

import androidx.lifecycle.LiveData;

import com.example.foodplanner.db.LocalSource;
import com.example.foodplanner.network.NetworkDelegate;
import com.example.foodplanner.network.NetworkDelegateCategory;
import com.example.foodplanner.network.NetworkDelegateCountry;
import com.example.foodplanner.network.NetworkIngredients;
import com.example.foodplanner.network.RemoteSource;

import java.util.List;

import retrofit2.Call;

public class Repository implements  RepositoryInterface{

    RemoteSource remoteSource ;
    LocalSource localSource;

    private Repository(RemoteSource remoteSource, LocalSource localSource) {
        // Constructor logic here
        this.localSource=localSource;
        this.remoteSource=remoteSource;
    }
    private static  Repository repo = null;
    public static synchronized  Repository getInstance(RemoteSource remoteSource, LocalSource localSource) {
        if (repo == null) {
            repo = new Repository(remoteSource, localSource);
        }
        return repo;
    }

    @Override
    public void getProductsNetwork(Call<MyResponseForRandomMeal> call, NetworkDelegate networkDelegate) {

        // remoteSource.enqueueCall(networkDelegate);
        remoteSource.makeApiCall(call,networkDelegate);
    }

    @Override
    public void getSuggestMealsNetwork(Call<MyResponseForRandomMeal> call, NetworkDelegate networkDelegate) {
        remoteSource.makeApiCall(call,networkDelegate);
    }

    @Override
    public void getMealByIdNetwork(Call<MyResponseForRandomMeal> call, NetworkDelegate networkDelegate) {

        remoteSource.makeApiCall(call,networkDelegate);
    }

    @Override
    public void getCategories(Call<ResponseCategory> call,  NetworkDelegateCategory networkDelegate) {
        remoteSource.makeApiCallCategory(call,networkDelegate);
    }

    @Override
    public void getMealByCategory(Call<MyResponseForRandomMeal> call, NetworkDelegate networkDelegate) {

        remoteSource.makeApiCall(call,networkDelegate);

    }

    @Override
    public void getMealByIngredients(Call<ResponseIngredients> call, NetworkIngredients networkDelegate) {

        remoteSource.makeApiCallIngredients(call,networkDelegate);

    }

    @Override
    public void getCountriesName(Call<ResponseCountry> call, NetworkDelegateCountry networkDelegate) {

        remoteSource.makeApiCallCountry(call,networkDelegate);
    }

    @Override
    public void getMealByCountry(Call<MyResponseForRandomMeal> call, NetworkDelegate networkDelegate) {

        remoteSource.makeApiCall(call,networkDelegate);
    }

    @Override
    public void getMealByIngredients(Call<MyResponseForRandomMeal> call, NetworkDelegate networkDelegate) {

        remoteSource.makeApiCall(call,networkDelegate);

    }

    @Override
    public void  saveMeal(List<RandomMeal> meal) {
        localSource.saveMeal(meal);

    }

    @Override
    public void deleteMeal(List<RandomMeal> meal) {
        localSource.deleteMeal(meal);

    }



    @Override
    public void searchByName(Call<MyResponseForRandomMeal> call, NetworkDelegate networkDelegate) {

        remoteSource.makeApiCall(call,networkDelegate);

    }


    @Override
<<<<<<< HEAD
    public LiveData<List<RandomMeal>> getAllMealFromStorage(int id) {
        return localSource.getAllSavedData(id);
=======
<<<<<<< HEAD
    public LiveData<List<RandomMeal>> getAllMealFromStorage(int id) {
        return localSource.getAllSavedData(id);
=======
    public LiveData<List<RandomMeal>> getAllMealFromStorage() {
        return localSource.getAllSavedData();
>>>>>>> 0d9ef6d7aa17e8c1afc0e5627dc28cab6e65f3b9
>>>>>>> 0addf75370e7c58045e03d29d4f1ba2dc50defe8
    }

    @Override
    public LiveData<List<RandomMeal>>  searchById(String id) {

        return localSource.searchById(id);

    }

    @Override
    public LiveData<List<RandomMeal>> getAllMealFromStoragePlanner() {
        return localSource.getAllSavedDataPlanner();
<<<<<<< HEAD
    }

    @Override
    public LiveData<List<RandomMeal>> searchByIdPlanner(String id) {
       return localSource.searchByIdPlanner(id);
    }

    @Override
    public void saveDay(List<Day> days) {
       localSource.saveDays(days);
    }

    @Override
    public void deleteRepeatedData() {
        localSource.deleteRepeatedData();
    }

    @Override
    public LiveData<List<RandomMeal>> getAllMealsSavedPlannerBySelectDay(int id) {
        return localSource.getAllMealsPlannerBySelectedDay(id);
    }

=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 0d9ef6d7aa17e8c1afc0e5627dc28cab6e65f3b9
    }

    @Override
    public LiveData<List<RandomMeal>> searchByIdPlanner(String id) {
       return localSource.searchByIdPlanner(id);
    }

    @Override
    public void saveDay(List<Day> days) {
       localSource.saveDays(days);
    }

    @Override
    public void deleteRepeatedData() {
        localSource.deleteRepeatedData();
    }

    @Override
    public LiveData<List<RandomMeal>> getAllMealsSavedPlannerBySelectDay(int id) {
        return localSource.getAllMealsPlannerBySelectedDay(id);
    }

<<<<<<< HEAD
=======
=======
    }

    @Override
    public LiveData<List<RandomMeal>> searchByIdPlanner(String id) {
       return localSource.searchByIdPlanner(id);
<<<<<<< HEAD
    }

    @Override
    public void saveDay(List<Day> days) {
       localSource.saveDays(days);
    }

    @Override
    public void deleteRepeatedData() {
        localSource.deleteRepeatedData();
    }

    @Override
    public LiveData<List<RandomMeal>> getAllMealsSavedPlannerBySelectDay(int id) {
        return localSource.getAllMealsPlannerBySelectedDay(id);
=======
>>>>>>> eca1561c37458cd3dcb6567e08125bd49145daf2
    }

>>>>>>> b48bd45d26781cdb878e9e8b47ee3307893594f3
>>>>>>> 0d9ef6d7aa17e8c1afc0e5627dc28cab6e65f3b9
>>>>>>> 0addf75370e7c58045e03d29d4f1ba2dc50defe8

}




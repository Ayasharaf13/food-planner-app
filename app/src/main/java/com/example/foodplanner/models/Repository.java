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
    public LiveData<List<RandomMeal>> getAllMealFromStorage(int id) {
        return localSource.getAllSavedData(id);
    }

    @Override
    public LiveData<List<RandomMeal>>  searchById(String id) {

        return localSource.searchById(id);

    }

    @Override
    public LiveData<List<RandomMeal>> getAllMealFromStoragePlanner() {
        return localSource.getAllSavedDataPlanner();
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


}




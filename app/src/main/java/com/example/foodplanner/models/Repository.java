package com.example.foodplanner.models;

import androidx.lifecycle.LiveData;

import com.example.foodplanner.db.LocalSource;
import com.example.foodplanner.network.NetworkDelegate;
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

<<<<<<< HEAD
    @Override
    public void saveMeal(RandomMeal meal) {
        localSource.saveMeal(meal);

    }

    @Override
    public void deleteMeal(RandomMeal meal) {
        localSource.deleteMeal(meal);

    }

    @Override
    public void getAllMealFromStorage() {
      localSource.getAllSavedData();
    }

=======
>>>>>>> a9e1adc143fdd02927f2d841ceff456f59aad7bd

}




package com.example.foodplanner.models;

import androidx.lifecycle.LiveData;

import com.example.foodplanner.db.LocalSource;
import com.example.foodplanner.network.NetworkDelegate;
import com.example.foodplanner.network.NetworkDelegateCategory;
<<<<<<< HEAD
import com.example.foodplanner.network.NetworkDelegateCountry;
import com.example.foodplanner.network.NetworkIngredients;
=======
<<<<<<< HEAD
import com.example.foodplanner.network.NetworkDelegateCountry;
import com.example.foodplanner.network.NetworkIngredients;
=======
<<<<<<< HEAD
import com.example.foodplanner.network.NetworkDelegateCountry;
import com.example.foodplanner.network.NetworkIngredients;
=======
<<<<<<< HEAD
import com.example.foodplanner.network.NetworkIngredients;
=======
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
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
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
    @Override
    public void getCategories(Call<ResponseCategory> call,  NetworkDelegateCategory networkDelegate) {
        remoteSource.makeApiCallCategory(call,networkDelegate);
    }

    @Override
    public void getMealByCategory(Call<MyResponseForRandomMeal> call, NetworkDelegate networkDelegate) {

        remoteSource.makeApiCall(call,networkDelegate);

    }

    @Override
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
    public void getMealByIngredients(Call<ResponseIngredients> call, NetworkIngredients networkDelegate) {

        remoteSource.makeApiCallIngredients(call,networkDelegate);

    }

    @Override
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
    public void  saveMeal(List<RandomMeal> meal) {
      localSource.saveMeal(meal);
=======
    public void  saveMeal(List<RandomMeal> meal) {
      localSource.saveMeal(meal);
=======
<<<<<<< HEAD
    @Override
    public void  saveMeal(List<RandomMeal> meal) {
      localSource.saveMeal(meal);
=======
<<<<<<< HEAD
    @Override
    public void saveMeal(RandomMeal meal) {
        localSource.saveMeal(meal);
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e

    }

    @Override
<<<<<<< HEAD
    public void deleteMeal(List<RandomMeal> meal) {
=======
<<<<<<< HEAD
    public void deleteMeal(List<RandomMeal> meal) {
=======
<<<<<<< HEAD
    public void deleteMeal(List<RandomMeal> meal) {
=======
<<<<<<< HEAD
    public void deleteMeal(List<RandomMeal> meal) {
=======
<<<<<<< HEAD
    public void deleteMeal(List<RandomMeal> meal) {
=======
<<<<<<< HEAD
    public void deleteMeal(List<RandomMeal> meal) {
=======
    public void deleteMeal(RandomMeal meal) {
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
        localSource.deleteMeal(meal);

    }

<<<<<<< HEAD
    @Override
    public void searchByName(Call<MyResponseForRandomMeal> call, NetworkDelegate networkDelegate) {

        remoteSource.makeApiCall(call,networkDelegate);

    }


    @Override
=======
<<<<<<< HEAD


    @Override
=======
<<<<<<< HEAD


    @Override
=======
    @Override
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
    public LiveData<List<RandomMeal>> getAllMealFromStorage() {
     return localSource.getAllSavedData();
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
    @Override
    public LiveData<List<RandomMeal>>  searchById(String id) {

       return localSource.searchById(id);

    }

<<<<<<< HEAD


=======
<<<<<<< HEAD


=======
<<<<<<< HEAD


=======
<<<<<<< HEAD


=======
=======
=======
    public void getAllMealFromStorage() {
      localSource.getAllSavedData();
    }

=======
>>>>>>> a9e1adc143fdd02927f2d841ceff456f59aad7bd
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e

}




package com.example.foodplanner.search.presenter;

import android.util.Log;

import com.example.foodplanner.models.Category;
<<<<<<< HEAD
import com.example.foodplanner.models.CountryNames;
=======
<<<<<<< HEAD
import com.example.foodplanner.models.CountryNames;
=======
<<<<<<< HEAD
import com.example.foodplanner.models.CountryNames;
=======
<<<<<<< HEAD
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
import com.example.foodplanner.models.Ingredients;
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.RepositoryInterface;
import com.example.foodplanner.network.FoodClient;
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
import com.example.foodplanner.network.NetworkIngredients;
=======
import com.example.foodplanner.models.RepositoryInterface;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.network.NetworkDelegateCategory;
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
import com.example.foodplanner.search.view.SearchViewInterface;

import java.util.List;

<<<<<<< HEAD
public class SearchPresenter  implements NetworkDelegateCategory,SearchPresenterInterface , NetworkIngredients , NetworkDelegateCountry {
=======
<<<<<<< HEAD
public class SearchPresenter  implements NetworkDelegateCategory,SearchPresenterInterface , NetworkIngredients , NetworkDelegateCountry {
=======
<<<<<<< HEAD
public class SearchPresenter  implements NetworkDelegateCategory,SearchPresenterInterface , NetworkIngredients , NetworkDelegateCountry {
=======
<<<<<<< HEAD
public class SearchPresenter  implements NetworkDelegateCategory,SearchPresenterInterface , NetworkIngredients {
=======
public class SearchPresenter  implements NetworkDelegateCategory,SearchPresenterInterface  {
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e

    RepositoryInterface repo ;
    SearchViewInterface searchViewInterface;

    public SearchPresenter (RepositoryInterface repo , SearchViewInterface searchViewInterface){
        this.repo =repo;
        this.searchViewInterface =searchViewInterface;

    }

<<<<<<< HEAD
    @Override
    public void OnSuccessResultIngredients(List<Ingredients> listOfMeals) {
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
    @Override
    public void OnSuccessResult(List<Ingredients> listOfMeals) {
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e

        searchViewInterface.showIngredients(listOfMeals);

    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e


    @Override
    public void OnSuccessResultCountries(List<CountryNames> listOfCountryNames) {

        searchViewInterface.showCountries(listOfCountryNames);
        Log.i("countryyy",">>>>listtttttt");

    }
<<<<<<< HEAD


=======
<<<<<<< HEAD
=======
=======
=======
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e

    @Override
    public void OnFailureResult(String errorMass) {
       Log.i("error Category",errorMass);
    }

    @Override
    public void OnSuccessResultCategory(List<Category> categoryList) {

        searchViewInterface.showCategory(categoryList);
<<<<<<< HEAD


=======
<<<<<<< HEAD


=======
<<<<<<< HEAD


=======
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
    }


    @Override
    public void getCategories() {

        repo.getCategories(FoodClient.getInstance().getApiService().getCategory(),this);

    }

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
    @Override
    public void getIngredients() {

        repo.getMealByIngredients(FoodClient.getInstance().getApiService().getMealsByIngredients(),this);

    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
    @Override
    public void getCountries() {

        repo.getCountriesName(FoodClient.getInstance().getApiService().getCountries(),this);

    }

<<<<<<< HEAD


=======
<<<<<<< HEAD
=======
=======
=======
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e

}

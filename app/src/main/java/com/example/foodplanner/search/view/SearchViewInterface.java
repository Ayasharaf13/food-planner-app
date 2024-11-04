package com.example.foodplanner.search.view;

import com.example.foodplanner.models.Category;
import com.example.foodplanner.models.CountryNames;
import com.example.foodplanner.models.Ingredients;

import java.util.List;

public interface SearchViewInterface {

    void showCategory(List<Category> categoryList);
    void showIngredients(List<Ingredients> meals);
    void showCountries(List<CountryNames> countryNames);

}

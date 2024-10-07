package com.example.foodplanner.network;

import com.example.foodplanner.models.CountryNames;
import com.example.foodplanner.models.ResponseCountry;

import java.util.List;


public interface NetworkDelegateCountry {


    void OnSuccessResultCountries (List<CountryNames> listOfCountry );
    void OnFailureResult ( String errorMass);


}

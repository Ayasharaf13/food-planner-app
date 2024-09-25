package com.example.foodplanner.network;

import com.example.foodplanner.models.Category;

import java.util.List;

public interface NetworkDelegateCategory {


    void OnFailureResult ( String errorMass);
    void  OnSuccessResultCategory(List<Category> categoryList);
}

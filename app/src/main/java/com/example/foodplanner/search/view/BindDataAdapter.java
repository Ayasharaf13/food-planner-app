package com.example.foodplanner.search.view;


import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodplanner.detailsmeals.view.IngredientsAdapter;
import com.example.foodplanner.home.view.HomeAdapter;

public interface BindDataAdapter<T>  {

    void OnBind (@NonNull CategoryAdapter.ViewHolder holder, T item);

}

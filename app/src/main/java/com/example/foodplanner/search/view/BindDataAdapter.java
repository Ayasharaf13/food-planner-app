package com.example.foodplanner.search.view;


import androidx.annotation.NonNull;

public interface BindDataAdapter<T>  {

    void OnBind (@NonNull CategoryAdapter.ViewHolder holder, T item);

}

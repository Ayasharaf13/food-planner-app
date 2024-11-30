package com.example.foodplanner.detailsmeals.view;

import com.example.foodplanner.detailsmeals.view.GenericAdapter;

public interface OnBindData<T> {

    void onBind (GenericAdapter.ViewHolder holder , T currentItem);
}



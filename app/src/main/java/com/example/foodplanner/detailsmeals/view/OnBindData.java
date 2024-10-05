package com.example.foodplanner.detailsmeals.view;

public interface OnBindData<T> {

    void onBind (GenericAdapter.ViewHolder holder , T currentItem);
}

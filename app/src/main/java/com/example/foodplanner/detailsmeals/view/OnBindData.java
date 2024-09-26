package com.example.foodplanner.detailsmeals.view;

import android.widget.VideoView;

public interface OnBindData<T> {

    void onBind (IngredientsAdapter.ViewHolder holder ,T currentItem);
}

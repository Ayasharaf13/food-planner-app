package com.example.foodplanner.detailsmeals.view;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.foodplanner.R;
import com.example.foodplanner.home.view.HomeAdapter;
import com.example.foodplanner.models.RandomMeal;

<<<<<<< HEAD
public class IngredientsAdapter<T> extends ListAdapter<T,IngredientsAdapter.ViewHolder> {

    OnBindData bindData;

    public IngredientsAdapter(OnBindData bindData) {
        super(new IngredientsDiffUtil());
        this.bindData = bindData;
=======
public class IngredientsAdapter extends ListAdapter<String,IngredientsAdapter.ViewHolder> {

    protected IngredientsAdapter() {
        super(new IngredientsDiffUtil());
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

<<<<<<< HEAD
       public ImageView imageMeal;

      public   TextView titleMeal;
=======
        ImageView imageMeal;

        TextView titleMeal;
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageMeal = itemView.findViewById(R.id.ingradianceImage);
            titleMeal = itemView.findViewById(R.id.nameIngrediance);

        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ingrediance_item, parent, false);
        return new IngredientsAdapter.ViewHolder(view);
    }
<<<<<<< HEAD
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        T currentObj = getItem(position);
        bindData.onBind(holder,currentObj);
      /*  Log.i("testadapter",currentObj);
=======
//www.themealdb.com/images/ingredients/lamb loin chops.png
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String currentObj = getItem(position);
        Log.i("testadapter",currentObj);
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
        Glide.with(holder.itemView.getContext())
                .load("https://www.themealdb.com/images/ingredients/"+currentObj+".png")
                .override(300, 200)
                .error(R.drawable.ic_launcher_background)
                .into(holder.imageMeal);


<<<<<<< HEAD
            holder.titleMeal.setText(currentObj);*/
=======
            holder.titleMeal.setText(currentObj);
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61

    }


<<<<<<< HEAD
    static class IngredientsDiffUtil<T> extends DiffUtil.ItemCallback<T> {

        @Override
        public boolean areItemsTheSame(@NonNull T oldItem, @NonNull T newItem) {
=======
    static class IngredientsDiffUtil extends DiffUtil.ItemCallback<String> {

        @Override
        public boolean areItemsTheSame(@NonNull String oldItem, @NonNull String newItem) {
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
            return oldItem == newItem;
        }

        @SuppressLint("DiffUtilEquals")
        @Override
<<<<<<< HEAD
        public boolean areContentsTheSame(@NonNull T oldItem, @NonNull T newItem) {
=======
        public boolean areContentsTheSame(@NonNull String oldItem, @NonNull String newItem) {
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
            return oldItem.equals(newItem);
        }
    }


}

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

public class IngredientsAdapter extends ListAdapter<String,IngredientsAdapter.ViewHolder> {

    protected IngredientsAdapter() {
        super(new IngredientsDiffUtil());
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageMeal;

        TextView titleMeal;



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
//www.themealdb.com/images/ingredients/lamb loin chops.png
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String currentObj = getItem(position);
        Log.i("testadapter",currentObj);
        Glide.with(holder.itemView.getContext())
                .load("https://www.themealdb.com/images/ingredients/"+currentObj+".png")
                .override(300, 200)
                .error(R.drawable.ic_launcher_background)
                .into(holder.imageMeal);


            holder.titleMeal.setText(currentObj);

    }


    static class IngredientsDiffUtil extends DiffUtil.ItemCallback<String> {

        @Override
        public boolean areItemsTheSame(@NonNull String oldItem, @NonNull String newItem) {
            return oldItem == newItem;
        }

        @SuppressLint("DiffUtilEquals")
        @Override
        public boolean areContentsTheSame(@NonNull String oldItem, @NonNull String newItem) {
            return oldItem.equals(newItem);
        }
    }


}

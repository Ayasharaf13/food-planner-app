package com.example.foodplanner.home.view;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.foodplanner.R;
import com.example.foodplanner.models.RandomMeal;



public class HomeAdapter extends ListAdapter<RandomMeal, HomeAdapter.ViewHolder> {


    protected HomeAdapter() {
        super(new RandomMealDiffUtil ());
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageMeal;
        ImageView imageSave;
        TextView titleMeal;
        Button watchBtn;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
           imageMeal = itemView.findViewById(R.id.img_meal_item);
           imageSave = itemView.findViewById(R.id.img_save_item);
           titleMeal = itemView.findViewById(R.id.name_meal_item);
           watchBtn = itemView.findViewById(R.id.btn_watch_item);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.meal_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RandomMeal currentObj = getItem(position);
        Glide.with(holder.itemView.getContext())
                .load(currentObj.getStrMealThumb())
                .override(300, 200)
                .error(R.drawable.ic_launcher_background)
                .into(holder.imageMeal);


      holder.titleMeal.setText(currentObj.getStrMeal());

    }

    static class RandomMealDiffUtil extends DiffUtil.ItemCallback<RandomMeal> {

        @Override
        public boolean areItemsTheSame(@NonNull RandomMeal oldItem, @NonNull RandomMeal newItem) {
            return oldItem == newItem;
        }

        @SuppressLint("DiffUtilEquals")
        @Override
        public boolean areContentsTheSame(@NonNull RandomMeal oldItem, @NonNull RandomMeal newItem) {
            return oldItem.equals(newItem);
        }
    }
}

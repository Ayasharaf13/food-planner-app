package com.example.foodplanner.search.view;


import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.foodplanner.R;
import com.example.foodplanner.home.view.HomeFragmentDirections;

import com.example.foodplanner.models.RandomMeal;

import java.util.Objects;

public class SearchAdapter extends ListAdapter<RandomMeal, SearchAdapter .ViewHolder>  {

    String nav;

    public SearchAdapter(String nav) {
        super(new SearchAdapter.RandomMealDiffUtil());

        this.nav = nav;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.meal_item, parent, false);
        return new SearchAdapter.ViewHolder(view);
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageMeal;
        ImageView imageSave;
        TextView titleMeal;
        Button watchBtn;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageMeal = itemView.findViewById(R.id.imgMealItem);
            imageSave = itemView.findViewById(R.id.img_save_item);
            titleMeal = itemView.findViewById(R.id.nameMealItem);
            watchBtn = itemView.findViewById(R.id.btnWatchItem);
        }
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

        holder.imageSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String id = currentObj.getIdMeal();


                NavDirections action = HomeFragmentDirections.actionHomeFragmentToSaveFragment().setIdSavingFood(id);
                Navigation.findNavController(view).navigate(action);
            }


        });


        holder.imageMeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = currentObj.getIdMeal();
                if (Objects.equals(nav, "home")) {
                    NavDirections action = HomeFragmentDirections.actionHomeFragmentToDetailsMealFragment(id);
                    Navigation.findNavController(view).navigate(action);
                } else if (Objects.equals(nav, "category")) {
                    NavDirections action = MealCategoryFragmentDirections.actionMealCategoryFragmentToDetailsMealFragment(id);
                    Navigation.findNavController(view).navigate(action);
                } else if (nav.equals("mealCountry")) {

                    NavDirections action = MealCountryFragmentDirections.actionMealCountryFragmentToDetailsMealFragment(id);
                    Navigation.findNavController(view).navigate(action);

                } else if (nav.equals("mealIngred")) {
                    NavDirections action = IngredientsMealsFragmentDirections.actionIngredientsMealsFragmentToDetailsMealFragment(id);
                    Navigation.findNavController(view).navigate(action);
                }else if (nav.equals("search")){

                }
            }
        });

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

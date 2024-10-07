package com.example.foodplanner.home.view;

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
import com.example.foodplanner.models.Category;
import com.example.foodplanner.models.Country;
import com.example.foodplanner.models.Ingredients;
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.search.view.IngredientsMealsFragment;
import com.example.foodplanner.search.view.IngredientsMealsFragmentDirections;
import com.example.foodplanner.search.view.MealCategoryFragment;
import com.example.foodplanner.search.view.MealCategoryFragmentDirections;
import com.example.foodplanner.search.view.MealCountryFragmentDirections;
import com.example.foodplanner.search.view.SearchFragmentDirections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class HomeAdapter extends ListAdapter<RandomMeal, HomeAdapter.ViewHolder>  {

   String nav;
   List <Ingredients> originListIng  = new ArrayList<>();
    List <Category> originListCategory  = new ArrayList<>();
    List <Country> originListCountry  = new ArrayList<>();

  /*  private Filter searchFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence input) {
            List<Ingredients> filteredListIng = new ArrayList<>();
            List<Category> filteredListCatego = new ArrayList<>();
            List<Ingredients> filteredListCountry = new ArrayList<>();

            if (input == null || input.length() == 0) {
                filteredListCatego.addAll(originListCategory);
            } else {
                String filterPattern = input.toString().toLowerCase().trim();
                for (RandomMeal item : originList) {
                    if (item.getStrMeal().toLowerCase().contains(filterPattern)) {
                        filteredList.add(item);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;
            return results;
        }

        @Override
        protected void publishResults(CharSequence input, FilterResults results) {
            //noinspection unchecked
            submitList((List<RandomMeal>) results.values);
        }
    };

   */


   public HomeAdapter(String nav) {
        super(new RandomMealDiffUtil ());

        this.nav =nav;
    }




    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageMeal;
        ImageView imageSave;
        public TextView titleMeal;
        Button watchBtn;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
           imageMeal = itemView.findViewById(R.id.imgMealItem);
           imageSave = itemView.findViewById(R.id.img_save_item);
           titleMeal = itemView.findViewById(R.id.nameMealItem);
           watchBtn = itemView.findViewById(R.id.btnWatchItem);
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

      holder.imageSave.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {


              String id =  currentObj.getIdMeal();


                  NavDirections action = HomeFragmentDirections.actionHomeFragmentToSaveFragment().setIdSavingFood(id);
                  Navigation.findNavController(view).navigate(action);
              }



      });


      holder.imageMeal.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            String id = currentObj.getIdMeal();
              if(Objects.equals(nav, "home")) {
                  NavDirections action = HomeFragmentDirections.actionHomeFragmentToDetailsMealFragment(id);
                  Navigation.findNavController(view).navigate(action);
              }else if(Objects.equals(nav, "category")) {
                  NavDirections action = MealCategoryFragmentDirections.actionMealCategoryFragmentToDetailsMealFragment(id);
                  Navigation.findNavController(view).navigate(action);
              }else if(nav.equals("mealCountry")){

                  NavDirections action = MealCountryFragmentDirections.actionMealCountryFragmentToDetailsMealFragment(id);
                  Navigation.findNavController(view).navigate(action);

              }else if(nav.equals("mealIngred")){
                  NavDirections action = IngredientsMealsFragmentDirections.actionIngredientsMealsFragmentToDetailsMealFragment(id);
                  Navigation.findNavController(view).navigate(action);
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

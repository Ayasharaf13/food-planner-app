package com.example.foodplanner.detailsmeals.view;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.example.foodplanner.models.Country;
import com.example.foodplanner.models.Ingredients;
import com.example.foodplanner.search.view.SearchFragmentDirections;

public class GenericAdapter<T> extends ListAdapter<T, GenericAdapter.ViewHolder> {

    //  OnBindData bindData;

    public GenericAdapter(/*OnBindData bindData*/) {
        super(new IngredientsDiffUtil());
        // this.bindData = bindData;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageMeal;

        public   TextView titleMeal;



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
        return new GenericAdapter.ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        T currentObj = getItem(position);
        //  bindData.onBind(holder,currentObj);

        // Example: If the type is `Country`, cast and handle it.
        if (currentObj instanceof Country) {
            Country country = (Country) currentObj;
            holder.titleMeal.setText(country.getNameCountry());
            holder.imageMeal.setImageDrawable(country.getImage());

            holder.imageMeal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String nameCountry =  ((Country) currentObj).getNameCountry();
                    NavDirections action = SearchFragmentDirections.actionSearchFragmentToMealCountryFragment().setCountryName(nameCountry);
                    Navigation.findNavController(view).navigate(action);
                }
            });
        }
        else if(currentObj instanceof Ingredients){
            Ingredients ingredients = (Ingredients) currentObj;
            Glide.with(holder.itemView.getContext())
                    .load("https://www.themealdb.com/images/ingredients/"+((Ingredients) currentObj).strIngredient+".png")
                    .override(300, 200)
                    .error(R.drawable.ic_launcher_background)
                    .into(holder.imageMeal);
            holder.titleMeal.setText(ingredients.strIngredient);

            holder.imageMeal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String nameIngredients = ((Ingredients) currentObj).strIngredient;
                    NavDirections action = SearchFragmentDirections.actionSearchFragmentToIngredientsMealsFragment().setNameIngredients(nameIngredients);
                    Navigation.findNavController(view).navigate(action);


                }
            });

        }else if(currentObj instanceof  String){

            String currentItem = (String) currentObj;
            Log.i("testadapter",currentItem );
            Glide.with(holder.itemView.getContext())
                    .load("https://www.themealdb.com/images/ingredients/"+currentObj+".png")
                    .override(300, 200)
                    .error(R.drawable.ic_launcher_background)
                    .into(holder.imageMeal);
            holder.titleMeal.setText(currentItem );


        }






    }


    static class IngredientsDiffUtil<T> extends DiffUtil.ItemCallback<T> {

        @Override

        public boolean areItemsTheSame(@NonNull T oldItem, @NonNull T newItem) {
            return oldItem == newItem;
        }

        @SuppressLint("DiffUtilEquals")
        @Override
        public boolean areContentsTheSame(@NonNull T oldItem, @NonNull T newItem) {
            return oldItem.equals(newItem);
        }
    }


}

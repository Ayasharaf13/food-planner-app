package com.example.foodplanner.search.view;


import android.annotation.SuppressLint;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
import com.example.foodplanner.models.Category;
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.save.view.SaveMealsAdapter;

public class CategoryAdapter  extends ListAdapter<Category,CategoryAdapter.ViewHolder> {

  //   BindDataAdapter bindDataAdapter ;

    protected CategoryAdapter() {
        super(new CategoryAdapter.CategoryDiffUtil());

         //  this.bindDataAdapter = bindDataAdapter;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageCategory;
        TextView titleCategory;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageCategory = itemView.findViewById(R.id.imageCategory);
            titleCategory = itemView.findViewById(R.id.nameCategory);

        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categoryitem, parent, false);
        return new CategoryAdapter.ViewHolder(view);



    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Category currentObj = getItem(position);

     //  bindDataAdapter.OnBind(holder,currentObj);


        Glide.with(holder.itemView.getContext())

                .load(currentObj.getStrCategoryThumb())
                .override(300, 200)
                .error(R.drawable.ic_launcher_background)
                .into(holder.imageCategory);

        holder.titleCategory.setText(currentObj.getStrCategory());



        holder.imageCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String id =  currentObj.strCategory;
                Log.i("mealcategorysend",id);

                NavDirections action = SearchFragmentDirections.actionSearchFragmentToMealCategoryFragment().setIdCategory(id);
                Navigation.findNavController(view).navigate(action);

            }
        });


    }


    static class CategoryDiffUtil  extends DiffUtil.ItemCallback<Category> {

        @Override
        public boolean areItemsTheSame(@NonNull Category oldItem, @NonNull Category newItem) {

            return oldItem == newItem;

        }

        @SuppressLint("DiffUtilEquals")
        @Override
        public boolean areContentsTheSame(@NonNull Category oldItem, @NonNull  Category newItem) {
            return oldItem.equals(newItem);
        }
    }


}

package com.example.foodplanner.planner.view;

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
import com.example.foodplanner.save.view.InterfaceAdapter;

public class PlannerAdapter extends ListAdapter<RandomMeal, PlannerAdapter.ViewHolder> {

    InterfaceAdapter deleteItemPlanner;

    public PlannerAdapter (InterfaceAdapter deleteItemPlanner){
        super(new RandomMealDiffUtil() );
        this.deleteItemPlanner = deleteItemPlanner;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemplanner, parent, false);
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
        holder.textCalender.setText(currentObj.getDate());
        holder.deleteItemMealPlanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String id = currentObj.getIdMeal();
                 deleteItemPlanner.delete(id);
            }
        });



    }



    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageMeal;
        ImageView imageSave;
        public TextView titleMeal;
        Button watchBtn;
        TextView textCalender;
        ImageView deleteItemMealPlanner;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageMeal = itemView.findViewById(R.id.imgMealItemPlanner);
            titleMeal = itemView.findViewById(R.id.nameMealItemPlanner);
            watchBtn = itemView.findViewById(R.id.btnWatchItemPlanner);
            textCalender = itemView.findViewById(R.id.textCalender);
            deleteItemMealPlanner = itemView.findViewById(R.id.imageDelteItemPlanner);


        }
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

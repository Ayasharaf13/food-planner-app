package com.example.foodplanner.save.view;


import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.foodplanner.R;
import com.example.foodplanner.home.view.HomeAdapter;
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.Repository;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.save.presenter.SavePresenterInterface;

import java.util.List;

public class SaveMealsAdapter extends ListAdapter<RandomMeal,SaveMealsAdapter.ViewHolder> {
<<<<<<< HEAD


    InterfaceAdapter deleteClick  ;
=======
<<<<<<< HEAD


    InterfaceAdapter deleteClick  ;
=======
   /* SavePresenterInterface savePresenterInterface;
    savePresenterInterface = new SavePresenter(
            Repository.getInstance(FoodClient.getInstance(),ConcreteLocalSource.getInstance(requireContext()))
            , this);

    */

    InterfaceAdapter deleteClick  = (id) -> {};
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61



    protected SaveMealsAdapter( InterfaceAdapter delete) {
        super(new SaveMealsAdapter.SaveMealsDiffUtil());
<<<<<<< HEAD

        this.deleteClick =delete;
=======
<<<<<<< HEAD

        this.deleteClick =delete;
=======
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
    }



    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageMeal;
        ImageView imageDelete;
        TextView titleMeal;
        Button watchBtn;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageMeal = itemView.findViewById(R.id.imgMealSaveItem);
            imageDelete = itemView.findViewById(R.id.deleteItem);
            titleMeal = itemView.findViewById(R.id.nameMealSaveItem);
            watchBtn = itemView.findViewById(R.id.btnWatchSaveItem);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.save_item, parent, false);
        return new SaveMealsAdapter.ViewHolder(view);
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


       holder.imageDelete.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                String id = currentObj.getIdMeal();
                deleteClick.delete(id);


           }
       });




    }


    static class SaveMealsDiffUtil extends DiffUtil.ItemCallback<RandomMeal> {

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

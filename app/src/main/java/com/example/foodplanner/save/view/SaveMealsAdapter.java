package com.example.foodplanner.save.view;


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

public class SaveMealsAdapter extends ListAdapter<RandomMeal,SaveMealsAdapter.ViewHolder> {


    InterfaceAdapter deleteClick  ;



    protected SaveMealsAdapter( InterfaceAdapter delete) {
        super(new SaveMealsAdapter.SaveMealsDiffUtil());

        this.deleteClick =delete;
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
<<<<<<< HEAD
            }
        });
=======
<<<<<<< HEAD
            }
        });
=======
<<<<<<< HEAD
            }
        });
=======


            }
        });




>>>>>>> eca1561c37458cd3dcb6567e08125bd49145daf2
>>>>>>> b48bd45d26781cdb878e9e8b47ee3307893594f3
>>>>>>> 0d9ef6d7aa17e8c1afc0e5627dc28cab6e65f3b9
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

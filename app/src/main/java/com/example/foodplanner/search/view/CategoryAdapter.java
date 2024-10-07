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

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
public class CategoryAdapter  extends ListAdapter<Category,CategoryAdapter.ViewHolder> {

  //   BindDataAdapter bindDataAdapter ;

    protected CategoryAdapter() {
        super(new CategoryAdapter.CategoryDiffUtil());

         //  this.bindDataAdapter = bindDataAdapter;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
public class CategoryAdapter extends ListAdapter<Category,CategoryAdapter.ViewHolder> {


    protected CategoryAdapter() {
        super(new CategoryAdapter.CategoryDiffUtil());
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
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

<<<<<<< HEAD


=======
<<<<<<< HEAD


=======
<<<<<<< HEAD


=======
<<<<<<< HEAD


=======
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
        Category currentObj = getItem(position);

     //  bindDataAdapter.OnBind(holder,currentObj);


<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======

       Category currentObj = getItem(position);
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
        Glide.with(holder.itemView.getContext())

                .load(currentObj.getStrCategoryThumb())
                .override(300, 200)
                .error(R.drawable.ic_launcher_background)
                .into(holder.imageCategory);

        holder.titleCategory.setText(currentObj.getStrCategory());


<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
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


<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
    static class CategoryDiffUtil  extends DiffUtil.ItemCallback<Category> {

        @Override
        public boolean areItemsTheSame(@NonNull Category oldItem, @NonNull Category newItem) {

            return oldItem == newItem;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
    static class CategoryDiffUtil extends DiffUtil.ItemCallback<Category> {

        @Override
        public boolean areItemsTheSame(@NonNull Category oldItem, @NonNull Category newItem) {
            return oldItem == newItem;
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
        }

        @SuppressLint("DiffUtilEquals")
        @Override
<<<<<<< HEAD
        public boolean areContentsTheSame(@NonNull Category oldItem, @NonNull  Category newItem) {
=======
<<<<<<< HEAD
        public boolean areContentsTheSame(@NonNull Category oldItem, @NonNull  Category newItem) {
=======
<<<<<<< HEAD
        public boolean areContentsTheSame(@NonNull Category oldItem, @NonNull  Category newItem) {
=======
<<<<<<< HEAD
        public boolean areContentsTheSame(@NonNull Category oldItem, @NonNull  Category newItem) {
=======
        public boolean areContentsTheSame(@NonNull Category oldItem, @NonNull Category newItem) {
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
            return oldItem.equals(newItem);
        }
    }


}

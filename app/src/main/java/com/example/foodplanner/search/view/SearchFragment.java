package com.example.foodplanner.search.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
<<<<<<< HEAD
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
=======
import androidx.recyclerview.widget.GridLayoutManager;
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.foodplanner.R;
import com.example.foodplanner.db.ConcreteLocalSource;
<<<<<<< HEAD
import com.example.foodplanner.detailsmeals.view.IngredientsAdapter;
import com.example.foodplanner.detailsmeals.view.OnBindData;
import com.example.foodplanner.models.Category;
import com.example.foodplanner.models.Ingredients;
import com.example.foodplanner.models.RandomMeal;
=======
import com.example.foodplanner.models.Category;
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
import com.example.foodplanner.models.Repository;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.search.presenter.SearchPresenter;
import com.example.foodplanner.search.presenter.SearchPresenterInterface;

<<<<<<< HEAD
import java.util.Collections;
import java.util.List;

public class SearchFragment extends Fragment  implements SearchViewInterface {


  CategoryAdapter categoryAdapter;
  IngredientsAdapter ingredientsAdapter;
  RecyclerView recyclerViewCategory;
  SearchPresenterInterface searchPresenter;
  RecyclerView recyclerViewIngredients;

  Category category;
=======
import java.util.List;

public class SearchFragment extends Fragment  implements SearchViewInterface{


  CategoryAdapter categoryAdapter;
  RecyclerView recyclerViewCategory;
  SearchPresenterInterface searchPresenter;
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61


    public SearchFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static SearchFragment newInstance(String param1, String param2) {
        SearchFragment fragment = new SearchFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        searchPresenter = new SearchPresenter(Repository.getInstance(FoodClient.getInstance(),
                ConcreteLocalSource.getInstance(requireContext())),this);
<<<<<<< HEAD

        /*   BindDataAdapter bindDataAdapter = (holder,currentObj )-> {
           Ingredients currentObj1 = (Ingredients) currentObj;
               Glide.with(holder.itemView.getContext())
                    .load("https://www.themealdb.com/images/ingredients/"+currentObj1+".png")
                    .override(300, 200)
                    .error(R.drawable.ic_launcher_background)
                    .into(holder.imageCategory);

            holder.titleCategory.setText(currentObj1.strIngredient);
            holder.imageCategory.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                   String id = currentObj1.strCategory;
                    Log.i("mealcategorysend", id);

                    NavDirections action = SearchFragmentDirections.actionSearchFragmentToMealCategoryFragment().setIdCategory(id);
                    Navigation.findNavController(view).navigate(action);

                }
            });


        };

         */
        OnBindData bindData = (holder, currentObj)->{
            Ingredients currentItem = (Ingredients) currentObj;

          //  Log.i("testadapter",currentItem );
            Glide.with(holder.itemView.getContext())
                    .load("https://www.themealdb.com/images/ingredients/"+((Ingredients) currentObj).strIngredient+".png")
                    .override(300, 200)
                    .error(R.drawable.ic_launcher_background)
                    .into(holder.imageMeal);
                holder.titleMeal.setText(currentItem.strIngredient);

        };

         categoryAdapter = new CategoryAdapter();
        ingredientsAdapter  = new IngredientsAdapter(bindData);

        searchPresenter.getCategories();
        searchPresenter.getIngredients();
=======
        categoryAdapter = new CategoryAdapter();

        searchPresenter.getCategories();
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerViewCategory = view.findViewById(R.id.recyclerCategory);
<<<<<<< HEAD
        recyclerViewIngredients = view.findViewById(R.id.recyclerIngrediance);

        GridLayoutManager layoutManager=new GridLayoutManager(requireContext(),2);
        LinearLayoutManager layoutManagerHorizontal = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        recyclerViewCategory.setLayoutManager(layoutManager);
        recyclerViewIngredients.setLayoutManager(layoutManagerHorizontal);
=======
        GridLayoutManager layoutManager=new GridLayoutManager(requireContext(),2);
        recyclerViewCategory.setLayoutManager(layoutManager);
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61





    }

    @Override
    public void showCategory(List<Category> categoryList) {


        categoryAdapter.submitList(categoryList);
        recyclerViewCategory.setAdapter(categoryAdapter);

    }

<<<<<<< HEAD
    @Override
    public void showIngredients(List<Ingredients> meals) {

      String mealslist=    meals.toString();
      ingredientsAdapter.submitList(meals);
       // ingredientsAdapter.submitList(Collections.singletonList(mealslist));
      //   categoryAdapter.submitList(meals);
       recyclerViewIngredients.setAdapter(ingredientsAdapter);

    }

=======
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61


}
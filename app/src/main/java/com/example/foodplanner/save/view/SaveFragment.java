package com.example.foodplanner.save.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodplanner.R;
import com.example.foodplanner.db.ConcreteLocalSource;

import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.Repository;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.save.presenter.SavePresenter;
import com.example.foodplanner.save.presenter.SavePresenterInterface;

import java.util.List;

public class SaveFragment extends Fragment implements SaveViewInterface {

    SaveMealsAdapter saveMealsAdapter;
    RecyclerView saveRecyclerView;
    SavePresenterInterface savePresenterInterface;
    String idMealSave;



    public SaveFragment() {
        // Required empty public constructor
    }


    public static SaveFragment newInstance(String param1, String param2) {
        SaveFragment fragment = new SaveFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        savePresenterInterface = new SavePresenter(
                Repository.getInstance(FoodClient.getInstance(),ConcreteLocalSource.getInstance(requireContext()))
                , this);


        InterfaceAdapter deleteClick  = (id) -> {
            LiveData<List<RandomMeal>> meal = savePresenterInterface.searchById(id);
            meal.observe(this, new Observer<List<RandomMeal>>() {
                @Override
                public void onChanged(List<RandomMeal> randomMeals) {
                    savePresenterInterface.delete(randomMeals);
                }
            });


        };

        saveMealsAdapter = new SaveMealsAdapter(deleteClick);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_save, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        saveRecyclerView = view.findViewById(R.id.recycleSave);
        GridLayoutManager layoutManager=new GridLayoutManager(requireContext(),2);
        saveRecyclerView.setLayoutManager(layoutManager);
<<<<<<< HEAD

        savePresenterInterface.getAllSaveBySelectedDay(36).observe(SaveFragment.this,
=======


        savePresenterInterface.getAllSaveBySelectedDay(36).observe(SaveFragment.this,




        savePresenterInterface.getAllSavePlannerBySelectedDay(36).observe(SaveFragment.this,
>>>>>>> 0addf75370e7c58045e03d29d4f1ba2dc50defe8
                new Observer<List<RandomMeal>>() {
                    @Override
                    public void onChanged(List<RandomMeal> randomMeals) {
                        saveMealsAdapter.submitList(randomMeals);
                        saveRecyclerView.setAdapter(saveMealsAdapter);
                    }
                });
<<<<<<< HEAD
=======

>>>>>>> 0addf75370e7c58045e03d29d4f1ba2dc50defe8
        // Retrieve the argument using Safe Args
        if (getArguments() != null) {

            SaveFragmentArgs args = SaveFragmentArgs.fromBundle(getArguments());

            idMealSave = args.getIdSavingFood();
            savePresenterInterface.getMealsByID(idMealSave);


            //   DetailsMealFragmentArgs args = DetailsMealFragmentArgs.fromBundle(getArguments());
            //  idMealSave = args.getIdMeal();

            // detailsPresenter.getMealsByID(idMeal);
        }



    }

    @Override
    public void showMealSaved(LiveData<List<RandomMeal>> meals) {

        meals.observe(this, new androidx.lifecycle.Observer<List<RandomMeal>>() {
            @Override
            public void onChanged(List<RandomMeal> randomMeals) {
                saveMealsAdapter.submitList(randomMeals);
                saveRecyclerView.setAdapter(saveMealsAdapter);

            }
        });

    }

}

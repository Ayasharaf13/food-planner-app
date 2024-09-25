package com.example.foodplanner.save.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
<<<<<<< HEAD
import androidx.lifecycle.Observer;
=======
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.foodplanner.R;
import com.example.foodplanner.db.ConcreteLocalSource;
import com.example.foodplanner.detailsmeals.view.DetailsMealFragmentArgs;
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.Repository;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.save.presenter.SavePresenter;
import com.example.foodplanner.save.presenter.SavePresenterInterface;

<<<<<<< HEAD
import java.util.List;
=======
<<<<<<< HEAD
import java.util.List;
import java.util.Observer;
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8

public class SaveFragment extends Fragment implements SaveViewInterface {

   SaveMealsAdapter saveMealsAdapter;
   RecyclerView saveRecyclerView;
   SavePresenterInterface savePresenterInterface;
   String idMealSave;
<<<<<<< HEAD


=======


=======
public class SaveFragment extends Fragment {



>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8

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
<<<<<<< HEAD


=======
<<<<<<< HEAD
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8

                    savePresenterInterface = new SavePresenter(
                    Repository.getInstance(FoodClient.getInstance(),ConcreteLocalSource.getInstance(requireContext()))
                            , this);


                     InterfaceAdapter deleteClick  = (id) -> {
<<<<<<< HEAD
                         LiveData<List<RandomMeal>> meal = savePresenterInterface.searchById(id);
                         meal.observe(this, new Observer<List<RandomMeal>>() {
                             @Override
                             public void onChanged(List<RandomMeal> randomMeals) {
                                 savePresenterInterface.delete(randomMeals);
                             }
                         });

=======
                      //    savePresenterInterface.getMealsByID(id);
                         // savePresenterInterface.delete();
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8

                     };

                    saveMealsAdapter = new SaveMealsAdapter(deleteClick);

<<<<<<< HEAD
=======
=======
        if (getArguments() != null) {

        }
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
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
        // Retrieve the argument using Safe Args
        if (getArguments() != null) {

            SaveFragmentArgs args = SaveFragmentArgs.fromBundle(getArguments());

=======



// Retrieve the argument using Safe Args
        if (getArguments() != null) {

            SaveFragmentArgs args = SaveFragmentArgs.fromBundle(getArguments());
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
            idMealSave = args.getIdSavingFood();
            savePresenterInterface.getMealsByID(idMealSave);
            Log.i("idmeal", idMealSave);

<<<<<<< HEAD
            //   DetailsMealFragmentArgs args = DetailsMealFragmentArgs.fromBundle(getArguments());
            //  idMealSave = args.getIdMeal();

            // detailsPresenter.getMealsByID(idMeal);
        }



=======
         //   DetailsMealFragmentArgs args = DetailsMealFragmentArgs.fromBundle(getArguments());
          //  idMealSave = args.getIdMeal();

           // detailsPresenter.getMealsByID(idMeal);
        }
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
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



        // setting textview value




        //    txtTitleCard.setText(randomMeals.get(0).strMeal);


    }

}
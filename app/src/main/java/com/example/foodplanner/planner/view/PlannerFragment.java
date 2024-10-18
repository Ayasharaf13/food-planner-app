package com.example.foodplanner.planner.view;

import android.app.DatePickerDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.foodplanner.databinding.FragmentPlannerBinding;
import com.example.foodplanner.db.ConcreteLocalSource;
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.Repository;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.planner.presenter.PlannerPresenter;
import com.example.foodplanner.planner.presenter.PlannerPresenterInterface;
import com.example.foodplanner.save.view.InterfaceAdapter;

import java.util.Calendar;
import java.util.List;

public class PlannerFragment extends Fragment implements PlannerViewInterface{
    FragmentPlannerBinding binding;
    Spinner spinner;
    ImageView addMeal;
    Button btnRemove;
    String idMealPlanner;
    PlannerPresenterInterface plannerPresenter;
    PlannerAdapter plannerAdapter;
    RecyclerView spinnerRecycler;

    public PlannerFragment() {
        // Required empty public constructor
    }


    public static PlannerFragment newInstance(String param1, String param2) {
        PlannerFragment fragment = new PlannerFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        plannerPresenter= new PlannerPresenter(Repository.getInstance(FoodClient.getInstance(),
                ConcreteLocalSource.getInstance(requireContext())),this);

        InterfaceAdapter delteItemPlanner = (id)->{
           plannerPresenter.searchByIdDB(id).observe(this, new Observer<List<RandomMeal>>() {
               @Override
               public void onChanged(List<RandomMeal> meal) {
                   plannerPresenter.delete(meal);
               }
           });

        };

        plannerAdapter =  new PlannerAdapter(delteItemPlanner);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentPlannerBinding.inflate(inflater, container, false);
        return binding.getRoot();
        // return inflater.inflate(R.layout.fragment_planner, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

/*
    if (getArguments() != null) {

                    SaveFragmentArgs args = SaveFragmentArgs.fromBundle(getArguments());

                    idMealPlanner = args.getIdSavingFood();
                    plannerPresenter.getMealsPlanner(idMealPlanner);


                    Log.i("idmeal", idMealPlanner);


                }
 */
        binding.addMealSat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showCalender();  //show  // extract dat   //save dat & list  // show them
                // Retrieve the argument using Safe Args



            }
        });

    }

    void showCalender (){
        // Get an instance of the calendar
        Calendar c = Calendar.getInstance();

        // Get the year, month, and day
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a DatePickerDialog
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                // Pass the context (use YourActivityName.this for the activity)
                requireContext(),
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        Log.i("click calender","Done");
                        if (getArguments() != null) {
                            String dat = dayOfMonth + "-" + (monthOfYear + 1) + "-" + year;

                            plannerPresenter.setDat(dat);

                            PlannerFragmentArgs args = PlannerFragmentArgs.fromBundle(getArguments());
                              idMealPlanner = args.getIdMealPlanner();
                              plannerPresenter.getMealsPlanner(idMealPlanner);

                            Log.i("idmealAfterCalender", idMealPlanner);
                            // Set the date to the EditText


                        }




                    }
                },
                // Pass the year, month, and day for the DatePickerDialog
                year, month, day
        );

        // Show the DatePickerDialog

        datePickerDialog.show();

    }
   /* RecyclerView recyclerView = new RecyclerView(requireContext());
    LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
                         recyclerView.setLayoutManager(layoutManager);
                         plannerAdapter.submitList(randomMeals);
                        recyclerView.setAdapter(plannerAdapter);

    */
    @Override
    public void showMealsPlanner(LiveData<List<RandomMeal>> meals) {

        meals.observe(PlannerFragment.this, new Observer<List<RandomMeal>>() {
            @Override
            public void onChanged(List<RandomMeal> randomMeals) {

            Log.i("sizeplannermeals", randomMeals.toString()) ;


            }
        });

    }



}
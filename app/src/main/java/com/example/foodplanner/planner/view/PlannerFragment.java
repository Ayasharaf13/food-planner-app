package com.example.foodplanner.planner.view;

import android.app.DatePickerDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;

import com.example.foodplanner.databinding.FragmentPlannerBinding;
import com.example.foodplanner.db.ConcreteLocalSource;
import com.example.foodplanner.models.Day;
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.Repository;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.planner.presenter.PlannerPresenter;
import com.example.foodplanner.planner.presenter.PlannerPresenterInterface;
import com.example.foodplanner.save.view.InterfaceAdapter;
import com.example.foodplanner.utilizing.Constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class PlannerFragment extends Fragment implements PlannerViewInterface, SetCalender,OnDaySelected,OnDeleteItemPlanner {

    FragmentPlannerBinding binding;
    String idMealPlanner;

    PlannerPresenterInterface plannerPresenter;
    PlannerAdapterParent plannerAdapterParent;
    int position = -1;
     Day[] days;



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



        days = new Day[]{new Day(Constants.SATURDAY),new Day(Constants.SUNDAY),new Day(Constants.MONDAY),
        new Day(Constants.TUESDAY),new Day(Constants.WEDNESDAY),new Day(Constants.THURSDAY),new Day(Constants.FRIDAY)};


        plannerPresenter= new PlannerPresenter(Repository.getInstance(FoodClient.getInstance(),
                ConcreteLocalSource.getInstance(requireContext())),this);



       // plannerPresenter.saveDays(Collections.singletonList(new Day("Saved_Meals")));
      //  plannerPresenter.deleteRepeated();

            //  if(positionSpinnerSelected !=-1) {

        //  }

     //   plannerAdapter =  new PlannerAdapterChild(/*delteItemPlanner*/);
        plannerAdapterParent = new PlannerAdapterParent(requireContext(),this,this,plannerPresenter,this );


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
      //  new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false
        binding.recyclerViewParentPlanner.setLayoutManager(new LinearLayoutManager(requireContext(),RecyclerView.VERTICAL,false));
        plannerAdapterParent.submitList(Arrays.asList(days));
        binding.recyclerViewParentPlanner.setAdapter(plannerAdapterParent);


       /* plannerPresenter.getAllMealsSavedPlanner().observe(PlannerFragment.this, new Observer<List<RandomMeal>>() {
            @Override
            public void onChanged(List<RandomMeal> randomMeals) {
                plannerAdapter.submitList(randomMeals);

            }
        });

        */



        //plannerPresenter.saveDays(Arrays.asList(days));
      //  plannerPresenter.deleteRepeated();
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

                            String dat = dayOfMonth + "-" + (monthOfYear + 1) + "-" + year;

                             saveMealWithSetCalender(dat);
                             if(position !=-1) {
                                 plannerPresenter.getPositionDaySelected(position);
                             }

                    }
                },
                // Pass the year, month, and day for the DatePickerDialog
                year, month, day
        );

        // Show the DatePickerDialog

        datePickerDialog.show();

    }

    void saveMealWithSetCalender(String date){
        if (getArguments() != null) {

              plannerPresenter.setDat(date);

            PlannerFragmentArgs args = PlannerFragmentArgs.fromBundle(getArguments());
            idMealPlanner = args.getIdMealPlanner();

            plannerPresenter.getMealsPlanner(idMealPlanner);

        }
    }


    @Override
    public void showMealsPlanner(LiveData<List<RandomMeal>> meals) {

   /*     meals.observe(PlannerFragment.this, new Observer<List<RandomMeal>>() {
            @Override
            public void onChanged(List<RandomMeal> randomMeals) {

            Log.i("sizeplannermeals", randomMeals.toString()) ;


             //   plannerAdapter.submitList(randomMeals);


            }
        });

    */

    }


    @Override
    public void setCalenderForMeal() {
        showCalender();
    }

    @Override
    public void selectDay(int position) {

        this.position =  position;

    }


    @Override
    public InterfaceAdapter deleteItemPlanner() {
        InterfaceAdapter delteItemPlanner = (id)->{
            plannerPresenter.searchByIdDB(id).observe(this, new Observer<List<RandomMeal>>() {
                @Override
                public void onChanged(List<RandomMeal> meal) {
                    plannerPresenter.delete(meal);
                }
            });

        };
           return delteItemPlanner;
    }
}
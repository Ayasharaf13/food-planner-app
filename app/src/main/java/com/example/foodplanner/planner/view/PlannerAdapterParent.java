package com.example.foodplanner.planner.view;


import android.annotation.SuppressLint;
import android.content.Context;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodplanner.databinding.PlanneritemBinding;
import com.example.foodplanner.models.Day;
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.planner.presenter.PlannerPresenterInterface;
import com.example.foodplanner.utilizing.DayOfWeekMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlannerAdapterParent extends ListAdapter<Day,PlannerAdapterParent.ViewHolder> {
    // Cache to hold adapters by day index
    private final Map<Integer, PlannerAdapterChild> childAdaptersCache = new HashMap<>();

    boolean isExpanded  = false;

    PlannerAdapterChild plannerAdapter;
    SetCalender setCalender;
    Context context;
    OnDaySelected daySelected ;
 OnDeleteItemPlanner onDeleteItemPlanner;

    PlannerPresenterInterface plannerPresenter;


   public PlannerAdapterParent(Context  context, SetCalender setCalender, OnDaySelected onDaySelected,  PlannerPresenterInterface plannerPresenter,OnDeleteItemPlanner deleteItemPlanner) {
        super(new DayOfWeekDiffUtil());

         this.context =(AppCompatActivity) context;
         this.setCalender = setCalender;
         this.daySelected  = onDaySelected;
         this.onDeleteItemPlanner = deleteItemPlanner;
         this.plannerPresenter = plannerPresenter;
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
        
>>>>>>> b48bd45d26781cdb878e9e8b47ee3307893594f3
>>>>>>> 0d9ef6d7aa17e8c1afc0e5627dc28cab6e65f3b9

    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        PlanneritemBinding binding;

        LinearLayoutManager layoutManager;


        public ViewHolder(@NonNull PlanneritemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
            this.layoutManager = new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false);

        }

        void bind (String day){

            binding.textDay.setText(day);
       //     Log.i("createchilddddd",plannerAdapter.toString());


            binding.addMealToPlanner.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {

                   setCalender.setCalenderForMeal();
                   int position =   DayOfWeekMapper.getPositionForDay(day);
                   daySelected.selectDay(position);


               }

           });

           binding.spinnerImage.setOnClickListener(new View.OnClickListener() {


               @Override
               public void onClick(View view) {
                   int position =   DayOfWeekMapper.getPositionForDay(day);

                   if(isExpanded){

                       binding.recyclerChildPlanner.setVisibility(View.GONE);
                       binding.spinnerImage.setRotation(0);

                   }else{
                       plannerAdapter=  childAdaptersCache.get(position);
                       if(plannerAdapter== null){
                           plannerAdapter = new PlannerAdapterChild(onDeleteItemPlanner.deleteItemPlanner());
                           childAdaptersCache.put(position,plannerAdapter);
                       }

                       binding.recyclerChildPlanner.setLayoutManager(layoutManager);
                       Log.i("childinstanceadapterNum:",plannerAdapter.toString());

                       //  spinnerSelected.SpinnerSelected(position);
                       plannerPresenter.getAllSavePlannerBySelectedDay(position).observe((AppCompatActivity)context, new Observer<List<RandomMeal>>() {
                           @Override
                           public void onChanged(List<RandomMeal> randomMeals) {
                               plannerAdapter.submitList(randomMeals);
                               binding.recyclerChildPlanner.setAdapter(plannerAdapter);

                               Log.i("dayWithClickSpinner:",day);

                           }
                       });
                       binding.recyclerChildPlanner.setVisibility(View.VISIBLE);

                       binding.spinnerImage.setRotation(180);


                   }
                  isExpanded = !isExpanded;

               }


           });

        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        PlanneritemBinding binding;
        binding = PlanneritemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

         Day currentObj = getItem(position);
         Log.i("day:",currentObj.dayName);
         holder.bind(currentObj.dayName  );


    }


            static class DayOfWeekDiffUtil
            extends DiffUtil.ItemCallback<Day> {

        @Override
        public boolean areItemsTheSame(@NonNull Day oldItem, @NonNull Day newItem) {
            return oldItem == newItem;
        }

        @SuppressLint("DiffUtilEquals")
        @Override
        public boolean areContentsTheSame(@NonNull Day oldItem, @NonNull Day newItem) {
            return oldItem.equals(newItem);
        }
    }




}

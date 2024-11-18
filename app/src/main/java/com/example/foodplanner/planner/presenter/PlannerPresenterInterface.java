package com.example.foodplanner.planner.presenter;


import androidx.lifecycle.LiveData;

<<<<<<< HEAD
import com.example.foodplanner.models.Day;
=======
<<<<<<< HEAD
import com.example.foodplanner.models.Day;
=======
<<<<<<< HEAD
import com.example.foodplanner.models.Day;
=======
>>>>>>> eca1561c37458cd3dcb6567e08125bd49145daf2
>>>>>>> b48bd45d26781cdb878e9e8b47ee3307893594f3
>>>>>>> 0d9ef6d7aa17e8c1afc0e5627dc28cab6e65f3b9
import com.example.foodplanner.models.RandomMeal;

import java.util.List;

public interface PlannerPresenterInterface {


    public String getDat() ;


    public void setDat(String dat) ;


     void getMealsPlanner(String id );

     LiveData<List<RandomMeal>> searchByIdDB (String id);
     void delete (List<RandomMeal> meal);

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b48bd45d26781cdb878e9e8b47ee3307893594f3
>>>>>>> 0d9ef6d7aa17e8c1afc0e5627dc28cab6e65f3b9
     LiveData<List<RandomMeal>> getAllMealsSavedPlanner();

     void getPositionDaySelected (int position);



     void saveDays(List <Day> days);
     void deleteRepeated();

    LiveData<List<RandomMeal>> getAllSavePlannerBySelectedDay(int id);

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> eca1561c37458cd3dcb6567e08125bd49145daf2
>>>>>>> b48bd45d26781cdb878e9e8b47ee3307893594f3
>>>>>>> 0d9ef6d7aa17e8c1afc0e5627dc28cab6e65f3b9
}

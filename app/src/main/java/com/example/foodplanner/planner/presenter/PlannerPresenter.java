package com.example.foodplanner.planner.presenter;


import android.util.Log;

import androidx.lifecycle.LiveData;

<<<<<<< HEAD
import com.example.foodplanner.models.Day;
=======
>>>>>>> eca1561c37458cd3dcb6567e08125bd49145daf2
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.RepositoryInterface;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.network.NetworkDelegate;
import com.example.foodplanner.planner.view.OnDaySelected;
import com.example.foodplanner.planner.view.PlannerViewInterface;

import java.util.List;

<<<<<<< HEAD
public class PlannerPresenter implements PlannerPresenterInterface ,NetworkDelegate  {
=======
public class PlannerPresenter implements PlannerPresenterInterface ,NetworkDelegate{

>>>>>>> eca1561c37458cd3dcb6567e08125bd49145daf2

    RepositoryInterface repo;
    PlannerViewInterface plannerViewInterface;
    String dat;
<<<<<<< HEAD
    int position =-1;
    int positionForDropList=-1;
=======


>>>>>>> eca1561c37458cd3dcb6567e08125bd49145daf2


    public PlannerPresenter (RepositoryInterface repo, PlannerViewInterface plannerViewInterface){
        this.repo = repo;
        this.plannerViewInterface = plannerViewInterface;
    }


    @Override
    public void OnSuccessResult(List<RandomMeal> listOfMeals) {
        Log.i("calenderdatePos: ",position + "");
        listOfMeals.get(0).date = getDat() ;
        listOfMeals.get(0).setPlanner(true);
        listOfMeals.get(0).setSave(false);

<<<<<<< HEAD
        if(position !=-1) {
            listOfMeals.get(0).setId(position);
        }
        repo.saveMeal(listOfMeals);
=======
        listOfMeals.get(0).date = getDat() ;
        listOfMeals.get(0).setPlanner(true);
        listOfMeals.get(0).setSave(false);

        Log.i("calenderdate: ",getDat());

        repo.saveMeal(listOfMeals);
        plannerViewInterface.showMealsPlanner(repo.getAllMealFromStoragePlanner());


      //  repo.saveMeal(listOfMeals);
       // plannerViewInterface.showMealsPlanner(repo.getAllMealFromStorage());

>>>>>>> eca1561c37458cd3dcb6567e08125bd49145daf2
    }



    @Override
    public void OnFailureResult(String errorMass) {

        Log.i("failPlanner",errorMass);

    }


    @Override
    public String getDat() {
        return dat;
    }

    @Override
    public void setDat(String dat) {
        this.dat=dat;
    }

    @Override
    public void getMealsPlanner(String id) {

        repo.getMealByIdNetwork(FoodClient.getInstance().getApiService().getMealsById(id),this);
    }

    @Override
    public LiveData<List<RandomMeal>> searchByIdDB(String id) {
        return repo.searchByIdPlanner(id);
    }

    @Override
    public void delete(List<RandomMeal> meal) {

         repo.deleteMeal(meal);
    }

<<<<<<< HEAD
    @Override
    public LiveData<List<RandomMeal>> getAllMealsSavedPlanner() {
        return repo.getAllMealFromStoragePlanner();
    }

    @Override
    public void getPositionDaySelected(int position) {
        this.position = position;
        Log.i("calenderdatePosm",position + "");

    }



    @Override
    public void saveDays(List<Day> days) {

        repo.saveDay(days);
    }

    @Override
    public void deleteRepeated() {
        repo.deleteRepeatedData();
    }

    @Override
    public LiveData<List<RandomMeal>> getAllSavePlannerBySelectedDay(int id) {
        return repo.getAllMealsSavedPlannerBySelectDay(id);
    }


=======



>>>>>>> eca1561c37458cd3dcb6567e08125bd49145daf2
}

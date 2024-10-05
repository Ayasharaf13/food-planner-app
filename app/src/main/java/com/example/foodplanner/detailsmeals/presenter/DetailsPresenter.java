package com.example.foodplanner.detailsmeals.presenter;

import android.util.Log;

import com.example.foodplanner.detailsmeals.view.DetailsViewInterface;
import com.example.foodplanner.home.view.HomeViewInterface;
<<<<<<< HEAD
import com.example.foodplanner.models.Category;
=======
<<<<<<< HEAD
import com.example.foodplanner.models.Category;
=======
<<<<<<< HEAD
import com.example.foodplanner.models.Category;
=======
<<<<<<< HEAD
import com.example.foodplanner.models.Category;
=======
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.RepositoryInterface;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.network.NetworkDelegate;

import java.util.List;

public class DetailsPresenter  implements DetailsPresenterInterface , NetworkDelegate {

RepositoryInterface repo;
DetailsViewInterface view;

 public  DetailsPresenter(RepositoryInterface repo,DetailsViewInterface detailsView){
     this.repo=repo;
     this.view=detailsView;

 }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
    @Override
    public void getMealsByID(String id) {
        repo.getMealByIdNetwork(FoodClient.getInstance().getApiService().getMealsById(id),this);

    }

<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
    @Override
    public void OnSuccessResult(List<RandomMeal> listOfMeals) {
       view.showMealsById(listOfMeals);

    }

    @Override
    public void OnFailureResult(String errorMass) {
        Log.i("errorMealsById",errorMass);
    }
<<<<<<< HEAD


=======
<<<<<<< HEAD


=======
<<<<<<< HEAD


=======
<<<<<<< HEAD


=======
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
}

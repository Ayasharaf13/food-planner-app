package com.example.foodplanner.save.presenter;

<<<<<<< HEAD
import androidx.lifecycle.LiveData;

=======
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8
import com.example.foodplanner.models.RandomMeal;

import java.util.List;

public interface SavePresenterInterface {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8



       public void getMealsByID(String id);
       void delete (List<RandomMeal> meal);
<<<<<<< HEAD
      LiveData<List<RandomMeal>> searchById(String id);
=======
=======


       void  showMealSaved ();
       void saveMeal (String id );
       void deleteMeal (String id);
>>>>>>> 39bf4cf8ea1bfdb6b7aa4cf2b0d2b189bab7b0f9
>>>>>>> 810dc8649c025b71cee37d3d06ad0af310f877b8



}

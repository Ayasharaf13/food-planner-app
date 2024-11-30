package com.example.foodplanner.search.view;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.foodplanner.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class SearchFragmentDirections {
  private SearchFragmentDirections() {
  }

  @NonNull
  public static ActionSearchFragmentToMealCategoryFragment actionSearchFragmentToMealCategoryFragment(
      ) {
    return new ActionSearchFragmentToMealCategoryFragment();
  }

  @NonNull
  public static ActionSearchFragmentToMealCountryFragment actionSearchFragmentToMealCountryFragment(
      ) {
    return new ActionSearchFragmentToMealCountryFragment();
  }

  @NonNull
  public static ActionSearchFragmentToIngredientsMealsFragment actionSearchFragmentToIngredientsMealsFragment(
      ) {
    return new ActionSearchFragmentToIngredientsMealsFragment();
  }

  @NonNull
  public static NavDirections actionSearchFragmentToSearchResultFragment() {
    return new ActionOnlyNavDirections(R.id.action_searchFragment_to_searchResultFragment);
  }

  public static class ActionSearchFragmentToMealCategoryFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionSearchFragmentToMealCategoryFragment() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSearchFragmentToMealCategoryFragment setIdCategory(@NonNull String idCategory) {
      if (idCategory == null) {
        throw new IllegalArgumentException("Argument \"idCategory\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("idCategory", idCategory);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("idCategory")) {
        String idCategory = (String) arguments.get("idCategory");
        __result.putString("idCategory", idCategory);
      } else {
        __result.putString("idCategory", "Seafood");
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_searchFragment_to_mealCategoryFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getIdCategory() {
      return (String) arguments.get("idCategory");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionSearchFragmentToMealCategoryFragment that = (ActionSearchFragmentToMealCategoryFragment) object;
      if (arguments.containsKey("idCategory") != that.arguments.containsKey("idCategory")) {
        return false;
      }
      if (getIdCategory() != null ? !getIdCategory().equals(that.getIdCategory()) : that.getIdCategory() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getIdCategory() != null ? getIdCategory().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionSearchFragmentToMealCategoryFragment(actionId=" + getActionId() + "){"
          + "idCategory=" + getIdCategory()
          + "}";
    }
  }

  public static class ActionSearchFragmentToMealCountryFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionSearchFragmentToMealCountryFragment() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSearchFragmentToMealCountryFragment setCountryName(@NonNull String countryName) {
      if (countryName == null) {
        throw new IllegalArgumentException("Argument \"countryName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("countryName", countryName);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("countryName")) {
        String countryName = (String) arguments.get("countryName");
        __result.putString("countryName", countryName);
      } else {
        __result.putString("countryName", "Canadian");
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_searchFragment_to_mealCountryFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getCountryName() {
      return (String) arguments.get("countryName");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionSearchFragmentToMealCountryFragment that = (ActionSearchFragmentToMealCountryFragment) object;
      if (arguments.containsKey("countryName") != that.arguments.containsKey("countryName")) {
        return false;
      }
      if (getCountryName() != null ? !getCountryName().equals(that.getCountryName()) : that.getCountryName() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getCountryName() != null ? getCountryName().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionSearchFragmentToMealCountryFragment(actionId=" + getActionId() + "){"
          + "countryName=" + getCountryName()
          + "}";
    }
  }

  public static class ActionSearchFragmentToIngredientsMealsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionSearchFragmentToIngredientsMealsFragment() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSearchFragmentToIngredientsMealsFragment setNameIngredients(
        @NonNull String nameIngredients) {
      if (nameIngredients == null) {
        throw new IllegalArgumentException("Argument \"nameIngredients\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("nameIngredients", nameIngredients);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("nameIngredients")) {
        String nameIngredients = (String) arguments.get("nameIngredients");
        __result.putString("nameIngredients", nameIngredients);
      } else {
        __result.putString("nameIngredients", "chicken_breast");
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_searchFragment_to_ingredientsMealsFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getNameIngredients() {
      return (String) arguments.get("nameIngredients");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionSearchFragmentToIngredientsMealsFragment that = (ActionSearchFragmentToIngredientsMealsFragment) object;
      if (arguments.containsKey("nameIngredients") != that.arguments.containsKey("nameIngredients")) {
        return false;
      }
      if (getNameIngredients() != null ? !getNameIngredients().equals(that.getNameIngredients()) : that.getNameIngredients() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getNameIngredients() != null ? getNameIngredients().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionSearchFragmentToIngredientsMealsFragment(actionId=" + getActionId() + "){"
          + "nameIngredients=" + getNameIngredients()
          + "}";
    }
  }
}

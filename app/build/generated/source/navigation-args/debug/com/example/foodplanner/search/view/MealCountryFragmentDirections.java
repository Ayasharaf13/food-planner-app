package com.example.foodplanner.search.view;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.foodplanner.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class MealCountryFragmentDirections {
  private MealCountryFragmentDirections() {
  }

  @NonNull
  public static ActionMealCountryFragmentToDetailsMealFragment actionMealCountryFragmentToDetailsMealFragment(
      @NonNull String idMeal) {
    return new ActionMealCountryFragmentToDetailsMealFragment(idMeal);
  }

  @NonNull
  public static ActionMealCountryFragmentToDetailsMealFragment2 actionMealCountryFragmentToDetailsMealFragment2(
      @NonNull String idMeal) {
    return new ActionMealCountryFragmentToDetailsMealFragment2(idMeal);
  }

  public static class ActionMealCountryFragmentToDetailsMealFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionMealCountryFragmentToDetailsMealFragment(@NonNull String idMeal) {
      if (idMeal == null) {
        throw new IllegalArgumentException("Argument \"idMeal\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("idMeal", idMeal);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionMealCountryFragmentToDetailsMealFragment setIdMeal(@NonNull String idMeal) {
      if (idMeal == null) {
        throw new IllegalArgumentException("Argument \"idMeal\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("idMeal", idMeal);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("idMeal")) {
        String idMeal = (String) arguments.get("idMeal");
        __result.putString("idMeal", idMeal);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_mealCountryFragment_to_detailsMealFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getIdMeal() {
      return (String) arguments.get("idMeal");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionMealCountryFragmentToDetailsMealFragment that = (ActionMealCountryFragmentToDetailsMealFragment) object;
      if (arguments.containsKey("idMeal") != that.arguments.containsKey("idMeal")) {
        return false;
      }
      if (getIdMeal() != null ? !getIdMeal().equals(that.getIdMeal()) : that.getIdMeal() != null) {
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
      result = 31 * result + (getIdMeal() != null ? getIdMeal().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionMealCountryFragmentToDetailsMealFragment(actionId=" + getActionId() + "){"
          + "idMeal=" + getIdMeal()
          + "}";
    }
  }

  public static class ActionMealCountryFragmentToDetailsMealFragment2 implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionMealCountryFragmentToDetailsMealFragment2(@NonNull String idMeal) {
      if (idMeal == null) {
        throw new IllegalArgumentException("Argument \"idMeal\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("idMeal", idMeal);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionMealCountryFragmentToDetailsMealFragment2 setIdMeal(@NonNull String idMeal) {
      if (idMeal == null) {
        throw new IllegalArgumentException("Argument \"idMeal\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("idMeal", idMeal);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("idMeal")) {
        String idMeal = (String) arguments.get("idMeal");
        __result.putString("idMeal", idMeal);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_mealCountryFragment_to_detailsMealFragment2;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getIdMeal() {
      return (String) arguments.get("idMeal");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionMealCountryFragmentToDetailsMealFragment2 that = (ActionMealCountryFragmentToDetailsMealFragment2) object;
      if (arguments.containsKey("idMeal") != that.arguments.containsKey("idMeal")) {
        return false;
      }
      if (getIdMeal() != null ? !getIdMeal().equals(that.getIdMeal()) : that.getIdMeal() != null) {
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
      result = 31 * result + (getIdMeal() != null ? getIdMeal().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionMealCountryFragmentToDetailsMealFragment2(actionId=" + getActionId() + "){"
          + "idMeal=" + getIdMeal()
          + "}";
    }
  }
}

package com.example.foodplanner.detailsmeals.view;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.foodplanner.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailsMealFragmentDirections {
  private DetailsMealFragmentDirections() {
  }

  @NonNull
  public static ActionDetailsMealFragmentToPlannerFragment actionDetailsMealFragmentToPlannerFragment(
      ) {
    return new ActionDetailsMealFragmentToPlannerFragment();
  }

  @NonNull
  public static NavDirections actionDetailsMealFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_detailsMealFragment_to_homeFragment);
  }

  public static class ActionDetailsMealFragmentToPlannerFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionDetailsMealFragmentToPlannerFragment() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionDetailsMealFragmentToPlannerFragment setIdMealPlanner(
        @Nullable String idMealPlanner) {
      this.arguments.put("idMealPlanner", idMealPlanner);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("idMealPlanner")) {
        String idMealPlanner = (String) arguments.get("idMealPlanner");
        __result.putString("idMealPlanner", idMealPlanner);
      } else {
        __result.putString("idMealPlanner", null);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_detailsMealFragment_to_plannerFragment;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public String getIdMealPlanner() {
      return (String) arguments.get("idMealPlanner");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionDetailsMealFragmentToPlannerFragment that = (ActionDetailsMealFragmentToPlannerFragment) object;
      if (arguments.containsKey("idMealPlanner") != that.arguments.containsKey("idMealPlanner")) {
        return false;
      }
      if (getIdMealPlanner() != null ? !getIdMealPlanner().equals(that.getIdMealPlanner()) : that.getIdMealPlanner() != null) {
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
      result = 31 * result + (getIdMealPlanner() != null ? getIdMealPlanner().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionDetailsMealFragmentToPlannerFragment(actionId=" + getActionId() + "){"
          + "idMealPlanner=" + getIdMealPlanner()
          + "}";
    }
  }
}
